package com.example.tang5.imsdk.im;

import com.example.tang5.imsdk.im.channel.in.LoginResoponsHandler;
import com.example.tang5.imsdk.im.channel.in.MessageRequestHandler;
import com.example.tang5.imsdk.im.channel.in.PacketDecoder;
import com.example.tang5.imsdk.im.channel.out.PacketEncoder;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

/**
 * @author：thf on 2019/1/23 0023 14:01
 * <p>
 * 邮箱：tang5011235@163.com
 * <p>
 * name:IMSdk
 * <p>
 * version:
 * @description:
 */
public class NettyClient {
	public static final NettyClient ourInstance = new NettyClient();
	private static final int MAX_RETRY = 5;
	private Bootstrap mBootstrap;

	public static NettyClient getInstance() {
		return ourInstance;
	}

	private NettyClient() {
		initNetty();
	}

	private void initNetty() {
		NioEventLoopGroup workGroup = new NioEventLoopGroup();
		mBootstrap = new Bootstrap();
		mBootstrap.option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 10000)
				.option(ChannelOption.SO_KEEPALIVE, true)
				.option(ChannelOption.TCP_NODELAY, true);
		mBootstrap.group(workGroup)
				.channel(NioSocketChannel.class)
				.handler(new ChannelInitializer<SocketChannel>() {
					@Override
					protected void initChannel(SocketChannel ch) throws Exception {
						//业务逻辑处理
						ch.pipeline().addLast(new LengthFieldBasedFrameDecoder(400 * 1024, 0, 4, -4, 0));
						ch.pipeline().addLast(new PacketDecoder());
						ch.pipeline().addLast(new LoginResoponsHandler());
						ch.pipeline().addLast(new MessageRequestHandler());
						ch.pipeline().addLast(new PacketEncoder());
					}
				});
	}

	/**
	 * 118.178.156.71    6002
	 *
	 * @param host
	 * @param port
	 */
	public void connect(final String host, final int port) {
		System.out.println(host);
		System.out.println(port);
		mBootstrap.connect(host, port).addListener(new ChannelFutureListener() {
			@Override
			public void operationComplete(ChannelFuture future) throws Exception {
				if (future.isSuccess()) {
					System.out.println("连接成功!");
				} else {
					System.err.println("连接失败，开始重连");
					connect(host, port);
				}
			}
		});
	}

	public void connect(final String host, final int port, final int retry) {
		mBootstrap.connect(host, port).addListener(new ChannelFutureListener() {
			@Override
			public void operationComplete(ChannelFuture future) throws Exception {
				if (future.isSuccess()) {
					System.out.println("连接成功!");
				} else if (retry == 0) {
					System.err.println("重试次数已用完，放弃连接！");
				} else {
					// 第几次重连
					int order = (MAX_RETRY - retry) + 1;
					// 本次重连的间隔
					final int delay = 1 << order;
					System.err.println("地址：" + host + ":" + port);
					System.err.println(new Date() + ": 连接失败，第" + order + "次重连……");
					mBootstrap.config().group().schedule(new Runnable() {
						@Override
						public void run() {
							connect(host, port, retry - 1);
						}
					}, delay, TimeUnit.SECONDS);
				}
			}
		});
	}
}

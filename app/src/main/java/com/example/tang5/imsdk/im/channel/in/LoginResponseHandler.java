package com.example.tang5.imsdk.im.channel.in;

import android.util.Log;

import com.example.tang5.imsdk.App;
import com.example.tang5.imsdk.im.packet.Command;
import com.example.tang5.imsdk.im.packet.LoginRequestPacket;
import com.example.tang5.imsdk.im.packet.PacketCoder;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author：thf on 2019/1/24 0024 10:19
 * <p>
 * 邮箱：tang5011235@163.com
 * <p>
 * name:IMSdk
 * <p>
 * version:
 * @description:
 */
public class LoginResponseHandler extends SimpleChannelInboundHandler<LoginRequestPacket<Loginbean>> {
	private static final String TAG = "LoginResponseHandler";
	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		// 创建登录对象
		Loginbean loginbean = new Loginbean(App.instance.getDeviceId(), App.instance.getSessionId(),5);
		LoginRequestPacket<Loginbean> loginRequestPacket = new LoginRequestPacket<>(Command.LOGIN, 1000, loginbean);
		System.out.println(loginRequestPacket);
		ByteBuf buffer = ctx.alloc().buffer();
		PacketCoder.Coder.encode(loginRequestPacket, buffer);

		// 写数据
		ctx.writeAndFlush(buffer);
	}

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, LoginRequestPacket<Loginbean> msg) throws Exception {
		Log.e(TAG, "获取到的登录commandId: "+msg.getCommand());
	}
}

package com.example.tang5.imsdk.im.channel.in;

import com.example.tang5.imsdk.im.packet.MessageRequestPacket;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author：thf on 2019/1/24 0024 10:36
 * <p>
 * 邮箱：tang5011235@163.com
 * <p>
 * name:IMSdk
 * <p>
 * version:
 * @description:
 */
public class MessageRequestHandler extends SimpleChannelInboundHandler<MessageRequestPacket<MessageBean>> {
	@Override
	protected void channelRead0(ChannelHandlerContext ctx, MessageRequestPacket<MessageBean> msg) throws Exception {

	}
}

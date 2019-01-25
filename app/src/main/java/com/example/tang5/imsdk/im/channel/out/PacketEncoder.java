package com.example.tang5.imsdk.im.channel.out;

import com.example.tang5.imsdk.im.packet.IPacket;
import com.example.tang5.imsdk.im.packet.PacketCoder;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @author：thf on 2019/1/24 0024 10:11
 * <p>
 * 邮箱：tang5011235@163.com
 * <p>
 * name:IMSdk
 * <p>
 * version:
 * @description:
 */
public class PacketEncoder extends MessageToByteEncoder<IPacket<Integer>> {
	@Override
	protected void encode(ChannelHandlerContext ctx, IPacket<Integer> msg, ByteBuf out) throws Exception {
		PacketCoder.Coder.encode(msg, out);
	}
}

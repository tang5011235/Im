package com.example.tang5.imsdk.im.packet;

import android.util.Log;

import com.example.tang5.imsdk.im.CommandClassMapping;
import com.example.tang5.imsdk.im.bean.BaseResponseBean;
import com.example.tang5.imsdk.im.packet.serializer.ISerializer;

import io.netty.buffer.ByteBuf;

/**
 * @author：thf on 2019/1/23 0023 15:21
 * <p>
 * 邮箱：tang5011235@163.com
 * <p>
 * name:IMSdk
 * <p>
 * version:
 * @description: 包解析器
 */
public class PacketCoder implements IPacketCoder {
	private static final String TAG = "PacketCoder";

	private ISerializer mISerializer;

	public static PacketCoder Coder;

	private PacketCoder() {
		this.mISerializer = ISerializer.DEFAULT;
	}

	public static void initCoder() {
		if (Coder != null) {
			throw new IllegalStateException("PacketCoder is already exit,it can not init secondly");
		}
		Coder = new PacketCoder();
	}

	public void setISerializer(ISerializer serializer) {
		mISerializer = serializer;
	}


	@Override
	public <T extends IPacket> void encode(T packet, ByteBuf byteBuf) {
		BasePacket basePacket = (BasePacket) packet;

		//总包长度4byte
		byteBuf.writeInt(basePacket.getPacketLength());
		//头的长度2byte
		byteBuf.writeShort(basePacket.getHead().getLength());
		//版本号2byte
		byteBuf.writeShort(basePacket.getHead().getVersion());
		//指令4byte
		byteBuf.writeInt((Integer) packet.getCommand());
		//消息id 4byte
		byteBuf.writeInt(basePacket.getHead().getMsgId());
		//请求体body
		byteBuf.writeBytes(basePacket.getBodyBytes());

		byte[] bodyBytes = new byte[byteBuf.readableBytes()];
		byteBuf.readBytes(bodyBytes);
		byteBuf.resetReaderIndex();
		Log.d(TAG, "Im 分装后的发送数据(decode)：" + new String(bodyBytes));
	}

	@Override
	public BasePacket decode(ByteBuf byteBuf) {
		//总包长
		int packegeLength = byteBuf.readInt();
		//头长度
		short headLength = byteBuf.readShort();
		//版本号
		short version = byteBuf.readShort();
		//指令
		final int command = byteBuf.readInt();
		//消息id
		int msgId = byteBuf.readInt();
		//读取包
		byte[] bodyBytes = new byte[byteBuf.readableBytes()];
		byteBuf.readBytes(bodyBytes);
		BaseResponseBean body = mISerializer.deserialize(CommandClassMapping.getMappingClass(command), bodyBytes);
		//分装为packet对象
		final Head head = new Head(command, msgId);
		BasePacket basePacket = new BasePacket(head, body) {
			@Override
			public Integer getCommand() {
				return command;
			}
		};
		body.mBasePacket = basePacket;
		Log.d(TAG, "Im 响应数据(decode)：" + basePacket);

		return basePacket;
	}
}

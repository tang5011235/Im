package com.example.tang5.imsdk.im.packet;

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
		byteBuf.writeShort(basePacket.getHead().getMsgId());
		//请求体body
		byteBuf.writeBytes(basePacket.getBodyBytes());
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

		int bodyLength = packegeLength - headLength;
		byte[] bodyBytes = new byte[bodyLength];
		byteBuf.readBytes(byteBuf.readableBytes());
		Object body = mISerializer.deserialize(bodyBytes);
		final Head head = new Head(command, msgId);
		BasePacket basePacket = new BasePacket(head,body) {
			@Override
			public Object getCommand() {
				return command;
			}
		};
		/*TypeToken<T> tTypeToken = new TypeToken<T>() {
		};
		Class<? super T> rawType = tTypeToken.getRawType();
		try {
			Constructor<? super T> constructor = rawType.getConstructor();
			T packet = (T) constructor.newInstance(head, body);
			return packet;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}*/
		return basePacket;
	}
}

package com.example.tang5.imsdk.im.packet;

/**
 * @author：thf on 2019/1/24 0024 10:37
 * <p>
 * 邮箱：tang5011235@163.com
 * <p>
 * name:IMSdk
 * <p>
 * version:
 * @description:
 */
public class MessageRequestPacket<T> extends BasePacket<T> {
	public MessageRequestPacket(Head head, T body) {
		super(head, body);
	}

	public MessageRequestPacket(int command, int msgId, T body) {
		super(command, msgId, body);
	}

	@Override
	public Integer getCommand() {
		return null;
	}
}

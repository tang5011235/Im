package com.example.tang5.imsdk.im.packet;

/**
 * @author：thf on 2019/1/23 0023 15:09
 * <p>
 * 邮箱：tang5011235@163.com
 * <p>
 * name:IMSdk
 * <p>
 * version:
 * @description:
 */
public class LoginRequestPacket<T> extends BasePacket<T> {
	public LoginRequestPacket(Head head, T body) {
		super(head, body);
	}

	public LoginRequestPacket(int command, int msgId, T body) {
		super(command, msgId, body);
	}

	@Override
	public Integer getCommand() {
		return Command.LOGIN;
	}
}

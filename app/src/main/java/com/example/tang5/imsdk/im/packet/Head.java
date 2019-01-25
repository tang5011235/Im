package com.example.tang5.imsdk.im.packet;

/**
 * @author：thf on 2019/1/23 0023 16:41
 * <p>
 * 邮箱：tang5011235@163.com
 * <p>
 * name:IMSdk
 * <p>
 * version:
 * @description: 包头
 */
public class Head {
	private int packetLength;
	private short length = 16;
	private short version = 1;
	private int command;
	private int msgId;


	public Head() {
	}


	public Head(int command, int msgId) {
		this.command = command;
		this.msgId = msgId;
	}

	public int getPacketLength() {
		return packetLength;
	}

	public void setPacketLength(int packetLength) {
		this.packetLength = packetLength;
	}

	public short getLength() {
		return length;
	}

	public short getVersion() {
		return version;
	}

	public int getCommand() {
		return command;
	}

	public int getMsgId() {
		return msgId;
	}

	public void setMsgId(int msgId) {
		this.msgId = msgId;
	}

	public void setCommand(int command) {
		this.command = command;
	}


	@Override
	public String toString() {
		return "Head{" +
				"packetLength=" + packetLength +
				", length=" + length +
				", version=" + version +
				", command=" + command +
				", msgId=" + msgId +
				'}';
	}
}

package com.example.tang5.imsdk.im.packet;

/**
 * @author：thf on 2019/1/23 0023 15:05
 * <p>
 * 邮箱：tang5011235@163.com
 * <p>
 * name:IMSdk
 * <p>
 * version:
 * @description:
 */
public abstract class BasePacket implements IPacket<Integer> {

	Head mHead;
	Object mBody;
	private BaseWrapBody mWrapBody;
	private int mPacketLength;

	public BasePacket(Head head, Object body) {
		this.mHead = head;
		this.mBody = body;
		this.mWrapBody = new BaseWrapBody(body);
		this.mPacketLength = mHead.getLength() + mWrapBody.getBodylenth();
		this.mHead.setPacketLength(this.mPacketLength);
	}

	public BasePacket(int command, int msgId, Object body) {
		this.mHead = new Head(command, msgId);
		this.mBody = body;
		this.mWrapBody = new BaseWrapBody(body);
		this.mPacketLength = mHead.getLength() + mWrapBody.getBodylenth();
		this.mHead.setPacketLength(this.mPacketLength);
	}

	/**
	 * 获取包体
	 *
	 * @return 包体
	 */
	public <T> T getBody() {
		return (T) mBody;
	}

	/**
	 * 获取获取
	 *
	 * @return 包头
	 */
	public Head getHead() {
		return mHead;
	}

	/**
	 * 获取body的字节数组
	 *
	 * @return body字节数组
	 */
	public byte[] getBodyBytes() {
		return mWrapBody.getBodyBytes();
	}

	/**
	 * 获取body长度
	 *
	 * @return body长度
	 */
	public int bodyLength() {
		return mWrapBody.getBodylenth();
	}


	/**
	 * 计算总包长度
	 *
	 * @return 总包长度
	 */
	public int getPacketLength() {
		return mPacketLength;
	}


	@Override
	public String toString() {
		return "BasePacket{" +
				"mHead=" + mHead +
				", mBody=" + mBody +
				", mWrapBody=" + mWrapBody +
				", mPacketLength=" + mPacketLength +
				'}';
	}
}

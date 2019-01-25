package com.example.tang5.imsdk.im.packet;

import com.example.tang5.imsdk.im.packet.serializer.ISerializer;

import java.util.Arrays;

/**
 * @author：thf on 2019/1/23 0023 20:14
 * <p>
 * 邮箱：tang5011235@163.com
 * <p>
 * name:IMSdk
 * <p>
 * version:
 * @description: im message body
 */
public class BaseWrapBody {
	private int bodylenth;
	private byte[] bodyBytes;
	private Object body;

	public BaseWrapBody(Object body) {
		this.body = body;
		this.bodyBytes = ISerializer.DEFAULT.serialize(body);
		this.bodylenth = bodyBytes.length;
	}

	public int getBodylenth() {
		return bodylenth;
	}

	public byte[] getBodyBytes() {
		return bodyBytes;
	}

	public Object getBody() {
		return body;
	}


	@Override
	public String toString() {
		return "BaseWrapBody{" +
				"bodylenth=" + bodylenth +
				", bodyBytes=" + Arrays.toString(bodyBytes) +
				", body=" + body +
				'}';
	}
}

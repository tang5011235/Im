package com.example.tang5.imsdk.im.packet.serializer;

import com.example.tang5.imsdk.im.bean.BaseResponseBean;
import com.example.tang5.imsdk.im.packet.serializer.imp.JSONISerializer;

public interface ISerializer {
	/**
	 * json 序列化
	 */
	byte JSON_SERIALIZER = 1;

	ISerializer DEFAULT = new JSONISerializer();

	/**
	 * 序列化算法
	 */
	byte getSerializerAlgorithm();

	/**
	 * java 对象转换成二进制
	 */
	byte[] serialize(Object object);

	/**
	 * 二进制转换成 java 对象
	 */
	<T extends BaseResponseBean> T deserialize(Class<T> clazz, byte[] bytes);
}
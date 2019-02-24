package com.example.tang5.imsdk.im.packet.serializer.imp;

import com.example.tang5.imsdk.App;
import com.example.tang5.imsdk.im.bean.BaseResponseBean;
import com.example.tang5.imsdk.im.packet.serializer.ISerializer;
import com.example.tang5.imsdk.im.packet.serializer.SerializerAlgorithm;

import java.nio.charset.Charset;

public class JSONISerializer implements ISerializer {

	@Override
	public byte getSerializerAlgorithm() {

		return SerializerAlgorithm.JSON;
	}

	@Override
	public byte[] serialize(Object object) {
		return App.mGson.toJson(object).getBytes();
	}

	@Override
	public <T extends BaseResponseBean> T deserialize(Class<T> clazz, byte[] bytes) {

		return App.mGson.fromJson(new String(bytes,Charset.forName("UTF-8")), clazz);
	}
}
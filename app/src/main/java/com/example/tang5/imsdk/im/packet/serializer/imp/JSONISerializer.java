package com.example.tang5.imsdk.im.packet.serializer.imp;

import com.example.tang5.imsdk.App;
import com.example.tang5.imsdk.im.packet.serializer.ISerializer;
import com.example.tang5.imsdk.im.packet.serializer.SerializerAlgorithm;
import com.google.gson.reflect.TypeToken;

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
	public <T> T deserialize(Class<T> clazz, byte[] bytes) {

		return App.mGson.fromJson(new String(bytes,Charset.forName("UTF-8")), clazz);
	}

	@Override
	public <T> T deserialize(byte[] bytes) {
		TypeToken<T> typeToken = new TypeToken<T>(){};
		return App.mGson.fromJson(new String(bytes, Charset.forName("UTF-8")), typeToken.getType());
	}
}
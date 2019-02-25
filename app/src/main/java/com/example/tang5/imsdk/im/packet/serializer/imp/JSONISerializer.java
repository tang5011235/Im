package com.example.tang5.imsdk.im.packet.serializer.imp;

import com.example.tang5.imsdk.App;
import com.example.tang5.imsdk.im.bean.BaseResponseBean;
import com.example.tang5.imsdk.im.packet.serializer.ISerializer;
import com.example.tang5.imsdk.im.packet.serializer.SerializerAlgorithm;

import java.nio.charset.Charset;

public class JSONISerializer implements ISerializer {
    private static final String TAG = "JSONISerializer";
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
        String anObject = new String(bytes, Charset.forName("UTF-8"));
        if (("[]").equals(anObject)) {
            BaseResponseBean baseResponseBean = new BaseResponseBean();
            baseResponseBean.message = "登陆已过期";
            return (T) baseResponseBean;
        }
        return App.mGson.fromJson(anObject, clazz);
    }
}
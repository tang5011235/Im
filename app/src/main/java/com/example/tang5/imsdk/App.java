package com.example.tang5.imsdk;

import android.app.Application;
import android.content.SharedPreferences;

import com.example.tang5.imsdk.im.NettyClient;
import com.example.tang5.imsdk.im.packet.PacketCoder;
import com.google.gson.Gson;

/**
 * @author：thf on 2019/1/23 0023 15:12
 * <p>
 * 邮箱：tang5011235@163.com
 * <p>
 * name:IMSdk
 * <p>
 * version:
 * @description:
 */
public class App extends Application {
	public static Gson mGson;
	public static SharedPreferences sharedPreferences;
	public static App instance;
	public static NettyClient sNettyClient;

	@Override
	public void onCreate() {
		super.onCreate();
		instance = this;
		mGson = new Gson();
		sharedPreferences = getApplicationContext().getSharedPreferences("infos", 0);
		sNettyClient = NettyClient.ourInstance;
		PacketCoder.initCoder();
		SharedPreferences.Editor editor = sharedPreferences.edit();
		editor.putString("host", "118.178.156.71");
		editor.putInt("port", 6002);
		editor.putString("device_id", "b756d913f6d34deebf2a14252044f90a");
		editor.putString("session_id", "965afd9b8e63bec3419ed0d98927c22d429d9a52");
		editor.commit();
	}

	public String getHost() {
		return sharedPreferences.getString("host", "");
	}

	public int getPort() {
		return sharedPreferences.getInt("port", 0);
	}

	public String getDeviceId() {
		return sharedPreferences.getString("device_id", "");
	}

	public String getSessionId() {
		return sharedPreferences.getString("session_id", "");
	}

}

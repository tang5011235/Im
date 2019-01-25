package com.example.tang5.imsdk;

import com.example.tang5.imsdk.im.NettyClient;

/**
 * @author：thf on 2019/1/24 0024 12:17
 * <p>
 * 邮箱：tang5011235@163.com
 * <p>
 * name:IMSdk
 * <p>
 * version:
 * @description:
 */
public class Test {
	public static void main(String[] args){
		NettyClient ourInstance = NettyClient.ourInstance;
		ourInstance.connect("192.168.0.111",8081,5);
	}
}

package com.example.tang5.imsdk.im.packet;

/**
 * @author：thf on 2019/1/23 0023 16:10
 * <p>
 * 邮箱：tang5011235@163.com
 * <p>
 * name:IMSdk
 * <p>
 * version:
 * @description:
 */
public interface IPacket<T> {
	/**
	 * 指令
	 **/
	T getCommand();
}

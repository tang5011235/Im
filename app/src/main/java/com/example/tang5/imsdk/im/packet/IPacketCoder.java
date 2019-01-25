package com.example.tang5.imsdk.im.packet;

import io.netty.buffer.ByteBuf;

/**
 * @author：thf on 2019/1/23 0023 15:50
 * <p>
 * 邮箱：tang5011235@163.com
 * <p>
 * name:IMSdk
 * <p>
 * version:
 * @description: 解码器接口  考虑到多线程处理的时候会出现资源的共享，如果加入死锁会导致性能损耗，则所有数据都通过传入解决
 */
public interface IPacketCoder {
	<T extends IPacket> void encode(T packet,ByteBuf byteBuf);

	BasePacket decode(ByteBuf byteBuf);
}

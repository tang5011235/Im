package com.example.tang5.imsdk.im.channel.in;

import android.util.Log;

import com.example.tang5.imsdk.im.bean.SuccessBean;
import com.example.tang5.imsdk.im.packet.Command;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author：thf on 2019/1/24 0024 10:36
 * <p>
 * 邮箱：tang5011235@163.com
 * <p>
 * name:IMSdk
 * <p>
 * version:
 * @description: 成功返回消息处理
 */
public class SuccessResponseHandler extends SimpleChannelInboundHandler<SuccessBean> {
    private static final String TAG = "SuccessResponseHandler";
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, SuccessBean msg) {
        if (msg.getCmd() == Command.LOGIN) {
            /*Toast.makeText(App.instance, "dengluchenggong ", Toast.LENGTH_SHORT).show();*/
            Log.d(TAG, "channelRead0: 登陆成功 ");
        }
    }
}

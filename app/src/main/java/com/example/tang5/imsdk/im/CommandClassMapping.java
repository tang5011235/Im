package com.example.tang5.imsdk.im;

import com.example.tang5.imsdk.im.bean.BaseResponseBean;
import com.example.tang5.imsdk.im.bean.HeartBean;
import com.example.tang5.imsdk.im.bean.LogingResponseBean;
import com.example.tang5.imsdk.im.bean.SuccessBean;
import com.example.tang5.imsdk.im.packet.Command;

import java.util.HashMap;

/**
 * @author：thf on 2019/2/20 0020 16:58
 * <p>
 * 邮箱：tang5011235@163.com
 * <p>
 * name:IMSdk
 * <p>
 * version:
 * @description:
 */
public class CommandClassMapping {
    private static HashMap<Integer, Class> mCommandMap;

    private CommandClassMapping() {
        mCommandMap = new HashMap<>();
        mCommandMap.put(Command.LOGIN, LogingResponseBean.class);
        mCommandMap.put(Command.LOGIN_OUTMODED, BaseResponseBean.class);
        mCommandMap.put(Command.SEND_SUCCESS, SuccessBean.class);
        mCommandMap.put(Command.AAA, HeartBean.class);
    }

    public static CommandClassMapping getInstance() {
        return singletonHolder.sInstance;
    }

    private static class singletonHolder {
        private static final CommandClassMapping sInstance = new CommandClassMapping();
    }

    public static Class getMappingClass(int commandId) {
        if (mCommandMap == null) {
            getInstance();
        }
        Class aClass = mCommandMap.get(commandId);
        if (aClass == null) {
            throw new IllegalArgumentException("there is no class for commandId: " + commandId);
        }
        return aClass;
    }
}

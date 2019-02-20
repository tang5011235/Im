package com.example.tang5.imsdk.im;

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
	private static HashMap<Integer,Class> mCommandMap;
	private CommandClassMapping() {
		mCommandMap = new HashMap<>();
	}

	public static CommandClassMapping getInstance() {
		return singletonHolder.sInstance;
	}

	private static class singletonHolder {
		private static final CommandClassMapping sInstance = new CommandClassMapping();
	}

	public static Class getMappingClass(int commandId){
		return mCommandMap.get(commandId);
	}
}

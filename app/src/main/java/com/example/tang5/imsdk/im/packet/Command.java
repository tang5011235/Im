package com.example.tang5.imsdk.im.packet;

/**
 * @author：thf on 2019/1/23 0023 15:07
 * <p>
 * 邮箱：tang5011235@163.com
 * <p>
 * name:IMSdk
 * <p>
 * version:
 * @description:
 */
public interface Command {
	/**
	 * session_id
	 */
	String SESSION_ID = "session_id";


	/**
	 * 异常错误
	 */
	int ERRORM_CODE = 500;//
	/**
	 * 配置信息，包含心跳包和其他配置信息
	 */
	int AAA = 1;//
	/**
	 * 心跳包命令
	 */
	int HEART_PACK = 2;//
	/**
	 * 登陆信息
	 */
	int LOGIN = 3;//
	/**
	 * 退出
	 */
	int SIGN_OUT = 4;//
	/**
	 * 新用户上线
	 */
	int NEW_USER_ONLINE = 5;//
	/**
	 * 用户下线
	 */
	int USER_OFF_LINE = 6;//
	/**
	 * 登陆过期
	 */
	int LOGIN_OUTMODED = 7;//
	/**
	 * 消息回执
	 */
	int ACK = 10;//
	/**
	 * 登陆被弹出(账号在其他地方被登陆)
	 */
	int LOGIN_POPUP = 11;//
	/**
	 * 好友列表
	 */
	int GET_GOOD_FRIEND_DATA = 20;//
	/**
	 * 群组列表
	 */
	int GROUP_LIST_DATA = 21;//
	/**
	 * 最近会话列表
	 */
	int GET_SESSION_LIST_DATA = 22;//
	/**
	 * 创建群组
	 */
	int CREATE_GROUP = 23;//
	/**
	 * 查询群成员
	 */
	int SEARCH_GROUP_MEMBER = 24;//
	/**
	 * 创建群话题
	 */
	int CREATE_GROUP_TITLE = 25;//
	/**
	 * 关闭群话题
	 */
	int CLOSE_GROUP_TITLE = 26;//
	/**
	 * 打开群话题
	 */
	int OPEN_GROUP_TITLE = 27;//
	/**
	 * //获取群话题列表
	 */
	int GET_GROUP_TITLE_LIST = 28;
	/**
	 * 转让群
	 */
	int CHANGE_GROUP_ADMIN = 29;
	/**
	 * //解散群
	 */
	int DISMISS_GROUP = 30;
	/**
	 * 退出群
	 */
	int EXST_GROUP = 31;

	/**
	 * 设置群管理员
	 */
	int ADD_GROUP_MANAGER = 32;
	/**
	 * 群修改
	 */
	int GROUP_MODIFY = 33;
	/**
	 * //邀请添加群成员
	 */
	int GROUP_ADD_MEMBER = 34;
	/**
	 * 获取群是否存在(根据业务id)
	 */
	int GET_GROUP_IS_EXIT = 36;
	/**
	 * 查询消息阅读情况
	 */
	int CHECK_MESSAGES_STATUS = 38;
	/**
	 * 删除群成员
	 */
	int DELETE_GROUP_MEMBER = 39;
	/**
	 * //聊天 单聊
	 */
	int PRIVATE_CHART = 40;
	/**
	 * 聊天 群聊
	 */
	int GROUP_CHART = 41;
	/**
	 * //阅读消息
	 */
	int READ_MESSAGE = 42;
	/**
	 * 查询聊天记录
	 */
	int HISTORY_MESSAGE = 43;
	/**
	 * 聊天窗口记录
	 */
	int HISTORY_MESSAGE_CHAT = 44;
	/**
	 * 聊天文件
	 */
	int HISTORY_FILE_CHAT = 45;

	/**
	 * 获取未读消息数量
	 */
	int GET_UNREAD_NUM = 46;

	/**
	 * 获取员工资料
	 */
	int GET_EMPLOYEE_DETAIL = 47;
	/**
	 * 接收到业务通知
	 */
	int GET_BUSINESS_NOTIFICATION_CODE = 50;

	/**
	 * 获取员工资料
	 */
	int CHECK_GROUP_IS_EXIT = 51;

	/**
	 * 发布圈子
	 */
	int PUBLIC_CIRCLE = 60;
	/**
	 * 有新的圈子发布
	 */
	int HSA_NEW_CIRCLE = 61;
	/**
	 * 获取圈子列表数据
	 */
	int GET_CIRCLE_LIST_DATA = 62;
	/**
	 * 评论说说
	 */
	int CIRCLE_COMMENT = 63;
	/**
	 * 圈子点赞
	 */
	int CIRCLE_LINKE = 65;
	/**
	 * 获取圈子动态
	 */
	int GET_CIRCLE_DYNAMIC = 66;
	/**
	 * 有新动态
	 */
	int HAS_NEW_DYNAMIC = 67;
	/**
	 * 阅读圈子
	 */
	int READ_CIRCLE = 68;
	/**
	 * 阅读圈子动态
	 */
	int READ_CIRCLE_DYNAMIC = 69;

	/**
	 * 删除自己的评论
	 */
	int DELETE_COMMENT = 70;

	/**
	 * 删除自己的圈子动态
	 */
	int DELETE_MY_CIRCLE = 71;
	/**
	 * 获取圈子详情
	 */
	int GET_CIRCLE_DETAIL = 72;
	/**
	 * 删除最近会话
	 */
	int DELETE_NEAR_MESSAGE = 37;


	/**
	 * 消息发送成功
	 */
	int SEND_SUCCESS = 200;

	/**
	 * 消息置顶 或者  取消置顶
	 */
	int MESSAGE_TOP = 52;

	/**
	 * 自己阅读消息(推)
	 */
	int MYSELF_READ_MESSAGES = 53;

	/**
	 * 撤销消息(主动/推送)
	 */
	int CANCEL_CHAT_MESSAGES = 54;


}

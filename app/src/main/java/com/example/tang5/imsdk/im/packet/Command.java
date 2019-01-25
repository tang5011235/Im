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
	public static  final  String SESSION_ID = "session_id";


	/**
	 * 异常错误
	 */
	public static final int ERRORM_CODE = 500;//
	/**
	 * 配置信息，包含心跳包和其他配置信息
	 */
	public static final int AAA = 1;//
	/**
	 * 心跳包命令
	 */
	public static final int HEART_PACK = 2;//
	/**
	 *登陆信息
	 */
	public static final int LOGIN = 3;//
	/**
	 *退出
	 */
	public static final int SIGN_OUT = 4;//
	/**
	 *新用户上线
	 */
	public static final int NEW_USER_ONLINE = 5;//
	/**
	 *用户下线
	 */
	public static final int USER_OFF_LINE = 6;//
	/**
	 *登陆过期
	 */
	public static final int LOGIN_OUTMODED = 7;//
	/**
	 *消息回执
	 */
	public static final int ACK = 10;//
	/**
	 *登陆被弹出(账号在其他地方被登陆)
	 */
	public static final int LOGIN_POPUP = 11;//
	/**
	 *好友列表
	 */
	public static final int GET_GOOD_FRIEND_DATA = 20;//
	/**
	 *群组列表
	 */
	public static final int GROUP_LIST_DATA = 21;//
	/**
	 *最近会话列表
	 */
	public static final int GET_SESSION_LIST_DATA = 22;//
	/**
	 *创建群组
	 */
	public static final int CREATE_GROUP = 23;//
	/**
	 *查询群成员
	 */
	public static final int SEARCH_GROUP_MEMBER = 24;//
	/**
	 *创建群话题
	 */
	public static final int CREATE_GROUP_TITLE = 25;//
	/**
	 *关闭群话题
	 */
	public static final int CLOSE_GROUP_TITLE = 26;//
	/**
	 * 打开群话题
	 */
	public static final int OPEN_GROUP_TITLE = 27;//
	/**
	 * //获取群话题列表
	 */
	public static final int GET_GROUP_TITLE_LIST = 28;
	/**
	 *  转让群
	 */
	public static final int CHANGE_GROUP_ADMIN = 29;
	/**
	 * //解散群
	 */
	public static final int DISMISS_GROUP = 30;
	/**
	 * 退出群
	 */
	public static final int EXST_GROUP = 31;

	/**
	 * 设置群管理员
	 */
	public static final int ADD_GROUP_MANAGER = 32;
	/**
	 * 群修改
	 */
	public static final int GROUP_MODIFY = 33;
	/**
	 * //邀请添加群成员
	 */
	public static final int GROUP_ADD_MEMBER = 34;
	/**
	 * 获取群是否存在(根据业务id)
	 */
	public static final int GET_GROUP_IS_EXIT = 36;
	/**
	 * 查询消息阅读情况
	 */
	public static final int CHECK_MESSAGES_STATUS = 38;
	/**
	 * 删除群成员
	 */
	public static final int DELETE_GROUP_MEMBER = 39;
	/**
	 * //聊天 单聊
	 */
	public static final int PRIVATE_CHART = 40;
	/**
	 *聊天 群聊
	 */
	public static final int GROUP_CHART = 41;
	/**
	 * //阅读消息
	 */
	public static final int READ_MESSAGE = 42;
	/**
	 * 查询聊天记录
	 */
	public static final int HISTORY_MESSAGE = 43;
	/**
	 * 聊天窗口记录
	 */
	public static final int HISTORY_MESSAGE_CHAT = 44;
	/**
	 * 聊天文件
	 */
	public static final int HISTORY_FILE_CHAT = 45;

	/**
	 * 获取未读消息数量
	 */
	public static final int GET_UNREAD_NUM = 46;

	/**
	 * 获取员工资料
	 */
	public static final int GET_EMPLOYEE_DETAIL = 47;
	/**
	 * 接收到业务通知
	 */
	public static final int GET_BUSINESS_NOTIFICATION_CODE = 50;

	/**
	 * 获取员工资料
	 */
	public static final int CHECK_GROUP_IS_EXIT = 51;

	/**
	 * 发布圈子
	 */
	public static final int PUBLIC_CIRCLE = 60;
	/**
	 * 有新的圈子发布
	 */
	public static final int HSA_NEW_CIRCLE = 61;
	/**
	 * 获取圈子列表数据
	 */
	public static final int GET_CIRCLE_LIST_DATA = 62;
	/**
	 * 评论说说
	 */
	public static final int CIRCLE_COMMENT = 63;
	/**
	 * 圈子点赞
	 */
	public static final int CIRCLE_LINKE = 65;
	/**
	 * 获取圈子动态
	 */
	public static final int GET_CIRCLE_DYNAMIC = 66;
	/**
	 * 有新动态
	 */
	public static final int HAS_NEW_DYNAMIC = 67;
	/**
	 * 阅读圈子
	 */
	public static final int READ_CIRCLE = 68;
	/**
	 * 阅读圈子动态
	 */
	public static final int READ_CIRCLE_DYNAMIC = 69;

	/**
	 * 删除自己的评论
	 */
	public static final int DELETE_COMMENT = 70;

	/**
	 * 删除自己的圈子动态
	 */
	public static final int DELETE_MY_CIRCLE = 71;
	/**
	 * 获取圈子详情
	 */
	public static final int GET_CIRCLE_DETAIL = 72;
	/**
	 * 删除最近会话
	 */
	public static final int DELETE_NEAR_MESSAGE = 37;


	/**
	 * 消息发送成功
	 */
	public static final int SEND_SUCCESS = 200;

	/**
	 * 消息置顶 或者  取消置顶
	 */
	public static final int MESSAGE_TOP = 52;

	/**
	 * 自己阅读消息(推)
	 */
	public static final int MYSELF_READ_MESSAGES = 53;

	/**
	 * 撤销消息(主动/推送)
	 */
	public static final int CANCEL_CHAT_MESSAGES = 54;




}

package com.example.tang5.imsdk.im.channel.in;

/**
 * @author：thf on 2019/1/24 0024 10:20
 * <p>
 * 邮箱：tang5011235@163.com
 * <p>
 * name:IMSdk
 * <p>
 * version:
 * @description:
 */
class Loginbean {
	private String device_id;
	private String session_id;
	private int client_type;

	public Loginbean(String device_id, String session_id, int client_type) {
		this.device_id = device_id;
		this.session_id = session_id;
		this.client_type = client_type;
	}

	public String getDevice_id() {
		return device_id;
	}

	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}

	public String getSession_id() {
		return session_id;
	}

	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

	public int  getClient_type() {
		return client_type;
	}

	public void setClient_type(int client_type) {
		this.client_type = client_type;
	}

	@Override
	public String toString() {
		return "Loginbean{" +
				"device_id='" + device_id + '\'' +
				", session_id='" + session_id + '\'' +
				", client_type=" + client_type +
				'}';
	}
}

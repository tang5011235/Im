package com.example.tang5.imsdk.im.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author：thf on 2019/2/21 0021 09:20
 * <p>
 * 邮箱：tang5011235@163.com
 * <p>
 * name:IMSdk
 * <p>
 * version:
 * @description:
 */
public class LogingResponseBean extends BaseResponseBean{

	/**
	 * cmp_id : c8ce875b-e0dc-4bc5-92d5-1ba2c62a23e6
	 * depa_id : c7b0c7fa-e368-44d0-92ac-94cd569d2b4c
	 * depa_name : 销售部
	 * employee_avatar : http://xiaomi-saas-test.oss-cn-qingdao.aliyuncs.com/c8ce875b-e0dc-4bc5-92d5-1ba2c62a23e6/68c1b0b5-f5d6-44b5-9a45-067dfde49559/b6b1e09481057e8cc97c5eee871d11ba_480x480.png
	 * employee_id : 68c1b0b5-f5d6-44b5-9a45-067dfde49559
	 * employee_name : 苏航宇
	 */

	@SerializedName("cmp_id")
	private String cmpId;
	@SerializedName("depa_id")
	private String depaId;
	@SerializedName("depa_name")
	private String depaName;
	@SerializedName("employee_avatar")
	private String employeeAvatar;
	@SerializedName("employee_id")
	private String employeeId;
	@SerializedName("employee_name")
	private String employeeName;

	public String getCmpId() {
		return cmpId;
	}

	public void setCmpId(String cmpId) {
		this.cmpId = cmpId;
	}

	public String getDepaId() {
		return depaId;
	}

	public void setDepaId(String depaId) {
		this.depaId = depaId;
	}

	public String getDepaName() {
		return depaName;
	}

	public void setDepaName(String depaName) {
		this.depaName = depaName;
	}

	public String getEmployeeAvatar() {
		return employeeAvatar;
	}

	public void setEmployeeAvatar(String employeeAvatar) {
		this.employeeAvatar = employeeAvatar;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "LogingResponseBean{" +
				"cmpId='" + cmpId + '\'' +
				", depaId='" + depaId + '\'' +
				", depaName='" + depaName + '\'' +
				", employeeAvatar='" + employeeAvatar + '\'' +
				", employeeId='" + employeeId + '\'' +
				", employeeName='" + employeeName + '\'' +
				'}';
	}
}

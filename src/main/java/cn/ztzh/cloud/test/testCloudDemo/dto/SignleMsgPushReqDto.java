package cn.ztzh.cloud.test.testCloudDemo.dto;

/**
 * 单设备消息推送
 * @author heshiyang
 *
 */
public class SignleMsgPushReqDto {

	private String pushStartDate;
	private String pushEndDate;
	
	private String messageType;
	private String msgTemplateCode;
	private String msgTemplateParams;
	private String deviceId;
	private String sustomerId;
	
	
	private String taskName;
	//1短信，2站内信，3推送，4，微信
	private Integer informWay;
	private String orgId;
	private Integer intentType =1;
	private String packageName;
	private String appName;
	private String activity;
	private String url;
	public String getPushStartDate() {
		return pushStartDate;
	}
	public void setPushStartDate(String pushStartDate) {
		this.pushStartDate = pushStartDate;
	}
	public String getPushEndDate() {
		return pushEndDate;
	}
	public void setPushEndDate(String pushEndDate) {
		this.pushEndDate = pushEndDate;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getMsgTemplateCode() {
		return msgTemplateCode;
	}
	public void setMsgTemplateCode(String msgTemplateCode) {
		this.msgTemplateCode = msgTemplateCode;
	}
	public String getMsgTemplateParams() {
		return msgTemplateParams;
	}
	public void setMsgTemplateParams(String msgTemplateParams) {
		this.msgTemplateParams = msgTemplateParams;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getSustomerId() {
		return sustomerId;
	}
	public void setSustomerId(String sustomerId) {
		this.sustomerId = sustomerId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public Integer getInformWay() {
		return informWay;
	}
	public void setInformWay(Integer informWay) {
		this.informWay = informWay;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public Integer getIntentType() {
		return intentType;
	}
	public void setIntentType(Integer intentType) {
		this.intentType = intentType;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}

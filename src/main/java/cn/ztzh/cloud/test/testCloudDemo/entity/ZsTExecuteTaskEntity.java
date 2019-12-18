package cn.ztzh.cloud.test.testCloudDemo.entity;

import java.util.Date;

public class ZsTExecuteTaskEntity {

	private String id;
	private String callBeanName;
	private String requestParam;
	private String responseParam;
	private String businessId;
	private String orderTag;
	private Date createTime;
	private Date updateTime;
	private String templateId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCallBeanName() {
		return callBeanName;
	}
	public void setCallBeanName(String callBeanName) {
		this.callBeanName = callBeanName;
	}
	public String getRequestParam() {
		return requestParam;
	}
	public void setRequestParam(String requestParam) {
		this.requestParam = requestParam;
	}
	public String getResponseParam() {
		return responseParam;
	}
	public void setResponseParam(String responseParam) {
		this.responseParam = responseParam;
	}
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getOrderTag() {
		return orderTag;
	}
	public void setOrderTag(String orderTag) {
		this.orderTag = orderTag;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getTemplateId() {
		return templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	
	
}






















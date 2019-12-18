package cn.ztzh.cloud.test.testCloudDemo.dto;

import java.util.Date;
import java.util.List;

import cn.ztzh.cloud.test.testCloudDemo.entity.ZsTExecuteTaskEntity;

public class TransEventRuleDto {
	
	private String id;
	private String code;
	private String name;
	private Date createTime;
	private Date updateTime;
	private List<ZsTExecuteTaskEntity> executeTasks;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public List<ZsTExecuteTaskEntity> getExecuteTasks() {
		return executeTasks;
	}
	public void setExecuteTasks(List<ZsTExecuteTaskEntity> executeTasks) {
		this.executeTasks = executeTasks;
	}

}

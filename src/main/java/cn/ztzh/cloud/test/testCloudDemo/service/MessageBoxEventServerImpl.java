package cn.ztzh.cloud.test.testCloudDemo.service;

import java.util.Map;

import cn.ztzh.cloud.test.testCloudDemo.dto.SignleMsgPushReqDto;

public class MessageBoxEventServerImpl extends MessageEventAbstract{

	protected SignleMsgPushReqDto transDto(Map<String, Object> map) {
		System.out.println("MessageBoxEventServerImpl   SignleMsgPushReqDto参数转换！");
		
		SignleMsgPushReqDto dto = super.transDto(map);
		dto.setInformWay(2);//站内信
		return dto;
	}
}

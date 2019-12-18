package cn.ztzh.cloud.test.testCloudDemo.service;

import java.util.Map;

import cn.ztzh.cloud.test.testCloudDemo.dto.SignleMsgPushReqDto;

public class PushMessageEventServerImpl extends MessageEventAbstract{

	protected SignleMsgPushReqDto transDto(Map<String, Object> map) {
		System.out.println("PushMessageEventServerImpl   SignleMsgPushReqDto参数转换！");
		
		SignleMsgPushReqDto dto = super.transDto(map);
		dto.setInformWay(3);//推送
		return dto;
	}
}

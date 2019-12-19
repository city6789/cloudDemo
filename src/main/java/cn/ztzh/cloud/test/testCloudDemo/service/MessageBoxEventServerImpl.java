package cn.ztzh.cloud.test.testCloudDemo.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import cn.ztzh.cloud.test.testCloudDemo.dto.SignleMsgPushReqDto;
@Service
public class MessageBoxEventServerImpl extends MessageEventAbstract{

	protected SignleMsgPushReqDto transDto(Map<String, Object> map) {
		System.out.println("MessageBoxEventServerImpl   SignleMsgPushReqDto参数转换！");
		
		SignleMsgPushReqDto dto = super.transDto(map);
		dto.setInformWay(2);//站内信
		return dto;
	}
}

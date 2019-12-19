package cn.ztzh.cloud.test.testCloudDemo.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import cn.ztzh.cloud.test.testCloudDemo.dto.SignleMsgPushReqDto;
@Service
public class PushMessageEventServerImpl extends MessageEventAbstract{

	protected SignleMsgPushReqDto transDto(Map<String, Object> map) {
		System.out.println("PushMessageEventServerImpl   SignleMsgPushReqDto参数转换！");
		
		SignleMsgPushReqDto dto = super.transDto(map);
		dto.setInformWay(3);//推送
		return dto;
	}
}

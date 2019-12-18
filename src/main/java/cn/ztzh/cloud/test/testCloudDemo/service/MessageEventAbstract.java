package cn.ztzh.cloud.test.testCloudDemo.service;

import java.util.Map;

import cn.ztzh.cloud.test.testCloudDemo.dto.SignleMsgPushReqDto;
import cn.ztzh.cloud.test.testCloudDemo.inter.EventService;

public abstract class MessageEventAbstract implements EventService{

	@Override
	public void execute(Map<String, Object> map) {
		try {
			SignleMsgPushReqDto dto = this.transDto(map);
			this.pushMessage(dto);
		} catch (Exception e) {
			
		}
	}

	protected  void pushMessage(SignleMsgPushReqDto dto) {
		System.out.println("MessageEventAbstract   pushMessage请求推送消息服务！");
	}

	protected SignleMsgPushReqDto transDto(Map<String, Object> map) {
		System.out.println("MessageEventAbstract   SignleMsgPushReqDto参数转换！");
		
		SignleMsgPushReqDto dto = new SignleMsgPushReqDto();
		
		return dto;
	}

}

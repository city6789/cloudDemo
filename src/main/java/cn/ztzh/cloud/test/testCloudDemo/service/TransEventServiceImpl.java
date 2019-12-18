package cn.ztzh.cloud.test.testCloudDemo.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import cn.ztzh.cloud.test.testCloudDemo.cache.TransEventRuleCacheManger;
import cn.ztzh.cloud.test.testCloudDemo.dto.TransEventRuleDto;
import cn.ztzh.cloud.test.testCloudDemo.entity.ZsTExecuteTaskEntity;
import cn.ztzh.cloud.test.testCloudDemo.inter.EventService;
import cn.ztzh.cloud.test.testCloudDemo.inter.TransEventService;
import cn.ztzh.cloud.test.testCloudDemo.util.SpringUtils;
@Service
public class TransEventServiceImpl implements TransEventService {

	@Autowired
	private TransEventRuleCacheManger manger;

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public void runTrans(Map<String, Object> map) {
		TransEventRuleDto dto = manger.getTansEventRule((String) map.get("eventType"));
		if (!ObjectUtils.isEmpty(dto)) {
			List<ZsTExecuteTaskEntity> list = dto.getExecuteTasks();
			if (!ObjectUtils.isEmpty(list)) {
				for (ZsTExecuteTaskEntity entity : list) {
					try {
						map.put("templateId", entity.getTemplateId());
						EventService service = (EventService) SpringUtils.getBean(entity.getCallBeanName());
						System.err.println(service);
						service.execute(map);
					} catch (Exception e) {

					}
				}
			}
		}
	}

}

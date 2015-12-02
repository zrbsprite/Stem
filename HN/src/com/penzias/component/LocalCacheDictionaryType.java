package com.penzias.component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

import com.penzias.entity.SmCodecollect;
import com.penzias.entity.SmCodecollectExample;
import com.penzias.interfaces.IDictionaryType;
import com.penzias.service.SmCodecollectService;


public class LocalCacheDictionaryType implements IDictionaryType, InitializingBean{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private Map<String, SmCodecollect> dictionary = new HashMap<String, SmCodecollect>();
	
	private SmCodecollectService smCodecollectService;
	
	@Override
	public void addOne(Object bean){
		SmCodecollect model = (SmCodecollect) bean;
		try{
			this.smCodecollectService.add(model);
			dictionary.put(model.getCodeid(),model);
		} catch (Exception e){
			logger.error("添加新的字典项出错["+model.getCodeid()+"-->  " +model.getDescription()+ "]！");
		}
	}

	@Override
	public void deleteOne(Object bean){
		SmCodecollect model = (SmCodecollect) bean;
		try{
			this.smCodecollectService.deleteById(model.getCodeid());
			dictionary.remove(model.getCodeid());
		} catch (Exception e){
			logger.error("移除字典项出错["+model.getCodeid()+"-->  " +model.getDescription()+ "]！");
		}
	}

	@Override
	public void updateOne(Object bean){
		SmCodecollect model = (SmCodecollect) bean;
		try{
			this.smCodecollectService.updateById(model);
			dictionary.put(model.getCodeid(),model);
		} catch (Exception e){
			logger.error("更新字典项出错["+model.getCodeid()+"-->  " +model.getDescription()+ "]！");
		}
	}

	@Override
	public Object list(){
		return dictionary;
	}

	@Override
	public Object queryOne(Object object){
		String key = (String) object;
		return dictionary.get(key);
	}

	@Override
	public void afterPropertiesSet() throws Exception{
		logger.info("开始内存化字典类别数据……");
		List<SmCodecollect> list = this.smCodecollectService.list(new SmCodecollectExample());
		for(SmCodecollect sm : list){
			dictionary.put(sm.getCodeid(),sm);
		}
		logger.info("结束内存化字典类别数据……");
	}

	
	public void setSmCodecollectService(SmCodecollectService smCodecollectService){
	
		this.smCodecollectService = smCodecollectService;
	}
}

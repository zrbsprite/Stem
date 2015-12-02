package com.penzias.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.penzias.entity.SmCodecollect;
import com.penzias.entity.SmCodecollectExample;
import com.penzias.interfaces.IDictionaryType;
import com.penzias.service.SmCodecollectService;


public class DBDictionaryType implements IDictionaryType{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private SmCodecollectService smCodecollectService;
	
	@Override
	public void addOne(Object bean){
		SmCodecollect model = (SmCodecollect) bean;
		try{
			this.smCodecollectService.add(model);
		} catch (Exception e){
			logger.error("添加新的字典项出错["+model.getCodeid()+"-->  " +model.getDescription()+ "]！");
		}
	}

	@Override
	public void deleteOne(Object bean){
		SmCodecollect model = (SmCodecollect) bean;
		try{
			this.smCodecollectService.deleteById(model.getCodeid());
		} catch (Exception e){
			logger.error("移除字典项出错["+model.getCodeid()+"-->  " +model.getDescription()+ "]！");
		}
	}

	@Override
	public void updateOne(Object bean){
		SmCodecollect model = (SmCodecollect) bean;
		try{
			this.smCodecollectService.updateById(model);
		} catch (Exception e){
			logger.error("更新字典项出错["+model.getCodeid()+"-->  " +model.getDescription()+ "]！");
		}
	}

	@Override
	public Object list(){
		return this.smCodecollectService.list(new SmCodecollectExample());
	}

	@Override
	public Object queryOne(Object object){
		String key = (String) object;
		return this.smCodecollectService.getById(key);
	}

	public void setSmCodecollectService(SmCodecollectService smCodecollectService){
	
		this.smCodecollectService = smCodecollectService;
	}
}

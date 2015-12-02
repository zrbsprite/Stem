package com.penzias.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.penzias.entity.SmCodeitem;
import com.penzias.entity.SmCodeitemExample;
import com.penzias.interfaces.IDictionaryType;
import com.penzias.service.SmCodeitemService;


public class DBDictionaryItem implements IDictionaryType{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private SmCodeitemService smCodeitemService;
	
	@Override
	public void addOne(Object bean){
		SmCodeitem model = (SmCodeitem) bean;
		try{
			this.smCodeitemService.add(model);
		} catch (Exception e){
			logger.error("添加新的字典项出错["+model.getCodeid()+"-->  " +model.getDescription()+ "]！");
		}
	}

	@Override
	public void deleteOne(Object bean){
		SmCodeitem model = (SmCodeitem) bean;
		try{
			this.smCodeitemService.deleteById(model.getCodeid());
		} catch (Exception e){
			logger.error("移除字典项出错["+model.getCodeid()+"-->  " +model.getDescription()+ "]！");
		}
	}

	@Override
	public void updateOne(Object bean){
		SmCodeitem model = (SmCodeitem) bean;
		try{
			this.smCodeitemService.updateById(model);
		} catch (Exception e){
			logger.error("更新字典项出错["+model.getCodeid()+"-->  " +model.getDescription()+ "]！");
		}
	}

	@Override
	public Object list(){
		return this.smCodeitemService.list(new SmCodeitemExample());
	}

	@Override
	public Object queryOne(Object object){
		String key = (String) object;
		return this.smCodeitemService.getById(key);
	}

	public void setSmCodeitemService(SmCodeitemService smCodeitemService){
	
		this.smCodeitemService = smCodeitemService;
	}
}

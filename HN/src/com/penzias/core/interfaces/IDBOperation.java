package com.penzias.core.interfaces;

import java.util.List;

/**
 * 描述：字典数据接口<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月2日 - 下午5:03:30<br/>
 */
public interface IDBOperation {

	public void addOne(Object bean);
	
	public void deleteOne(Object bean);
	
	public void updateOne(Object bean);
	
	public Object list();
	
	public Object queryOne(Object object);
}

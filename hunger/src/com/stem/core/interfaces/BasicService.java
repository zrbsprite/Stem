package com.stem.core.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BasicService<E, M> {

	public List<M> list(E example);
	
	public M getById(Integer id);
	
	public int getTotal(E example);
	
	public int update(@Param("model") M model, @Param("example") E example);

	public int updateById(@Param("model") M model);
	
	public int deleteById(Integer id);

	public int delete(E example);
	
	public int add(@Param("model") M model);
}

package com.stem.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.stem.entity.User;
import com.stem.entity.UserExample;

public interface UserService {

	public int insert(User user);

	public List<User> selectByExample(UserExample example);
	
	public User selectByUserName(String username);
	
	public User selectByMobile(String mobile);

	public User selectByPrimaryKey(Integer id);

	public int countByExample(UserExample example);

	public int updateByExample(@Param("model") User model, @Param("example") UserExample example);

	public int updateByPrimaryKey(@Param("model") User model);
	
	public int deleteByPrimaryKey(Integer id);

	public int deleteByPrimaryKey(UserExample example);
	
}

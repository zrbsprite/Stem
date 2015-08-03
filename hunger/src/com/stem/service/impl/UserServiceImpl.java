package com.stem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stem.dao.UserMapper;
import com.stem.entity.User;
import com.stem.entity.UserExample;
import com.stem.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	private UserMapper userMapper;
	
	@Override
	public int insert(User user) {
		return this.userMapper.insert(user);
	}

	@Override
	public List<User> selectByExample(UserExample example) {
		return this.userMapper.selectByExample(example);
	}

	@Override
	public User selectByUserName(String username) {
		UserExample example = new UserExample();
		example.createCriteria().andUserNameEqualTo(username);
		List<User> list = this.userMapper.selectByExample(example);
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public User selectByMobile(String mobile) {
		UserExample example = new UserExample();
		example.createCriteria().andMobileEqualTo(mobile);
		List<User> list = this.userMapper.selectByExample(example);
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		return this.userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int countByExample(UserExample example) {
		return this.userMapper.countByExample(example);
	}

	@Override
	public int updateByExample(User model, UserExample example) {
		return this.userMapper.updateByExample(model, example);
	}

	@Override
	public int updateByPrimaryKey(User model) {
		return this.userMapper.updateByPrimaryKey(model);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return this.userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteByPrimaryKey(UserExample example) {
		return this.userMapper.deleteByExample(example);
	}

	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Resource
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
}

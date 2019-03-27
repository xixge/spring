package com.zuxia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuxia.entity.User;
import com.zuxia.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
 
	public List<User> findByName(String name) {
		return userMapper.findUserByName(name);
	}
 
	public User insertUser(User user) {
		userMapper.insertUser(user);
		return user;
	}
	public List<User> ListUser(){
		return	userMapper.ListUser();
	}
	
	
	public int Update(User user){
		return userMapper.Update(user);
	}
	
	public int delete(int id){
		return userMapper.delete(id);
	}

}

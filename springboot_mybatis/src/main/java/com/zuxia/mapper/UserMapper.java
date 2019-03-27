package com.zuxia.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zuxia.entity.User;

@Mapper
public interface UserMapper {
	
	List<User> findUserByName(String name);
	
	public List<User> ListUser();
	
	public int insertUser(User user);
	
	public int delete(int id);
	
	public int Update(User user);

}

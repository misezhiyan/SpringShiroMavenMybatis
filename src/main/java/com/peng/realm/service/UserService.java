package com.peng.realm.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peng.realm.mapper.UserMapper;
import com.peng.realm.po.User;

@Service("userService")
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public User queryUserByName(String userName) {
		return userMapper.queryUserByName(userName);
	}

	public Set<String> queryRolesByName(String userName) {
		return userMapper.queryRolesByName(userName);
	}
}
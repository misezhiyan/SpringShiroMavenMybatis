package com.peng.web.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peng.web.dao.impl.UserDaoImpl;
import com.peng.web.po.User;
import com.peng.web.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDaoImpl userDao;

	@Override
	public User queryUserByName(String userName) {

		return userDao.queryUserByName(userName);
	}

	@Override
	public Set<String> queryRolesByName(String userName) {

		List<String> queryRolesByName = userDao.queryRolesByName(userName);
		return null;
	}
}
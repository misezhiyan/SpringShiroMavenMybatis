package com.peng.web.dao;

import java.util.List;

import com.peng.web.po.User;

public interface UserDao {

	public User queryUserByName(String userName);

	public List<String> queryRolesByName(String userName);

}
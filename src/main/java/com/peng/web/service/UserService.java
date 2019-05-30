package com.peng.web.service;

import java.util.Set;

import com.peng.web.po.User;

public interface UserService {

	public User queryUserByName(String userName);

	public Set<String> queryRolesByName(String userName);
}
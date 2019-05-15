package com.peng.realm.mapper;

import java.util.Set;

import com.peng.realm.po.User;

public interface UserMapper {

	public User queryUserByName(String userName);

	public Set<String> queryRolesByName(String userName);
}
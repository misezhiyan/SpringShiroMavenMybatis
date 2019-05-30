package com.peng.web.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.peng.web.po.User;

@Repository("userDao")
// public class UserDaoImpl implements UserDao {
public class UserDaoImpl {

	@Autowired
	private SqlSessionTemplate sqlSession;

	public User queryUserByName(String userName) {

		return sqlSession.selectOne("com.peng.web.mapper.userMapper.queryUserByName", userName);
	}

	public List<String> queryRolesByName(String userName) {

		return sqlSession.selectList("com.peng.web.mapper.userMapper.queryUserByName", userName);
	}

}
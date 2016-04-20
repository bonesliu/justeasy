package com.justeasy.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justeasy.common.service.CrudService;
import com.justeasy.sys.dao.UserDao;
import com.justeasy.sys.entity.User;

@Service
public class UserServiceImpl extends CrudService<UserDao, User> {

	@Autowired
	private UserDao userDao;
	
	
}

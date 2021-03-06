package com.riil.lightning.test.sys;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.justeasy.common.utils.IdGen;
import com.justeasy.sys.dao.LogDao;
import com.justeasy.sys.entity.Log;
import com.justeasy.sys.entity.User;
import com.justeasy.sys.service.SystemServiceImpl;
import com.riil.lightning.test.BaseTest;

public class SystemServiceTest extends BaseTest {

	SystemServiceImpl service;
	@Test
	public void getUserByLoginNameTest(){
		service = ctx.getBean(SystemServiceImpl.class);
		User user = service.getUserByLoginName("admin");
		Assert.assertNotNull(user);
		Assert.assertNotNull(user.getRoleList());
	}
	@Test
	public void saveLogTest(){
		LogDao logDao = ctx.getBean(LogDao.class);
		Log log = new Log();
		log.setId(IdGen.uuid());
		log.setTitle("fefe");
		log.setCreateBy("admin");
		log.setCreateDate(new Date());
		log.setException("fefew");;
		log.setMethod("fewf");
		log.setRemoteAddr("214234532");
		log.setType("0");
		log.setUserAgent("fwfewfe");
		logDao.insert(log);
	}
}

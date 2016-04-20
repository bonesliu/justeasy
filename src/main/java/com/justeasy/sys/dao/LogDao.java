package com.justeasy.sys.dao;

import com.justeasy.common.persistence.CrudDao;
import com.justeasy.common.persistence.annotation.MyBatisDao;
import com.justeasy.sys.entity.Log;

/**
 * 日志DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface LogDao extends CrudDao<Log> {

}

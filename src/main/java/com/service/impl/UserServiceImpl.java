/**
 * All rights Reserved, Designed By www.xcompany.com  
 * @Package com.service   
 * @Description:    TODO 描述   
 * @author: Frankjiu
 * @date:   2020年4月2日下午5:49:33
 * @version V1.0
 */

package com.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.mapper.UserMapper;
import com.service.UserService;

/**
 * user service impl
 * 
 * @author: Frankjiu
 * @date: 2020年4月2日 下午5:49:33
 */
@Service
public class UserServiceImpl implements UserService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	UserMapper userMapper;

	public int addUser(User user) {
		return userMapper.addUser(user);
	}

	@CacheEvict(value = "c1")
	public int deleteUserById(String id) {
		logger.info("======>deleteUserById:{}======>", id);
		return userMapper.deleteUserById(id);
	}

	@CachePut(value = "c1")
	public int updateUserById(User user) {
		return userMapper.updateUserById(user);
	}

	@Cacheable(value = "c1")
	public User getUserById(String id) {
		logger.info("======>getUserById:{}======>", id);
		return userMapper.getUserById(id);
	}

	@Cacheable(value = "c2")
	public List<User> getAllUsers() {
		return userMapper.getAllUsers();
	}

	public List<User> getUsersByCreateTimeAndAges(String startCreateTime, String endCreateTime, Integer[] ages) {
		return userMapper.getUsersByCreateTimeAndAges(startCreateTime, endCreateTime, ages);
	}

	/**
	 * 单表查询通过mybatis注解免XML查询
	 * 
	 * @param mobile
	 * @return
	 */
	public User getUserByMobile(String mobile) {
		return userMapper.getUserByMobile(mobile);
	}

}

package com.yxyun.service.impl;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.DigestUtils;

import com.yxyun.entity.TUser;
import com.yxyun.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class UserServiceImplTest {

	@Autowired
	private UserService userService;
	@Test
	public void test() {
		TUser user=new TUser();
		user.setName("wangwu");
		user.setPwd(DigestUtils.md5DigestAsHex("123456".getBytes()));
		int status=userService.addUser(user);
		Assert.assertTrue(status==1);
	}

}

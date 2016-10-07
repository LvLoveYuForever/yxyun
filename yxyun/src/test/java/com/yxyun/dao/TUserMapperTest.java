package com.yxyun.dao;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.DigestUtils;

import com.yxyun.entity.TUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/spring-dao.xml")
public class TUserMapperTest {

	@Autowired
	private TUserMapper userMapper;
	
	@Test
	public void test() {
		TUser user=new TUser();
		user.setName("王五");
		user.setPwd(DigestUtils.md5DigestAsHex("123456".getBytes()));
		int status=userMapper.insertSelective(user);
		System.out.println(user.getId());
		Assert.assertTrue(status==1);
				
	}

}

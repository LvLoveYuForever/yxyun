package com.yxyun.service;

import org.springframework.stereotype.Service;

import com.yxyun.dto.PageList;
import com.yxyun.entity.TUser;

public interface UserService {
     
	int addUser(TUser user);
	
	int editUserById( TUser user);
	
	int deleteUserById(Long id);
	
	TUser findUserByEntity(TUser user);
	
	TUser findUserById(Long id);
	
	PageList<TUser> findUserAll(int page,int pageSize);
}

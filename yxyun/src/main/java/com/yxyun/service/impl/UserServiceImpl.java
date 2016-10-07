package com.yxyun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yxyun.dao.TUserMapper;
import com.yxyun.dto.PageList;
import com.yxyun.entity.TUser;
import com.yxyun.entity.TUserExample;
import com.yxyun.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private TUserMapper userMapper;
	
	public int addUser(TUser user) {
		
		return userMapper.insertSelective(user);
	}

	public int editUserById(TUser user) {
		
		return userMapper.updateByPrimaryKeySelective(user);
	}

	public int deleteUserById(Long id) {
		
		return userMapper.deleteByPrimaryKey(id);
	}

	public TUser findUserByEntity(TUser user) {
		TUserExample example=new TUserExample();
		example.createCriteria().andNameEqualTo(user.getName())
												.andPwdEqualTo(user.getPwd());
		List<TUser> list=userMapper.selectByExample(example);
		
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}

	public TUser findUserById(Long id) {
		
		return userMapper.selectByPrimaryKey(id);
	}

	public PageList<TUser> findUserAll(int page, int pageSize) {
		PageHelper.startPage(page, pageSize);
		
		TUserExample example=new TUserExample();
		example.createCriteria().andIdIsNotNull();
		List<TUser> userList=userMapper.selectByExample(example);
		
		PageInfo<TUser> pageInfo=new PageInfo<TUser>(userList);
		
		PageList<TUser> pageList=new PageList<TUser>();
		pageList.setTotalRecond(pageInfo.getTotal());//总记录数
		pageList.setPageSize(pageInfo.getPageSize());//页面大小
		pageList.setCurrentPage(pageInfo.getPageNum());//当前页
		pageList.setPageList(pageInfo.getList());
		
		return pageList;
	}
	
	

}

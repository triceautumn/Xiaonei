package com.xiaonei.service.impl;

import java.util.List;

import com.xiaonei.base.service.BaseServiceImpl;
import com.xiaonei.bean.Users;
import com.xiaonei.service.inter.UserServiceInter;

public class UserServiceImpl extends BaseServiceImpl implements
		UserServiceInter {

	@SuppressWarnings("unchecked")
	public Users check(Users user) {
		// TODO Auto-generated method stub
		List<Users> list=getResult
		("from Users where email=? and pwd=?", new Object[]{user.getEmail(),user.getPwd()});
		if(list.size()==1){
			return  list.get(0);
		}else{
			return null;
		}
	}
}

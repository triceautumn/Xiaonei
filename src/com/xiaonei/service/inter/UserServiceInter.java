package com.xiaonei.service.inter;

import com.xiaonei.base.service.BaseServiceInter;
import com.xiaonei.bean.Users;

public interface UserServiceInter extends BaseServiceInter {

	//验证用户是否存在，返回Users对象，如果返回null,表示该用户不存在
	public Users check(Users user);
}

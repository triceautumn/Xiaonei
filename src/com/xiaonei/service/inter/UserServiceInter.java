package com.xiaonei.service.inter;

import com.xiaonei.base.service.BaseServiceInter;
import com.xiaonei.bean.Users;

public interface UserServiceInter extends BaseServiceInter {

	//��֤�û��Ƿ���ڣ�����Users�����������null,��ʾ���û�������
	public Users check(Users user);
}

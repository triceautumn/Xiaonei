package com.xiaonei.base.service;

import java.io.Serializable;
import java.util.List;

public interface BaseServiceInter {

	//通过一个hql,和传入的参数完成相应的查询任务
	public List getResult(String hql,Object [] parameters);
	//保存一个对象
	public void save(Object obj);
	//删除一个对象
	public void delete(Object obj);
	//更新一个对象
	public void update(Object obj);
	//根据 id返回一个对象
	public Object findById(Class clazz,Serializable id);
}

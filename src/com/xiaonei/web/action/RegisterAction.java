/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.xiaonei.web.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.xiaonei.bean.University;
import com.xiaonei.bean.Users;
import com.xiaonei.bean.Useruniversity;
import com.xiaonei.service.inter.CountryServiceInter;
import com.xiaonei.service.inter.ProvinceServiceInter;
import com.xiaonei.service.inter.UniversityServiceInter;
import com.xiaonei.service.inter.UserServiceInter;
import com.xiaonei.service.inter.UseruniversityServiceInter;
import com.xiaonei.web.form.UserForm;

/** 
 * MyEclipse Struts
 * Creation date: 12-20-2010
 * 
 * XDoclet definition:
 * @struts.action parameter="flag"
 */
public class RegisterAction extends DispatchAction {
	
	
	private CountryServiceInter countryService;
	
	
	private ProvinceServiceInter provinceService;
	
	private UniversityServiceInter universityService;
	
	private UserServiceInter userService;
	private UseruniversityServiceInter  useruniversityService;
	
	

	public UseruniversityServiceInter getUseruniversityService() {
		return useruniversityService;
	}
	public void setUseruniversityService(
			UseruniversityServiceInter useruniversityService) 
	{
		this.useruniversityService = useruniversityService;
	}

	public UniversityServiceInter getUniversityService() {
		return universityService;
	}

	public void setUniversityService(UniversityServiceInter universityService) {
		this.universityService = universityService;
	}

	public ProvinceServiceInter getProvinceService() {
		return provinceService;
	}

	public void setProvinceService(ProvinceServiceInter provinceService) {
		this.provinceService = provinceService;
	}

	public CountryServiceInter getCountryService() {
		return countryService;
	}

	public void setCountryService(CountryServiceInter countryService) {
		this.countryService = countryService;
	}

	//跳转到注册页面UI user interface(界面)
	public ActionForward regUI(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		//准备数据，供用户选择大学使用
		//国家
		request.setAttribute("countrylist",countryService.getResult("from Country", null));
		//省和直辖市的信息(默认中国)
		request.setAttribute("provincelist", provinceService.getResult
				("from Province where country.id=?", new Object[]{new Integer(1)}));
		//大学名字(默认显示北京)
		request.setAttribute("unilist", universityService.getResult
				("from University where province.id=? and country.id=?",  new Object[]{new Integer(1),new Integer(1)} ));
		
		//注册成功，则跳转到home.jsp
		return mapping.findForward("regUI");
	}
	
	//注册用户,真的添加到数据库.
	public ActionForward regUser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		//从该action对应的表单中，取出数据
		
		UserForm userForm = (UserForm)form;
		
		//取出信息，目的把用户保存
		Users user=new Users();
		user.setEmail(userForm.getEmail());
		user.setLoginDate(new java.util.Date());
		user.setName(userForm.getName());
		user.setPwd(userForm.getPwd());
		user.setRegisterDate(new java.util.Date());
		user.setSex(userForm.getSex());
		//先得到该用户的大学对象.
		University university=(University) universityService.findById(University.class,Integer.valueOf(userForm.getUniversityId()) );
		
		//创建该用户对应的用户大学记录
		Useruniversity useruniversity=new Useruniversity();
		
		useruniversity.setUsers(user);
		useruniversity.setUniversity(university);
		useruniversity.setUserType(userForm.getUserType());
		//保存用户
		userService.save(user);
		useruniversityService.save(useruniversity);
		
		
		//注册成功，则跳转到home.jsp
		return mapping.findForward("regok");
	}

	public UserServiceInter getUserService() {
		return userService;
	}

	public void setUserService(UserServiceInter userService) {
		this.userService = userService;
	}

	
}
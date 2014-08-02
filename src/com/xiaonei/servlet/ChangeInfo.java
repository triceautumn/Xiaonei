package com.xiaonei.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.xiaonei.bean.University;
import com.xiaonei.service.inter.UniversityServiceInter;



public class ChangeInfo extends HttpServlet {

	@SuppressWarnings("unchecked")
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		
		response.setContentType("text/xml;charset=utf-8");
		//ie���û���
		response.setHeader("Cache-Control", "no-cache"); 
		PrintWriter out = response.getWriter();
		//��Ӧ�û�ѡ��ͬʡ/ֱϽ�еĴ�ѧ��Ϣ���� 
		String proid=request.getParameter("proid");
		String cid=request.getParameter("cid");
		
		//��ȡspring����
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		//��spring�����У�ȡ���� UniversityServiceInter ���͵�bean
		UniversityServiceInter universityService=(UniversityServiceInter) ctx.getBean("universityServiceImpl");
		
		List<University> uniList=universityService.getResult
		("from University where province.id=? and country.id=?", 
				new Object[]{Integer.valueOf(proid),Integer.valueOf(cid)});
		
		String res = "<allUniversities>";
		
		for (int i = 0; i < uniList.size(); i++) {
			University u = uniList.get(i);
			res += "<unis><id>" + u.getId() + "</id><name><![CDATA["
					+ u.getName() + "]]></name></unis>";
		}
		res += "</allUniversities>";
		out.write(res);
		out.close();
		

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}

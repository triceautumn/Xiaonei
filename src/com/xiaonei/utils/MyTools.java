package com.xiaonei.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.upload.FormFile;

public class MyTools {

	//�ϴ�ͷ��ķ��� [�������ϴ���ͼƬ����]
	public static String uploadHead(HttpServletRequest request,FormFile ff,String id){
	
	 String newPhotoName="";
	 try{
		//���Ǹ�ÿ���û������Լ����ļ���.
		String filePath=request.getSession().getServletContext().getRealPath("/");
		//filePath���ǵ�ǰ���webӦ���Ǿ���·�� F:\apache-tomcat-6.0.20\webapps\xiaoneinew
		InputStream stream = ff.getInputStream();// ���ļ�����
		String oldPhotoName=ff.getFileName();
		newPhotoName=id+oldPhotoName.substring(oldPhotoName.indexOf("."), oldPhotoName.length());
		String newFullNewPath=filePath+"\\images\\"+id+"\\head\\";
		//�ж�newFullNewPath�ļ����Ƿ����
		File f=new File(newFullNewPath);
		if(!f.isDirectory()){
			//�����ļ���,��������
			f.mkdirs();
			
		}
		//���ϴ���ͷ�������޳ɳ� ���.��׺
		
		OutputStream bos = new FileOutputStream(newFullNewPath+ newPhotoName);
		int len = 0;
		byte[] buffer = new byte[8192];
		while ((len = stream.read(buffer, 0, 8192)) != -1) {
			bos.write(buffer, 0, len);// ���ļ�д�������
		}
		bos.close();
		stream.close();

	} catch (Exception e) {
		e.printStackTrace();
	}
	return newPhotoName;
	}
	
	
	//�ϴ�ͷ��ķ��� [�������ϴ���ͼƬ����] [��ϣ�����������ͼƬ��·�� /xiaoneinew/images/�û�id/head/albumid/ͼƬ]
	public static String uploadPhoto(HttpServletRequest request,FormFile ff,String uid,String albumId){
	
	 String newPhotoName="";
	 try{
		//���Ǹ�ÿ���û������Լ����ļ���.
		String filePath=request.getSession().getServletContext().getRealPath("/");
		//filePath���ǵ�ǰ���webӦ���Ǿ���·�� F:\apache-tomcat-6.0.20\webapps\xiaoneinew
		InputStream stream = ff.getInputStream();// ���ļ�����
		String photoName=ff.getFileName();
		String newFullNewPath=filePath+"\\images\\"+uid+"\\album\\"+albumId+"\\";
		//�ж�newFullNewPath�ļ����Ƿ����
		File f=new File(newFullNewPath);
		if(!f.isDirectory()){
			//�����ļ���,��������
			f.mkdirs();
			
		}
		//���ϴ���ͷ�������޳ɳ� ���.��׺
		newPhotoName=UUID.randomUUID().toString() + photoName.substring(photoName.indexOf("."), photoName.length());
		OutputStream bos = new FileOutputStream(newFullNewPath+ newPhotoName);
		int len = 0;
		byte[] buffer = new byte[8192];
		while ((len = stream.read(buffer, 0, 8192)) != -1) {
			bos.write(buffer, 0, len);// ���ļ�д�������
		}
		bos.close();
		stream.close();

	} catch (Exception e) {
		e.printStackTrace();
	}
	return newPhotoName;
	}
}

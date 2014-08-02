package com.xiaonei.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.upload.FormFile;

public class MyTools {

	//上传头像的方法 [返回你上传的图片名称]
	public static String uploadHead(HttpServletRequest request,FormFile ff,String id){
	
	 String newPhotoName="";
	 try{
		//考虑给每个用户创建自己的文件夹.
		String filePath=request.getSession().getServletContext().getRealPath("/");
		//filePath就是当前这个web应用是绝对路径 F:\apache-tomcat-6.0.20\webapps\xiaoneinew
		InputStream stream = ff.getInputStream();// 把文件读入
		String oldPhotoName=ff.getFileName();
		newPhotoName=id+oldPhotoName.substring(oldPhotoName.indexOf("."), oldPhotoName.length());
		String newFullNewPath=filePath+"\\images\\"+id+"\\head\\";
		//判断newFullNewPath文件夹是否存在
		File f=new File(newFullNewPath);
		if(!f.isDirectory()){
			//不是文件夹,创建即可
			f.mkdirs();
			
		}
		//把上传的头像名字修成成 编号.后缀
		
		OutputStream bos = new FileOutputStream(newFullNewPath+ newPhotoName);
		int len = 0;
		byte[] buffer = new byte[8192];
		while ((len = stream.read(buffer, 0, 8192)) != -1) {
			bos.write(buffer, 0, len);// 将文件写入服务器
		}
		bos.close();
		stream.close();

	} catch (Exception e) {
		e.printStackTrace();
	}
	return newPhotoName;
	}
	
	
	//上传头像的方法 [返回你上传的图片名称] [我希望保存的相册的图片的路径 /xiaoneinew/images/用户id/head/albumid/图片]
	public static String uploadPhoto(HttpServletRequest request,FormFile ff,String uid,String albumId){
	
	 String newPhotoName="";
	 try{
		//考虑给每个用户创建自己的文件夹.
		String filePath=request.getSession().getServletContext().getRealPath("/");
		//filePath就是当前这个web应用是绝对路径 F:\apache-tomcat-6.0.20\webapps\xiaoneinew
		InputStream stream = ff.getInputStream();// 把文件读入
		String photoName=ff.getFileName();
		String newFullNewPath=filePath+"\\images\\"+uid+"\\album\\"+albumId+"\\";
		//判断newFullNewPath文件夹是否存在
		File f=new File(newFullNewPath);
		if(!f.isDirectory()){
			//不是文件夹,创建即可
			f.mkdirs();
			
		}
		//把上传的头像名字修成成 编号.后缀
		newPhotoName=UUID.randomUUID().toString() + photoName.substring(photoName.indexOf("."), photoName.length());
		OutputStream bos = new FileOutputStream(newFullNewPath+ newPhotoName);
		int len = 0;
		byte[] buffer = new byte[8192];
		while ((len = stream.read(buffer, 0, 8192)) != -1) {
			bos.write(buffer, 0, len);// 将文件写入服务器
		}
		bos.close();
		stream.close();

	} catch (Exception e) {
		e.printStackTrace();
	}
	return newPhotoName;
	}
}

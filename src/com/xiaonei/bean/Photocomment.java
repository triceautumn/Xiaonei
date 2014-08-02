package com.xiaonei.bean;

import java.util.Date;

/**
 * Photocomment entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Photocomment implements java.io.Serializable {

	// Fields

	private Integer id;
	private Users users;
	private Photo photo;
	private String content;
	private Date comTime;

	// Constructors

	/** default constructor */
	public Photocomment() {
	}

	/** full constructor */
	public Photocomment(Users users, Photo photo, String content, Date comTime) {
		this.users = users;
		this.photo = photo;
		this.content = content;
		this.comTime = comTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Photo getPhoto() {
		return this.photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getComTime() {
		return this.comTime;
	}

	public void setComTime(Date comTime) {
		this.comTime = comTime;
	}

}
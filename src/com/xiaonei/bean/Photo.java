package com.xiaonei.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Photo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Photo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Album album;
	private String photo;
	private String descript;
	private Integer rtime;
	private Date addTime;
	private Set photocomments = new HashSet(0);

	// Constructors

	/** default constructor */
	public Photo() {
	}

	/** full constructor */
	public Photo(Album album, String photo, String descript, Integer rtime,
			Date addTime, Set photocomments) {
		this.album = album;
		this.photo = photo;
		this.descript = descript;
		this.rtime = rtime;
		this.addTime = addTime;
		this.photocomments = photocomments;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Album getAlbum() {
		return this.album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getDescript() {
		return this.descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public Integer getRtime() {
		return this.rtime;
	}

	public void setRtime(Integer rtime) {
		this.rtime = rtime;
	}

	public Date getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Set getPhotocomments() {
		return this.photocomments;
	}

	public void setPhotocomments(Set photocomments) {
		this.photocomments = photocomments;
	}

}
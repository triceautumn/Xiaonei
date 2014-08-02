package com.xiaonei.bean;

/**
 * Usernet entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Usernet implements java.io.Serializable {

	// Fields

	private Integer id;
	private Users users;
	private String name;
	private Short isPrimary;

	// Constructors

	/** default constructor */
	public Usernet() {
	}

	/** minimal constructor */
	public Usernet(String name) {
		this.name = name;
	}

	/** full constructor */
	public Usernet(Users users, String name, Short isPrimary) {
		this.users = users;
		this.name = name;
		this.isPrimary = isPrimary;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Short getIsPrimary() {
		return this.isPrimary;
	}

	public void setIsPrimary(Short isPrimary) {
		this.isPrimary = isPrimary;
	}

}
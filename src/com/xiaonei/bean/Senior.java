package com.xiaonei.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Senior entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Senior implements java.io.Serializable {

	// Fields

	private Integer id;
	private Town town;
	private City city;
	private String name;
	private Set userseniors = new HashSet(0);

	// Constructors

	/** default constructor */
	public Senior() {
	}

	/** minimal constructor */
	public Senior(String name) {
		this.name = name;
	}

	/** full constructor */
	public Senior(Town town, City city, String name, Set userseniors) {
		this.town = town;
		this.city = city;
		this.name = name;
		this.userseniors = userseniors;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Town getTown() {
		return this.town;
	}

	public void setTown(Town town) {
		this.town = town;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getUserseniors() {
		return this.userseniors;
	}

	public void setUserseniors(Set userseniors) {
		this.userseniors = userseniors;
	}

}
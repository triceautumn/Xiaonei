package com.xiaonei.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * University entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class University implements java.io.Serializable {

	// Fields

	private Integer id;
	private Province province;
	private Country country;
	private String name;
	private Set useruniversities = new HashSet(0);

	// Constructors

	/** default constructor */
	public University() {
	}

	/** minimal constructor */
	public University(String name) {
		this.name = name;
	}

	/** full constructor */
	public University(Province province, Country country, String name,
			Set useruniversities) {
		this.province = province;
		this.country = country;
		this.name = name;
		this.useruniversities = useruniversities;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Province getProvince() {
		return this.province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getUseruniversities() {
		return this.useruniversities;
	}

	public void setUseruniversities(Set useruniversities) {
		this.useruniversities = useruniversities;
	}

}
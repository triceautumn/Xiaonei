package com.xiaonei.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Province entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Province implements java.io.Serializable {

	// Fields

	private Integer id;
	private Country country;
	private String name;
	private Set userses = new HashSet(0);
	private Set cities = new HashSet(0);
	private Set universities = new HashSet(0);

	// Constructors

	/** default constructor */
	public Province() {
	}

	/** minimal constructor */
	public Province(String name) {
		this.name = name;
	}

	/** full constructor */
	public Province(Country country, String name, Set userses, Set cities,
			Set universities) {
		this.country = country;
		this.name = name;
		this.userses = userses;
		this.cities = cities;
		this.universities = universities;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Set getUserses() {
		return this.userses;
	}

	public void setUserses(Set userses) {
		this.userses = userses;
	}

	public Set getCities() {
		return this.cities;
	}

	public void setCities(Set cities) {
		this.cities = cities;
	}

	public Set getUniversities() {
		return this.universities;
	}

	public void setUniversities(Set universities) {
		this.universities = universities;
	}

}
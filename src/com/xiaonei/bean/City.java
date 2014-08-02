package com.xiaonei.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * City entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class City implements java.io.Serializable {

	// Fields

	private Integer id;
	private Province province;
	private String name;
	private Set primaryschools = new HashSet(0);
	private Set userses = new HashSet(0);
	private Set towns = new HashSet(0);
	private Set juniors = new HashSet(0);
	private Set techschools = new HashSet(0);
	private Set seniors = new HashSet(0);

	// Constructors

	/** default constructor */
	public City() {
	}

	/** minimal constructor */
	public City(String name) {
		this.name = name;
	}

	/** full constructor */
	public City(Province province, String name, Set primaryschools,
			Set userses, Set towns, Set juniors, Set techschools, Set seniors) {
		this.province = province;
		this.name = name;
		this.primaryschools = primaryschools;
		this.userses = userses;
		this.towns = towns;
		this.juniors = juniors;
		this.techschools = techschools;
		this.seniors = seniors;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getPrimaryschools() {
		return this.primaryschools;
	}

	public void setPrimaryschools(Set primaryschools) {
		this.primaryschools = primaryschools;
	}

	public Set getUserses() {
		return this.userses;
	}

	public void setUserses(Set userses) {
		this.userses = userses;
	}

	public Set getTowns() {
		return this.towns;
	}

	public void setTowns(Set towns) {
		this.towns = towns;
	}

	public Set getJuniors() {
		return this.juniors;
	}

	public void setJuniors(Set juniors) {
		this.juniors = juniors;
	}

	public Set getTechschools() {
		return this.techschools;
	}

	public void setTechschools(Set techschools) {
		this.techschools = techschools;
	}

	public Set getSeniors() {
		return this.seniors;
	}

	public void setSeniors(Set seniors) {
		this.seniors = seniors;
	}

}
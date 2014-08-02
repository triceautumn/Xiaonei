package com.xiaonei.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Users entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Integer id;
	private Primaryschool primaryschool;
	private City city;
	private Province province;
	private Junior junior;
	private Techschool techschool;
	private String email;
	private String name;
	private String pwd;
	private String photo;
	private String sex;
	private Date birth;
	private String tel;
	private String mobile;
	private String oicq;
	private String msn;
	private String website;
	private Integer techSchYear;
	private Integer juniorYear;
	private Integer primaryYear;
	private String interest;
	private String music;
	private String movie;
	private String game;
	private String cartoon;
	private String sport;
	private String book;
	private String assn;
	private Integer visited;
	private String doing;
	private Short uonline;
	private Date registerDate;
	private Date loginDate;
	private Short ulevel;
	private Short locked;
	private Set userseniors = new HashSet(0);
	private Set usernets = new HashSet(0);
	private Set useruniversities = new HashSet(0);
	private Set albums=new HashSet(0);
	private Set photocomments=new HashSet(0);


	// Constructors

	public Set getPhotocomments() {
		return photocomments;
	}

	public void setPhotocomments(Set photocomments) {
		this.photocomments = photocomments;
	}

	public Set getAlbums() {
		return albums;
	}

	public void setAlbums(Set albums) {
		this.albums = albums;
	}

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(String email, String name, String pwd) {
		this.email = email;
		this.name = name;
		this.pwd = pwd;
	}

	/** full constructor */
	public Users(Primaryschool primaryschool, City city, Province province,
			Junior junior, Techschool techschool, String email, String name,
			String pwd, String photo, String sex, Date birth, String tel,
			String mobile, String oicq, String msn, String website,
			Integer techSchYear, Integer juniorYear, Integer primaryYear,
			String interest, String music, String movie, String game,
			String cartoon, String sport, String book, String assn,
			Integer visited, String doing, Short uonline, Date registerDate,
			Date loginDate, Short ulevel, Short locked, Set userseniors,
			Set usernets, Set useruniversities) {
		this.primaryschool = primaryschool;
		this.city = city;
		this.province = province;
		this.junior = junior;
		this.techschool = techschool;
		this.email = email;
		this.name = name;
		this.pwd = pwd;
		this.photo = photo;
		this.sex = sex;
		this.birth = birth;
		this.tel = tel;
		this.mobile = mobile;
		this.oicq = oicq;
		this.msn = msn;
		this.website = website;
		this.techSchYear = techSchYear;
		this.juniorYear = juniorYear;
		this.primaryYear = primaryYear;
		this.interest = interest;
		this.music = music;
		this.movie = movie;
		this.game = game;
		this.cartoon = cartoon;
		this.sport = sport;
		this.book = book;
		this.assn = assn;
		this.visited = visited;
		this.doing = doing;
		this.uonline = uonline;
		this.registerDate = registerDate;
		this.loginDate = loginDate;
		this.ulevel = ulevel;
		this.locked = locked;
		this.userseniors = userseniors;
		this.usernets = usernets;
		this.useruniversities = useruniversities;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Primaryschool getPrimaryschool() {
		return this.primaryschool;
	}

	public void setPrimaryschool(Primaryschool primaryschool) {
		this.primaryschool = primaryschool;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Province getProvince() {
		return this.province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public Junior getJunior() {
		return this.junior;
	}

	public void setJunior(Junior junior) {
		this.junior = junior;
	}

	public Techschool getTechschool() {
		return this.techschool;
	}

	public void setTechschool(Techschool techschool) {
		this.techschool = techschool;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirth() {
		return this.birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOicq() {
		return this.oicq;
	}

	public void setOicq(String oicq) {
		this.oicq = oicq;
	}

	public String getMsn() {
		return this.msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Integer getTechSchYear() {
		return this.techSchYear;
	}

	public void setTechSchYear(Integer techSchYear) {
		this.techSchYear = techSchYear;
	}

	public Integer getJuniorYear() {
		return this.juniorYear;
	}

	public void setJuniorYear(Integer juniorYear) {
		this.juniorYear = juniorYear;
	}

	public Integer getPrimaryYear() {
		return this.primaryYear;
	}

	public void setPrimaryYear(Integer primaryYear) {
		this.primaryYear = primaryYear;
	}

	public String getInterest() {
		return this.interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getMusic() {
		return this.music;
	}

	public void setMusic(String music) {
		this.music = music;
	}

	public String getMovie() {
		return this.movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getGame() {
		return this.game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public String getCartoon() {
		return this.cartoon;
	}

	public void setCartoon(String cartoon) {
		this.cartoon = cartoon;
	}

	public String getSport() {
		return this.sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getBook() {
		return this.book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getAssn() {
		return this.assn;
	}

	public void setAssn(String assn) {
		this.assn = assn;
	}

	public Integer getVisited() {
		return this.visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public String getDoing() {
		return this.doing;
	}

	public void setDoing(String doing) {
		this.doing = doing;
	}



	public Short getUonline()
	{
		return uonline;
	}

	public void setUonline(Short uonline)
	{
		this.uonline = uonline;
	}

	public Date getRegisterDate() {
		return this.registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public Date getLoginDate() {
		return this.loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public Short getUlevel()
	{
		return ulevel;
	}

	public void setUlevel(Short ulevel)
	{
		this.ulevel = ulevel;
	}

	public Short getLocked()
	{
		return locked;
	}

	public void setLocked(Short locked)
	{
		this.locked = locked;
	}

	public Set getUserseniors() {
		return this.userseniors;
	}

	public void setUserseniors(Set userseniors) {
		this.userseniors = userseniors;
	}

	public Set getUsernets() {
		return this.usernets;
	}

	public void setUsernets(Set usernets) {
		this.usernets = usernets;
	}

	public Set getUseruniversities() {
		return this.useruniversities;
	}

	public void setUseruniversities(Set useruniversities) {
		this.useruniversities = useruniversities;
	}

}
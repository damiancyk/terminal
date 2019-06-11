package com.dmc.vo;

import java.util.Date;

import com.dmc.entity.User;

public class UserVo {

	private Integer id;
	private String email;
	private String firstname;
	private String lastname;
	private String about;
	private Double weight;
	private Date registerDate;

	public UserVo() {
	}

	public UserVo(User entity) {
		this.id = entity.getId();
		this.email = entity.getEmail();
		this.firstname = entity.getFirstname();
		this.lastname = entity.getLastname();
		this.about = entity.getAbout();
		this.weight = entity.getWeight();
		this.registerDate = entity.getRegisterDate();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

}

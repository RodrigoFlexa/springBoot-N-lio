package com.io.RodrigoFlexa.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false,length = 150)
	private String name;
	
	@Column(nullable = false,length = 150)
	
	private String email;
	@Column(nullable = false,length = 150)
	
	private String phone;
	@Column(nullable = false,length = 150)
	
	private String password;

	public Users() {
	}

	public Users(Integer iD, String name, String email, String phone, String password) {
		this.id = iD;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	public Integer getiD() {
		return this.id;
	}

	public void setiD(Integer iD) {
		this.id = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(id, other.id);
	}
}

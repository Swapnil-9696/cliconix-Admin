package com.cliconix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
	
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int uid;
	
	private String Fname;
	
	private String Lname;
	
	private String Email;

	private String Mobile;
	
	private String password;
	
	private int aid;
	
	private int pid;
	
	private String Role;

	public User(int uid, String fname, String lname, String email, String mobile, String password, int aid, int pid,
			String role) {
		super();
		this.uid = uid;
		Fname = fname;
		Lname = lname;
		Email = email;
		Mobile = mobile;
		this.password = password;
		this.aid = aid;
		this.pid = pid;
		Role = role;
	}
	
	

	public int getUid() {
		return uid;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", Fname=" + Fname + ", Lname=" + Lname + ", Email=" + Email + ", Mobile=" + Mobile
				+ ", password=" + password + ", aid=" + aid + ", pid=" + pid + ", Role=" + Role + "]";
	}

	
	
	
	
	
	
	

}




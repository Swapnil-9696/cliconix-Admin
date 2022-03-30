package com.cliconix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int aid;
	
	private int Room;
	
	private String Building;
	
	private String Streat;
	
	private String City;
	
	private String State;

	public Address(int aid, int room, String building, String streat, String city, String state) {
		super();
		this.aid = aid;
		Room = room;
		Building = building;
		Streat = streat;
		City = city;
		State = state;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getRoom() {
		return Room;
	}

	public void setRoom(int room) {
		Room = room;
	}

	public String getBuilding() {
		return Building;
	}

	public void setBuilding(String building) {
		Building = building;
	}

	public String getStreat() {
		return Streat;
	}

	public void setStreat(String streat) {
		Streat = streat;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", Room=" + Room + ", Building=" + Building + ", Streat=" + Streat + ", City="
				+ City + ", State=" + State + "]";
	}
	
	
	
	
	
	
}

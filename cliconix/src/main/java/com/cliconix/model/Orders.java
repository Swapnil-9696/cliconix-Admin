package com.cliconix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Orders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int oid;
	
	private int uid;
	
	private int prid;
	
	private int Quantity;
	
	private int pid;
	
	private int aid;
	
	private int SUm;

	public Orders(int oid, int uid, int prid, int quantity, int pid, int aid, int sUm) {
		super();
		this.oid = oid;
		this.uid = uid;
		this.prid = prid;
		Quantity = quantity;
		this.pid = pid;
		this.aid = aid;
		SUm = sUm;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getPrid() {
		return prid;
	}

	public void setPrid(int prid) {
		this.prid = prid;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getSUm() {
		return SUm;
	}

	public void setSUm(int sUm) {
		SUm = sUm;
	}

	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", uid=" + uid + ", prid=" + prid + ", Quantity=" + Quantity + ", pid=" + pid
				+ ", aid=" + aid + ", SUm=" + SUm + "]";
	}

	
	
}

package com.cliconix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cart {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int uid;
	
	private int prid;
	
	private int Quantity;
	
	private int Sum;

	public Cart(int uid, int prid, int quantity, int sum) {
		super();
		this.uid = uid;
		this.prid = prid;
		Quantity = quantity;
		Sum = sum;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getSum() {
		return Sum;
	}

	public void setSum(int sum) {
		Sum = sum;
	}

	@Override
	public String toString() {
		return "Cart [uid=" + uid + ", prid=" + prid + ", Quantity=" + Quantity + ", Sum=" + Sum + "]";
	}

	
	
	

}

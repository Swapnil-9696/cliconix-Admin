package com.cliconix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int prid;
	
	private int uid;
	
	private String ProdName;
	
	private String ProdDisc;
	
	private String ProdCat;
	
	private int ProdPrice;
	
	private int ProdQuants;
	
	private String Status;

	public Product(int prid, int uid, String prodName, String prodDisc, String prodCat, int prodPrice, int prodQuants,
			String status) {
		super();
		this.prid = prid;
		this.uid = uid;
		ProdName = prodName;
		ProdDisc = prodDisc;
		ProdCat = prodCat;
		ProdPrice = prodPrice;
		ProdQuants = prodQuants;
		Status = status;
	}
	
	

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getPrid() {
		return prid;
	}

	public void setPrid(int prid) {
		this.prid = prid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getProdName() {
		return ProdName;
	}

	public void setProdName(String prodName) {
		ProdName = prodName;
	}

	public String getProdDisc() {
		return ProdDisc;
	}

	public void setProdDisc(String prodDisc) {
		ProdDisc = prodDisc;
	}

	public String getProdCat() {
		return ProdCat;
	}

	public void setProdCat(String prodCat) {
		ProdCat = prodCat;
	}

	public int getProdPrice() {
		return ProdPrice;
	}

	public void setProdPrice(int prodPrice) {
		ProdPrice = prodPrice;
	}

	public int getProdQuants() {
		return ProdQuants;
	}

	public void setProdQuants(int prodQuants) {
		ProdQuants = prodQuants;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "Product [prid=" + prid + ", uid=" + uid + ", ProdName=" + ProdName + ", ProdDisc=" + ProdDisc
				+ ", ProdCat=" + ProdCat + ", ProdPrice=" + ProdPrice + ", ProdQuants=" + ProdQuants + ", Status="
				+ Status + "]";
	}

	
	
	

}

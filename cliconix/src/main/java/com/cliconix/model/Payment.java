package com.cliconix.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	
	private String Card;
	
	private int CVV;
	
	private Date date;

	public Payment(int pid, String card, int cVV, Date date) {
		super();
		this.pid = pid;
		Card = card;
		CVV = cVV;
		this.date = date;
	}

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getCard() {
		return Card;
	}

	public void setCard(String card) {
		Card = card;
	}

	public int getCVV() {
		return CVV;
	}

	public void setCVV(int cVV) {
		CVV = cVV;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Payment [pid=" + pid + ", Card=" + Card + ", CVV=" + CVV + ", date=" + date + "]";
	}
	
	

}

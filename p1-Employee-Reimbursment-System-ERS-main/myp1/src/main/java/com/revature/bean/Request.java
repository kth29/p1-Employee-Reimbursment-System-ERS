package com.revature.bean;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
@Table(name = "requests")
public class Request {
	
	enum ReimbType {
		LODGING, TRAVEL, FOOD, OTHER
	}
	
	enum Status {
		PENDING, APPROVED, DENIED
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int reimbId;
	
	@Column
	private double amount;
	
	@Column(name = "auth")
	@ManyToOne
	@JoinColumn(name = "userId")
	private int authId;
	
	@Column(name = "resolver")
	@ManyToOne
	@JoinColumn(name = "userId")
	private int resId;
	
	@Column(name = "submitted")
	private LocalDateTime sub;
	
	@Column(name = "resolved")
	private LocalDateTime res;
	
	@Column
	private String descr;
	
	@Column
	private ReimbType type;
	
	@Column
	private Status status;
	
	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getReimbId() {
		return reimbId;
	}

	public void setReimbId(int reimbId) {
		this.reimbId = reimbId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getAuthId() {
		return authId;
	}

	public void setAuthId(int authId) {
		this.authId = authId;
	}

	public int getResId() {
		return resId;
	}

	public void setResId(int resId) {
		this.resId = resId;
	}

	public LocalDateTime getSub() {
		return sub;
	}

	public void setSub(LocalDateTime sub) {
		this.sub = sub;
	}

	public LocalDateTime getRes() {
		return res;
	}

	public void setRes(LocalDateTime res) {
		this.res = res;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public ReimbType getReimbType() {
		return type;
	}

	public void setReimbType(ReimbType type) {
		this.type = type;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Request [reimbId=" + reimbId + ", amount=" + amount + ", authId=" + authId + ", resId=" + resId
				+ ", sub=" + sub + ", res=" + res + ", descr=" + descr + ", type=" + type + ", status="
				+ status + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, authId, descr, reimbId, type, res, resId, status, sub);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Request other = (Request) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount) && authId == other.authId
				&& Objects.equals(descr, other.descr) && reimbId == other.reimbId && type == other.type
				&& Objects.equals(res, other.res) && resId == other.resId && status == other.status
				&& Objects.equals(sub, other.sub);
	}
	
	

}

package com.yiibai;

import javax.persistence.*;

@Entity
@Table(name = "contractemployee103")
@PrimaryKeyJoinColumn(name = "ID")
public class Contract_Employee extends Employee {

	@Column(name = "pay_per_hour")
	private float pay_per_hour;

	@Column(name = "contract_duration")
	private String contract_duration;

	public float getPay_per_hour() {
		return pay_per_hour;
	}

	public void setPay_per_hour(float pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}

	public String getContract_duration() {
		return contract_duration;
	}

	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}

	// setters and getters
	
}
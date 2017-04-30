package com.yiibai;

/**
 * 
 * @author by maxsu
 * @copyright http://www.yiibai.com
 * @link download at: http://www.yiibai.com/siteinfo/download.html
 */
import javax.persistence.*;

@Entity  
@DiscriminatorValue("contractemployee")  
public class Contract_Employee extends Employee {

	@Column(name = "pay_per_hour")
	private float pay_per_hour;

	@Column(name = "contract_duration")
	private String contract_duration;

	public float getPay_per_hour() {
		return pay_per_hour;
	}

	public void setPay_per_hour(float payPerHour) {
		pay_per_hour = payPerHour;
	}

	public String getContract_duration() {
		return contract_duration;
	}

	public void setContract_duration(String contractDuration) {
		contract_duration = contractDuration;
	}
}
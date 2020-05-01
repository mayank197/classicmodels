package com.project.classicmodels.cars.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the payments database table.
 * 
 */
@Embeddable
public class PaymentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="customer_number",insertable=false, updatable=false)
	private Integer customerNumber;

	@Column(name="cheque_number")
	private String chequeNumber;

	public PaymentPK() {
	}
	public Integer getCustomerNumber() {
		return this.customerNumber;
	}
	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCheckNumber() {
		return this.chequeNumber;
	}
	public void setCheckNumber(String checkNumber) {
		this.chequeNumber = checkNumber;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PaymentPK)) {
			return false;
		}
		PaymentPK castOther = (PaymentPK)other;
		return 
			(this.customerNumber == castOther.customerNumber)
			&& this.chequeNumber.equals(castOther.chequeNumber);
	}

	@Override
	public int hashCode() {
		final Integer prime = 31;
		Integer hash = 17;
		hash = hash * prime + this.customerNumber;
		hash = hash * prime + this.chequeNumber.hashCode();
		
		return hash;
	}
}
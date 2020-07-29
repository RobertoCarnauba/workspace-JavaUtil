package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private int number;
	private Date date;
	private Double totalvalue;
	
	List<Installment> installment = new ArrayList<Installment>();
	
	public Contract(){
	}

	public Contract(int number, Date date, Double totalvalue) {
		super();
		this.number = number;
		this.date = date;
		this.totalvalue = totalvalue;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalvalue() {
		return totalvalue;
	}

	public void setTotalvalue(Double totalvalue) {
		this.totalvalue = totalvalue;
	}

	public List<Installment> getInstallment() {
		return installment;
	}

}

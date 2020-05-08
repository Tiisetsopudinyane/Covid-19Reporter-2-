package com.covid.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "regional")
public class RegionalModel {

	@Id
	@Column
	private Integer rcode;
	
	@Column
	private String rname;
	
	@Column
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private LocalDate rdate;
	
	@Column
	private String confirmed_cases;
	
	@Column
	private String recovered;
	
	@Column
	private int deaths;
	
	@Column
	private int hospitalized;
	
	@Column
	private int new_cases;

	public Integer getRcode() {
		return rcode;
	}

	public void setRcode(Integer rcode) {
		this.rcode = rcode;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public LocalDate getRdate() {
		return rdate;
	}

	public void setRdate(LocalDate rdate) {
		this.rdate = rdate;
	}

	public String getConfirmed_cases() {
		return confirmed_cases;
	}

	public void setConfirmed_cases(String confirmed_cases) {
		this.confirmed_cases = confirmed_cases;
	}

	public String getRecovered() {
		return recovered;
	}

	public void setRecovered(String recovered) {
		this.recovered = recovered;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public int getHospitalized() {
		return hospitalized;
	}

	public void setHospitalized(int hospitalized) {
		this.hospitalized = hospitalized;
	}

	public int getNew_cases() {
		return new_cases;
	}

	public void setNew_cases(int new_cases) {
		this.new_cases = new_cases;
	}

	@Override
	public String toString() {
		return "RegionalModel [rcode=" + rcode + ", rname=" + rname + ", rdate=" + rdate + ", confirmed_cases="
				+ confirmed_cases + ", recovered=" + recovered + ", deaths=" + deaths + ", hospitalized=" + hospitalized
				+ ", new_cases=" + new_cases + "]";
	}


	
	
}

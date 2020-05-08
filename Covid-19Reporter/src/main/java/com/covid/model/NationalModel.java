package com.covid.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "national")
public class NationalModel{
	
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private LocalDate rdate;
	
	@Column
	private int confirmed_cases;
	
	@Column
	private int recovered;
	
	@Column
	private int deaths;
	
	@Column
	private int hospitalized;
	
	@Column
	private int new_cases;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public LocalDate getRdate() {
		return rdate;
	}

	public void setRdate(LocalDate rdate) {
		this.rdate = rdate;
	}

	public int getConfirmed_cases() {
		return confirmed_cases;
	}

	public void setConfirmed_cases(int confirmed_cases) {
		this.confirmed_cases = confirmed_cases;
	}

	public int getRecovered() {
		return recovered;
	}

	public void setRecovered(int recovered) {
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

	public void setHospitalzed(int hospitalized) {
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
		return "NationalModel [id=" + id + ", confirmed_cases=" + confirmed_cases + ", recovered=" + recovered
				+ ", deaths=" + deaths + ", hospitalised=" + hospitalized + ", new_cases=" + new_cases + "]";
	}
	
	
}

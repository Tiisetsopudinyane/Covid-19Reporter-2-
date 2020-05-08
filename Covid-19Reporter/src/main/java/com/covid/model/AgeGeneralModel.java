package com.covid.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agegeneral")
public class AgeGeneralModel {
	
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private int male_cases;
	
	@Column
	private int male_deaths;
	
	@Column
	private int female_cases;
	
	@Column
	private int female_deaths;
	
	@Column
	private int total_cases;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getMale_cases() {
		return male_cases;
	}

	public void setMale_cases(int male_cases) {
		this.male_cases = male_cases;
	}

	public int getMale_deaths() {
		return male_deaths;
	}

	public void setMale_deaths(int male_deaths) {
		this.male_deaths = male_deaths;
	}

	public int getFemale_cases() {
		return female_cases;
	}

	public void setFemale_cases(int female_cases) {
		this.female_cases = female_cases;
	}

	public int getFemale_deaths() {
		return female_deaths;
	}

	public void setFemale_deaths(int female_deaths) {
		this.female_deaths = female_deaths;
	}

	public int getTotal_cases() {
		return total_cases;
	}

	public void setTotal_cases(int total_cases) {
		this.total_cases = total_cases;
	}

	@Override
	public String toString() {
		return "AgeGeneralModel [id=" + id + ", male_cases=" + male_cases + ", male_deaths=" + male_deaths
				+ ", female_cases=" + female_cases + ", female_deaths=" + female_deaths + ", total_cases=" + total_cases
				+ "]";
	}
	
	
}

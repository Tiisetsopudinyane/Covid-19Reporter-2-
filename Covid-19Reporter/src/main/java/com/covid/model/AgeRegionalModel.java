package com.covid.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ageregional")
public class AgeRegionalModel {
	
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String region; 
	
	@Column
	private String class1; 
	
	@Column
	private String class2; 
	
	@Column
	private String class3; 
	
	@Column
	private String class4; 
	
	@Column
	private String class5; 
	
	@Column
	private String class6; 
	
	@Column
	private String calss7; 
	
	@Column
	private String class8; 
	
	@Column
	private String class9; 
	
	@Column
	private String class10;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getClass1() {
		return class1;
	}

	public void setClass1(String class1) {
		this.class1 = class1;
	}

	public String getClass2() {
		return class2;
	}

	public void setClass2(String class2) {
		this.class2 = class2;
	}

	public String getClass3() {
		return class3;
	}

	public void setClass3(String class3) {
		this.class3 = class3;
	}

	public String getClass4() {
		return class4;
	}

	public void setClass4(String class4) {
		this.class4 = class4;
	}

	public String getClass5() {
		return class5;
	}

	public void setClass5(String class5) {
		this.class5 = class5;
	}

	public String getClass6() {
		return class6;
	}

	public void setClass6(String class6) {
		this.class6 = class6;
	}

	public String getCalss7() {
		return calss7;
	}

	public void setCalss7(String calss7) {
		this.calss7 = calss7;
	}

	public String getClass8() {
		return class8;
	}

	public void setClass8(String class8) {
		this.class8 = class8;
	}

	public String getClass9() {
		return class9;
	}

	public void setClass9(String class9) {
		this.class9 = class9;
	}

	public String getClass10() {
		return class10;
	}

	public void setClass10(String class10) {
		this.class10 = class10;
	}

	@Override
	public String toString() {
		return "AgeRegionalModel [id=" + id + ", region=" + region + ", class1=" + class1 + ", class2=" + class2
				+ ", class3=" + class3 + ", class4=" + class4 + ", class5=" + class5 + ", class6=" + class6
				+ ", calss7=" + calss7 + ", class8=" + class8 + ", class9=" + class9 + ", class10=" + class10 + "]";
	} 
	
	
	
	
}

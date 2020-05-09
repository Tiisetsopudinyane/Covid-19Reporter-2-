package com.covid.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.DAO.AgeGeneralRepository;
import com.covid.DAO.NationalRepository;
import com.covid.DAO.RegionalRepository;
import com.covid.model.AgeGeneralModel;
import com.covid.model.NationalModel;
import com.covid.model.RegionalModel;


@Service
@Transactional
public class Covid19Service {
	
	@Autowired
	NationalRepository nationalRepo;
	@Autowired
	RegionalRepository regionalRepo;
	@Autowired
	AgeGeneralRepository ageRepo;
	
	public List<NationalModel> pullNationalData() {
		return nationalRepo.findAll();
	}

	public List<RegionalModel> pullRegionalData() {
		return regionalRepo.findAll();
	}
	
	public List<AgeGeneralModel> pullAgeData() {
		return ageRepo.findAll();
	}
	
	public RegionalModel findRerionData(int cityID) {
		return regionalRepo.getOne(cityID);
	}
}

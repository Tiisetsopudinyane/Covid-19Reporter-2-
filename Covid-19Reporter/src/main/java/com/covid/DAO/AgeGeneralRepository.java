package com.covid.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.model.AgeGeneralModel;

public interface AgeGeneralRepository extends JpaRepository<AgeGeneralModel, Integer> {

}

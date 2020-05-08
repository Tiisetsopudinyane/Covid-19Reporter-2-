package com.covid.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.model.RegionalModel;

public interface RegionalRepository extends JpaRepository<RegionalModel, Integer> {

}

package com.covid.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid.model.NationalModel;


@Repository
public interface NationalRepository extends JpaRepository<NationalModel, Integer>{
	
}

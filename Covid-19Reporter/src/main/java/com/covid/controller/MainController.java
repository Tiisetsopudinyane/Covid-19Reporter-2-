package com.covid.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.covid.DAO.NationalRepository;
import com.covid.model.NationalModel;
import com.covid.service.Covid19Service;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;




@Controller
public class MainController {
	@Autowired
	Covid19Service dataDAO;

	
	@RequestMapping("/")
	public ModelAndView showHome() {
		
		ModelAndView mv = new ModelAndView("index");
	
		mv.addObject("national", dataDAO.pullNationalData());
		
		return mv;
	}
	
	@RequestMapping("/drawchart")
	@ResponseBody
	public String getdatafromDB(){
		//List<NationalModel> dataList = dataDAO.pullNationalData();
		
		JsonArray ncases = new JsonArray();
		JsonArray date = new JsonArray();
		JsonObject json = new JsonObject();
		
		dataDAO.pullNationalData().forEach(data->{
			ncases.add(data.getNew_cases());
			date.add(data.getRdate().toString());
		});
		
		json.add("newCases", ncases);
		json.add("reportDate", date);
		return json.toString();
	}
	
	@RequestMapping("/regional")
	public ModelAndView getSecondaryData() {
		
		ModelAndView mv = new ModelAndView("regional");
		
		mv.addObject("regional", dataDAO.pullRegionalData() );
		mv.addObject("first", dataDAO.pullRegionalData().get(0));
		
		return mv;
	}
	
	@
	RequestMapping (value = "/regional/{val}", method = RequestMethod.POST)
	public ModelAndView getCityData(@PathVariable int val) {
		
		ModelAndView mv = new ModelAndView("regional");
		
		mv.addObject("regional", dataDAO.pullRegionalData() );
		mv.addObject("first", dataDAO.pullRegionalData().get(0));//Edit first put city data
		
		return mv;
	}
}

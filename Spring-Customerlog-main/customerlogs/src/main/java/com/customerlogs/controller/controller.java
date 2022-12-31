package com.customerlogs.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
// import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
// import java.util.TimeZone;

import com.customerlogs.entity.*;
import com.customerlogs.repository.*;


@Controller
public class controller {
	
	@Autowired	
	repository repo;
	
	@RequestMapping("/checkIn")
	@ResponseBody
	public List<Customerlogs> in(@RequestParam String name)
	{
		Customerlogs cust = new Customerlogs();
		// cust.setId(id);
		cust.setName(name);
		LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        String date=localDate.toString();
        String time=localTime.toString();
		cust.setLogType("IN");
		cust.setDate(date);
		cust.setTime(time);
		cust.setId(name.concat(" ").concat(time));
		repo.save(cust);
		
		 return repo.display(name);
	}

	@RequestMapping("/checkOut")
	@ResponseBody
	public List<Customerlogs> out(@RequestParam String name)
	{
		Customerlogs cust = new Customerlogs();
		// cust.setId(id);
		cust.setName(name);
		LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        String date=localDate.toString();
        String time=localTime.toString();
		cust.setLogType("OUT");
		cust.setDate(date);
		cust.setTime(time);
		cust.setId(name.concat(" ").concat(time));
		repo.save(cust);
		
		 return repo.display(name);
	}

	
	@RequestMapping("/getLog")
	@ResponseBody
	public List<Customerlogs> getlog(@RequestParam String date)
	{
		return repo.getByDate(date);
	}
	
	@RequestMapping("/getAllLog")
	@ResponseBody
	public List<Customerlogs> getall()
	{
		return repo.getAllLog();
	}
	

}

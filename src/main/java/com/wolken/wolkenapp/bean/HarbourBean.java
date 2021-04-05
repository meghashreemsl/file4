package com.wolken.wolkenapp.bean;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
// component is used to create object  //Inversion of control(IOC)
@Component  
public class HarbourBean {
	
	@Value("jawaharlal nehru port") //PASS THE VALUE 
	private String harbourName;
	@Value("India")
	private String country;
	@Autowired //INSTEAD OF USING REF IN XML USING AUTOWIRED is used
	private ShipsBean shipsBean;
	
	public void harbour() {
		System.out.println("harbour details");
	}
	
	

}

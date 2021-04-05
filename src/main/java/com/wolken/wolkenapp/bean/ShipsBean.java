package com.wolken.wolkenapp.bean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class ShipsBean {
	@Value("titanic")
	private String shipName;
	@Value("Indian ocean")
	private String oceanName;
	
	public void ships() {
		System.out.println("Ship details");
	}

}

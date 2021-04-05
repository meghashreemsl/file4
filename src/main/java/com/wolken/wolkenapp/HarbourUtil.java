package com.wolken.wolkenapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.wolkenapp.bean.HarbourBean;
import com.wolken.wolkenapp.bean.ShipsBean;

public class HarbourUtil {
	public static void main(String[] args) {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("context.spring.xml");
		HarbourBean bean = applicationContext.getBean(HarbourBean.class);
		bean.harbour();
		System.out.println(bean.getHarbourName()+" "+bean.getCountry());

		ShipsBean bean2 = applicationContext.getBean(ShipsBean.class);
		bean2.ships();
		System.out.println(bean2.getShipName()+" "+ bean2.getOceanName());
		
		
	}
	ApplicationContext applicationContext= new ClassPathXmlApplicationContext("context.spring.xml");
	HarbourBean bean = applicationContext.getBean(HarbourBean.class);
	
	ShipsBean bean2 = applicationContext.getBean(ShipsBean.class);
	
	
	

}

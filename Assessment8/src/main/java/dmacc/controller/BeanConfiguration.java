package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.LobsterTail;
import dmacc.beans.CrabLegs;

/**
 * Nicholas Hernandez - NHernandez6
 * CIS175 - Fall 2023
 * Nov 25, 2023
 */
@Configuration
public class BeanConfiguration {

		@Bean
		public LobsterTail LobsterTail() {
			LobsterTail bean = new LobsterTail();
			bean.setWeight("1 lbs");
			bean.setPrice(20.00);
			bean.setFlavor("Garlic, medium spicy");
			return bean;
	}
		
		@Bean
		public CrabLegs CrabLegs() {
			CrabLegs bean = new CrabLegs(1, "Snow crab legs");
			return bean;
		}

}

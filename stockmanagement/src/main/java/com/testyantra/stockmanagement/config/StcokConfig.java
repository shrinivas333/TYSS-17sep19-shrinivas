package com.testyantra.stockmanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class StcokConfig {

	
	@Bean
	  public LocalEntityManagerFactoryBean geEntityManagerFactoryBean() {
		  LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
		  bean.setPersistenceUnitName("product-unit");
		  return bean;
	}
}

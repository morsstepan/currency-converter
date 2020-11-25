package com.github.morsstepan.ysu.moderntechnologies.converter.currencyconverter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients("com.github.morsstepan.ysu.moderntechnologies.converter.currencyconverter")
@EnableDiscoveryClient
@SpringBootApplication
public class CurrencyConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConverterApplication.class, args);
	}

}

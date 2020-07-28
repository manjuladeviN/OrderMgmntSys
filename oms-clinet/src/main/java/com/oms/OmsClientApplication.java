package com.oms;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import com.oms.controller.OmsControllerClient;

@SpringBootApplication
@EnableFeignClients
public class OmsClientApplication {

	public static void main(String[] args) throws RestClientException, IOException {
		ApplicationContext ctx = SpringApplication.run(
				OmsClientApplication.class, args);
		
		OmsControllerClient omsControllerClient=ctx.getBean(OmsControllerClient.class);
		System.out.println(omsControllerClient);
		omsControllerClient.getOrderItems();
		omsControllerClient.getOrders();
		omsControllerClient.cretaeOrderItems();
		omsControllerClient.cretaeOrders();
		
	}
	
	@Bean
	public  OmsControllerClient  omsControllerClient()
	{
		return  new OmsControllerClient();
	}
}
package com.shop;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shop.bill.Billing;
import com.shop.bill.BillingImpl;
import com.shop.config.AppConfig;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;
import com.shop.pm.PriceMatrixImpl_v2;

public class App {

	public static void main(String[] args) {

		// some-one & 'container'

		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// use
		Billing billing = context.getBean(Billing.class);
		List<String> cart = Arrays.asList("234234", "23424");
		double total = billing.getTotalPrice(cart);
		System.out.println(total);

		// destroy
		context.close();

	}

}

package com.shop;

import java.util.Arrays;
import java.util.List;

import com.shop.bill.BillingImpl;

public class App {

	public static void main(String[] args) {

		// init
		BillingImpl billing = new BillingImpl();

		// use
		List<String> cart = Arrays.asList("234234", "23424");
		double total = billing.getTotalPrice(cart);
		System.out.println(total);

		// destroy
		//..

	}

}

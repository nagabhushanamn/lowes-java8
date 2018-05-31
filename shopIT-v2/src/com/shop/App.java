package com.shop;

import java.util.Arrays;
import java.util.List;

import com.shop.bill.Billing;
import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;
import com.shop.pm.PriceMatrixImpl_v2;

public class App {

	public static void main(String[] args) {

		// some-one & 'container'

		// init
		PriceMatrix priceMatrixV1=new PriceMatrixImpl_v1();
		PriceMatrix priceMatrixV2=new PriceMatrixImpl_v2();
		Billing billing = new BillingImpl();
		billing.setPriceMatrix(priceMatrixV2);

		// use
		List<String> cart = Arrays.asList("234234", "23424");
		double total = billing.getTotalPrice(cart);
		System.out.println(total);

		// destroy
		// ..

	}

}

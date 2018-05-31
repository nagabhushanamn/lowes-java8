package com.shop.bill;

import java.util.List;

import com.shop.pm.PriceMatrix;

public interface Billing {

	void setPriceMatrix(PriceMatrix priceMatrix);

	double getTotalPrice(List<String> cart);

}
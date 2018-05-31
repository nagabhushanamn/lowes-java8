package com.shop.pm;

import org.springframework.stereotype.Service;

@Service("priceMatrix")
public class PriceMatrixImpl_v1 implements PriceMatrix{
	
	public double getPrice(String Ïitem) {
		//...
		return 100.00;
	}

}

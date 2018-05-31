package com.shop.bill;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.pm.PriceMatrix;

/*
 * 
 *  design &  performance issues
 *  -----------------------------
 *  
 *  =>  tight-coupling b/w dependent & dependency
 *  		  -> can/t extend new features
 *  =>  too many dependency instances are created & destructed...
 *  		  -> slow, memory use hight.. 
 *  =>  unit-testing not possible..
 *  		  -> dev & bug-fix slow
 *  
 *  --------------------------------------------------------------
 *  
 *   y these issues in this component ?
 *   
 *    ==> dependent itself creating it's own dependencies
 *    
 *   soln : don't create dependency in dependent's class  , do Lookup
 *   
 *   limitation on lookup:  location-tight coupling..
 *   
 *   best-soln : dont create, lookup  , get/inject thru 'some-one'(container) ==> IOC ( Inversion of control )
 *   
 *   how to  implement IOC ?
 *   
 *   	=> DI ( dependency injection )
 *      => AOP
 *   
 *   
 *   => DI ( dependency injection )
 *   
 *   		-> constructor
 *          -> setter
 *          -> field ( using reflection api )
 *          -> method..
 *          
 *    -------------------------------------------------------------------
 *    
 *           S — Single responsibility principle
 *           O — Open for extensions & closed for modification principle
 *           L — Liskov substitution principle ( strategy design pattern  => polymorphic )
 *           I — Interface segregation principle
 *           D — Dependency Inversion principle
 * 
 * 	-------------------------------------------------------------------
 */

@Service("billing")
public class BillingImpl implements Billing {

	private PriceMatrix priceMatrix; // local price

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shop.bill.Billing#setPriceMatrix(com.shop.pm.PriceMatrix)
	 */
	@Autowired
	@Override
	public void setPriceMatrix(PriceMatrix priceMatrix) {
		this.priceMatrix = priceMatrix;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shop.bill.Billing#getTotalPrice(java.util.List)
	 */
	@Override
	public double getTotalPrice(List<String> cart) {
		double total = 0.0;
		for (String item : cart) {
			total += priceMatrix.getPrice(item);
		}
		return total;
	}

}

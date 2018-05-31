package com.shop.bill;

import java.util.List;

import com.shop.pm.PriceMatrixImpl_v1;

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
 *           L — Liskov substitution principle
 *           I — Interface segregation principle
 *           D — Dependency Inversion principle
 * 
 * 	-------------------------------------------------------------------
 */

public class BillingImpl {

	private PriceMatrixImpl_v1 priceMatrix; // local price

	public double getTotalPrice(List<String> cart) {
		priceMatrix = new PriceMatrixImpl_v1();
		double total = 0.0;
		for (String item : cart) {
			total += priceMatrix.getPrice(item);
		}
		return total;
	}

}

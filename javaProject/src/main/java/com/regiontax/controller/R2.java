
package com.regiontax.controller;


import com.regiontax.GlobeRegion;

/**
 * @author Piyush Soni
 *
 */
public class R2 implements GlobeRegion {

	
	@Override
	public int getProductPrice() {

		return 700000;
	}

	@Override
	public int calculateProductPrice() {
		return 0;
	}

	@Override
	public double getTax() {
		
		return calculateTax(getProductPrice(), 40);
	}
}

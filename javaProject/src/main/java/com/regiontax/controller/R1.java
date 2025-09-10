/**
 * 
 */
package com.regiontax.controller;


import com.regiontax.GlobeRegion;

/**
 * @author Piyush Soni
 *
 */
public class R1 implements GlobeRegion {

	@Override
	public int getProductPrice() {

		return 400000;
	}

	@Override
	public int calculateProductPrice() {
		return 0;
	}

	@Override
	public double getTax() {

		return calculateTax(400000, 30);
	}

}


package com.maximum;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class MaximumTest {

	Maximum max;

	@Before
	public void initialize() {
		max = new Maximum();
	}

	@Test
	public void givenMaxNumber_At1stPosition_ReturnNumber() {
		Assert.assertEquals(new Integer(3), max.findMaximumInteger(new Integer[] {3,2,1}));		
	}	
	@Test
	public void givenMaxNumber_At2ndPosition_ReturnNumber() {
		Assert.assertEquals(new Integer(4), max.findMaximumInteger(new Integer[] {3,4,1}));		
	}
	@Test
	public void givenMaxNumber_At3rdPosition_ReturnNumber() {
		Assert.assertEquals(new Integer(5), max.findMaximumInteger(new Integer[] {3,4,5}));		
	}
	
	
	@Test
	public void givenMaxFloat_At1stPosition_ReturnFloat() {
		Assert.assertEquals(new Float(3f), max.findMaximumFloat(new Float[] {3f,2f,1f}));		
	}	
	@Test
	public void givenMaxFloat_At2ndPosition_ReturnFloat() {
		Assert.assertEquals(new Float(4f), max.findMaximumFloat(new Float[] {3f,4f,1f}));		
	}
	@Test
	public void givenMaxFloat_At3Position_ReturnFloat() {
		Assert.assertEquals(new Float(5f), max.findMaximumFloat(new Float[] {3f,4f,5f}));		
	}

}
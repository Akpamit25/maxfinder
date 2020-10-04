
package com.maximum;
public class Maximum {
		
	public Integer findMaximumInteger(Integer[] integers) {
		
		Integer maxInt=integers[0];
		if(integers[1].compareTo(maxInt)>0)
			maxInt=integers[1];
		if(integers[2].compareTo(maxInt)>0)
			maxInt=integers[2];
		System.out.println(maxInt);
		
		return maxInt;	
		
	}

}
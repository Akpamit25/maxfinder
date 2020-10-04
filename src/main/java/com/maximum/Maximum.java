
package com.maximum;

import java.lang.Comparable;

public class Maximum {

	public Integer findMaximumInteger(Integer[] integers) {

		Integer maxInt = integers[0];
		if (integers[1].compareTo(maxInt) > 0)
			maxInt = integers[1];
		if (integers[2].compareTo(maxInt) > 0)
			maxInt = integers[2];

		return maxInt;
	}

	public Float findMaximumFloat(Float[] numbers) {

		Float maxFloat = numbers[0];
		if (numbers[1].compareTo(maxFloat) > 0)
			maxFloat = numbers[1];
		if (numbers[2].compareTo(maxFloat) > 0)
			maxFloat = numbers[2];

		return maxFloat;
	}

	public String findMaximumString(String[] sequence) {

		String maxString = sequence[0];
		if (sequence[1].compareTo(maxString) > 0)
			maxString = sequence[1];
		if (sequence[2].compareTo(maxString) > 0)
			maxString = sequence[2];

		return maxString;

	}

}
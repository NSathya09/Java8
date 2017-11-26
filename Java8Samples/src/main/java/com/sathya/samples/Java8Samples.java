/**
 * 
 */
package com.sathya.samples;

import java.util.Arrays;
import java.util.List;

/**
 * @author admin
 *
 */
public class Java8Samples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(1,2,3,4);
		
		numList.stream().map(i->i);
	}

}

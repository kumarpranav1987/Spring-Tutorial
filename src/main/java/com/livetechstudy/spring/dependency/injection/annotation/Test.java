package com.livetechstudy.spring.dependency.injection.annotation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		String [] DEFAULT_REPLACEVALUE = new String[] {"No replacement value specified"};
		List replaceValuesList = new LinkedList();
		replaceValuesList = Arrays.asList(DEFAULT_REPLACEVALUE); 
		System.out.println((String[]) replaceValuesList.toArray());
	}

}

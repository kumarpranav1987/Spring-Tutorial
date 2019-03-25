package com.livetechstudy.spring.dependency.injection.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	@Autowired
	private SortingAlgo algo;

	public BinarySearch(SortingAlgo algo) {
		this.algo = algo;
	}
	
	public void search() {
		System.out.println("Binary Searched");
	}
}

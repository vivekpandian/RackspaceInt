package com.rackspace.interview.service;

import java.util.ArrayList;
import java.util.List;

public class FibanocciServiceImpl implements FibanocciService {

	public List<Integer> getFirstNFibanocci (int n) {
		
		List<Integer> fibanocciList = new ArrayList<Integer>();
		
		int f1 = 0;
		int f2 = 1;
		int f3 = 0;
		
		if (n < 0) {
			throw new IllegalArgumentException("n is negative. n must be a positive number <= 47");
		}
		else if (n == 0) {
			return fibanocciList;
		}
		else if (n > 47) {
			throw new IllegalArgumentException("n is too large. n must be <= 47");
		}
		
		if (n >=1) {
			fibanocciList.add (f1);
		}
		
		if (n >=2) {
			fibanocciList.add (f2);
		}

		for (int i=0;i<n-2;i++) {
			f3 = f1 + f2;
			fibanocciList.add (f3);
			f1 = f2;
			f2 = f3;
		}
		return fibanocciList;
	}
	
	public static void main(String[] args) {
		FibanocciService fibanocciService = new FibanocciServiceImpl();
		List<Integer> firstNFibanocci = fibanocciService.getFirstNFibanocci(4);
		
		for (Integer a : firstNFibanocci) {
			System.out.println(a);
		}
	}

}

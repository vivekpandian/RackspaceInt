package com.rackspace.interview.service;

import java.util.List;

import org.junit.Test;

public class FibanocciServiceTest {
	
	@Test
	public void fibanocciSeriesGreaterThan47 () {
		
		FibanocciService fibanocciService = new FibanocciServiceImpl();
		List<Integer> fibanocciList = fibanocciService.getFirstNFibanocci(48);
		
	}

}

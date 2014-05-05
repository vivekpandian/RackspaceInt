package com.rackspace.interview.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FibanocciServiceTest {
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void nGreaterThan47 () {
		
		FibanocciService fibanocciService = new FibanocciServiceImpl();
		
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("n is too large. n must be <= 47");
		List<Integer> fibanocciList = fibanocciService.getFirstNFibanocci(48);
	}
	
	
	@Test
	public void nLessThan0 () {
		FibanocciService fibanocciService = new FibanocciServiceImpl();
		
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("n is negative. n must be zero or a positive number <= 47");
		List<Integer> fibanocciList = fibanocciService.getFirstNFibanocci(-1);
		
	}

	
	@Test
	public void nEqualTo0 () {
		FibanocciService fibanocciService = new FibanocciServiceImpl();
		
		List<Integer> fibanocciList = fibanocciService.getFirstNFibanocci(0);
		assertEquals (fibanocciList.size(), 0);
	}
	
	@Test
	public void nEqualTo1 () {
		FibanocciService fibanocciService = new FibanocciServiceImpl();
		
		List<Integer> fibanocciList = fibanocciService.getFirstNFibanocci(1);
		assertEquals (fibanocciList.size(), 1);
		assertEquals (fibanocciList.get(0), new Integer(0));
	}
	

	@Test
	public void nEqualTo2 () {
		FibanocciService fibanocciService = new FibanocciServiceImpl();
		
		List<Integer> fibanocciList = fibanocciService.getFirstNFibanocci(2);
		assertEquals (fibanocciList.size(), 2);
		assertEquals (fibanocciList.get(0), new Integer(0));
		assertEquals (fibanocciList.get(1), new Integer(1));
	}

	@Test
	public void nEqualTo3 () {
		FibanocciService fibanocciService = new FibanocciServiceImpl();
		
		List<Integer> fibanocciList = fibanocciService.getFirstNFibanocci(3);
		assertEquals (fibanocciList.size(), 3);
		assertEquals (fibanocciList.get(0), new Integer(0));
		assertEquals (fibanocciList.get(1), new Integer(1));
		assertEquals (fibanocciList.get(2), new Integer(1));
	}
	
	@Test
	public void nEqualTo4 () {
		FibanocciService fibanocciService = new FibanocciServiceImpl();
		
		List<Integer> fibanocciList = fibanocciService.getFirstNFibanocci(4);
		assertEquals (fibanocciList.size(), 4);
		assertEquals (fibanocciList.get(0), new Integer(0));
		assertEquals (fibanocciList.get(1), new Integer(1));
		assertEquals (fibanocciList.get(2), new Integer(1));
		assertEquals (fibanocciList.get(3), new Integer(2));
	}

	@Test
	public void nEqualTo5 () {
		FibanocciService fibanocciService = new FibanocciServiceImpl();
		
		List<Integer> fibanocciList = fibanocciService.getFirstNFibanocci(5);
		assertEquals (fibanocciList.size(), 5);
		assertEquals (fibanocciList.get(0), new Integer(0));
		assertEquals (fibanocciList.get(1), new Integer(1));
		assertEquals (fibanocciList.get(2), new Integer(1));
		assertEquals (fibanocciList.get(3), new Integer(2));
		assertEquals (fibanocciList.get(4), new Integer(3));
	}

	@Test
	public void nEqualTo47 () {
		FibanocciService fibanocciService = new FibanocciServiceImpl();
		
		List<Integer> fibanocciList = fibanocciService.getFirstNFibanocci(47);
		assertEquals (fibanocciList.size(), 47);
		assertEquals (fibanocciList.get(0), new Integer(0));
		assertEquals (fibanocciList.get(1), new Integer(1));
		assertEquals (fibanocciList.get(2), new Integer(1));
		assertEquals (fibanocciList.get(3), new Integer(2));
		assertEquals (fibanocciList.get(4), new Integer(3)); 
		assertEquals (fibanocciList.get(46), new Integer(1836311903));
	}
	
}

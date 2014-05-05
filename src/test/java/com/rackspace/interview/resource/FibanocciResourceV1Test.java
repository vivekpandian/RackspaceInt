package com.rackspace.interview.resource;

import static com.jayway.restassured.RestAssured.expect;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.rackspace.interview.web.view.FibanocciResponse;

public class FibanocciResourceV1Test {

	@Test
	public void nGreaterThan47() {
		expect().statusCode(500)
				.body("errorMsg", equalTo("n is too large. n must be <= 47"))
				.when().get("http://localhost:8080/fibanocci/api/v1/fib/48");
	}

	@Test
	public void nLessThan0() {
		expect().statusCode(500)
				.body("errorMsg",
						equalTo("n is negative. n must be zero or a positive number <= 47"))
				.when().get("http://localhost:8080/fibanocci/api/v1/fib/-1");
	}

	@Test
	public void nEqualTo0() {
		expect().statusCode(200).body("fibanocciNubmers", hasItems()).when()
				.get("http://localhost:8080/fibanocci/api/v1/fib/0");
	}

	@Test
	public void nEqualTo1() {
		FibanocciResponse response = expect().statusCode(200).when()
				.get("http://localhost:8080/fibanocci/api/v1/fib/1")
				.as(FibanocciResponse.class);
		
		assertEquals (response.getFibanocciNubmers().size(), 1);
		assertEquals (response.getFibanocciNubmers().get(0), new Integer(0));

	}

	@Test
	public void nEqualTo2() {
		FibanocciResponse response = expect().statusCode(200).when()
				.get("http://localhost:8080/fibanocci/api/v1/fib/2")
				.as(FibanocciResponse.class);
		
		assertEquals (response.getFibanocciNubmers().size(), 2);
		assertEquals (response.getFibanocciNubmers().get(0), new Integer(0));
		assertEquals (response.getFibanocciNubmers().get(1), new Integer(1));

	}

	@Test
	public void nEqualTo3() {
		FibanocciResponse response = expect().statusCode(200).when()
				.get("http://localhost:8080/fibanocci/api/v1/fib/3")
				.as(FibanocciResponse.class);
		
		assertEquals (response.getFibanocciNubmers().size(), 3);
		assertEquals (response.getFibanocciNubmers().get(0), new Integer(0));
		assertEquals (response.getFibanocciNubmers().get(1), new Integer(1));
		assertEquals (response.getFibanocciNubmers().get(2), new Integer(1));

	}

	
	@Test
	public void nEqualTo5() {
		FibanocciResponse response = expect().statusCode(200).when()
				.get("http://localhost:8080/fibanocci/api/v1/fib/5")
				.as(FibanocciResponse.class);
		
		assertEquals (response.getFibanocciNubmers().size(), 5);
		assertEquals (response.getFibanocciNubmers().get(0), new Integer(0));
		assertEquals (response.getFibanocciNubmers().get(1), new Integer(1));
		assertEquals (response.getFibanocciNubmers().get(2), new Integer(1));
		assertEquals (response.getFibanocciNubmers().get(3), new Integer(2));
		assertEquals (response.getFibanocciNubmers().get(4), new Integer(3));

	}

	@Test
	public void nEqualTo47() {
		FibanocciResponse response = expect().statusCode(200).when()
				.get("http://localhost:8080/fibanocci/api/v1/fib/47")
				.as(FibanocciResponse.class);
		
		assertEquals (response.getFibanocciNubmers().size(), 47);
		assertEquals (response.getFibanocciNubmers().get(0), new Integer(0));
		assertEquals (response.getFibanocciNubmers().get(1), new Integer(1));
		assertEquals (response.getFibanocciNubmers().get(2), new Integer(1));
		assertEquals (response.getFibanocciNubmers().get(3), new Integer(2));
		assertEquals (response.getFibanocciNubmers().get(4), new Integer(3));
		assertEquals (response.getFibanocciNubmers().get(46), new Integer(1836311903));

	}
	
}

package com.rackspace.interview.web.view;

import java.util.List;

public class FibanocciResponse {
	
	private List<Integer> fibanocciNubmers;
	
	public FibanocciResponse() {
	}
	
	public FibanocciResponse(List<Integer> fibanocciNubmers) {
		this.fibanocciNubmers = fibanocciNubmers;
	}

	public List<Integer> getFibanocciNubmers() {
		return fibanocciNubmers;
	}

	public void setFibanocciNubmers(List<Integer> fibanocciNubmers) {
		this.fibanocciNubmers = fibanocciNubmers;
	}
	
	

}

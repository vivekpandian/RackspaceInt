package com.rackspace.interview.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rackspace.interview.service.FibanocciService;

@Component
@Path ("api/v1")
public class FibanocciResource {
	
	@Autowired
	private FibanocciService fibanocciService;
	
	@GET
	@Path ("/nFibanocci")
	public Response getNFibanoci(@QueryParam("n") int n) {
		
		List<Integer> fibList = fibanocciService.getFirstNFibanocci(1);
		
		return Response.status(200).entity(fibList).build();
		
	}

}

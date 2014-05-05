package com.rackspace.interview.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rackspace.interview.service.FibanocciService;
import com.rackspace.interview.web.view.FibanocciResponse;

@Component
@Path ("api/v1")
public class FibanocciResourceV1 {
	
	final static Logger LOGGER = LogManager.getLogger(FibanocciResourceV1.class);
	
	@Autowired
	private FibanocciService fibanocciService;
	

	@GET
	@Path ("/fib/{n}")
	@Produces (MediaType.APPLICATION_JSON)
	public Response getNFibanoci(@PathParam("n") int n) {
		
		LOGGER.debug("n is " + n);
		
		List<Integer> fibList = fibanocciService.getFirstNFibanocci(n);
		
		LOGGER.debug("size of fibList" + fibList.size());
		
		return Response.status(200).entity(new FibanocciResponse(fibList)).build();
		
	}

}

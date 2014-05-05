package com.rackspace.interview.resource;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Repository;

import com.rackspace.interview.web.view.ErrorResponse;

@Provider
@Repository
public class CustomExceptionMapper implements ExceptionMapper<IllegalArgumentException> {

	@Context
    private HttpHeaders headers;
	
    @Override
    public Response toResponse(IllegalArgumentException exception) {
        return Response.status(500).entity(new ErrorResponse(exception.getMessage(),500)).type(headers.getMediaType()).build();
    }
}

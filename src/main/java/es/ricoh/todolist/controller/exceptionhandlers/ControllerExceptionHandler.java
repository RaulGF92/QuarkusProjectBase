package es.ricoh.todolist.controller.exceptionhandlers;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import es.ricoh.todolist.exceptions.ControllerException;

@Provider
public class ControllerExceptionHandler implements ExceptionMapper<ControllerException>  {

	@Override
	public Response toResponse(ControllerException exception) {
		return Response.status(Status.BAD_REQUEST)
				.entity(es.ricoh.todolist.controller.dto.response.Response.ko(exception.getMessage())).build();  
	}

}

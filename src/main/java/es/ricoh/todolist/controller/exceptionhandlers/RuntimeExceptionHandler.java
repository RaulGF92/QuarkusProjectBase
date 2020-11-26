package es.ricoh.todolist.controller.exceptionhandlers;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import es.ricoh.todolist.exceptions.BusinessException;
import es.ricoh.todolist.exceptions.ControllerException;

@Provider
public class RuntimeExceptionHandler implements ExceptionMapper<RuntimeException>  {

	@Override
	public Response toResponse(RuntimeException exception) {
		return Response.status(Status.INTERNAL_SERVER_ERROR)
				.entity(es.ricoh.todolist.controller.dto.response.Response.ko(exception.getMessage())).build();  
	}

}

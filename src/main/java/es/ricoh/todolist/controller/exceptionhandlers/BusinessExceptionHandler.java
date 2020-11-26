package es.ricoh.todolist.controller.exceptionhandlers;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import es.ricoh.todolist.exceptions.BusinessException;
import es.ricoh.todolist.exceptions.ControllerException;

@Provider
public class BusinessExceptionHandler implements ExceptionMapper<BusinessException>  {

	@Override
	public Response toResponse(BusinessException exception) {
		return Response.status(Status.INTERNAL_SERVER_ERROR)
				.entity(es.ricoh.todolist.controller.dto.Response.ko(exception.getMessage())).build();  
	}

}

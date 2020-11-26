package es.ricoh.todolist.controller.exceptionhandlers;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import es.ricoh.todolist.exceptions.ControllerException;

@Provider
public class ControllerExceptionHandler implements ExceptionMapper<ControllerException>  {

	@Override
	public Response toResponse(ControllerException exception) {
		// TODO Auto-generated method stub
		return null;
	}

}

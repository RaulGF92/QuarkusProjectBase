package es.ricoh.todolist.exceptions;

public class BusinessException extends Exception {

	private static final long serialVersionUID = -4108345558323989415L;

	public BusinessException(String msg) {
		super(msg);
	}

	public BusinessException(String msg, Throwable e) {
		super(msg, e);
	}
}

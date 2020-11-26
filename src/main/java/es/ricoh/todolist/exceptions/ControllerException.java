package es.ricoh.todolist.exceptions;

public class ControllerException extends Exception {

	private static final long serialVersionUID = -4108345558323989415L;

	public ControllerException(String msg) {
		super(msg);
	}

	public ControllerException(String msg, Throwable e) {
		super(msg, e);
	}
}

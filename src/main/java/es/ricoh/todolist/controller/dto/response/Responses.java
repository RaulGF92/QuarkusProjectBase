package es.ricoh.todolist.controller.dto.response;

import java.util.Collections;
import java.util.List;

import es.ricoh.todolist.commun.Constants;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Responses<T extends Response> extends Response {

	private List<T> data;

	private Responses(String code, String msg, List<T> data) {
		super(code, msg);
		this.data = data;
	}

	public static Responses ko(String msg) {
		return new Responses<Response>(Constants.RESPONSE_COD_KO, Constants.RESPONSE_MSG_KO, Collections.emptyList());
	}

	public static <I extends Response> Responses<I> ok(List<I> data) {
		return new Responses<I>(Constants.RESPONSE_COD_OK, Constants.RESPONSE_MSG_OK, data);
	}

}

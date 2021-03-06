package es.ricoh.todolist.controller.dto.response;

import es.ricoh.todolist.commun.Constants;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
public class Response {

	private String code;
	private String msg;
	
	public static Response ok() {
		return new Response(Constants.RESPONSE_COD_OK, Constants.RESPONSE_MSG_OK);
	}

	public static Object ko(String msg) {
		return new Response(Constants.RESPONSE_COD_OK, msg != null? msg : Constants.RESPONSE_MSG_KO);
	}
}

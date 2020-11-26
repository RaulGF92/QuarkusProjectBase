package es.ricoh.todolist.controller.dto.response;

import es.ricoh.todolist.repositories.entities.ProjectEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter@Setter
public class ResponseProject extends Response {

	private String code;
	private String name;

	public static ResponseProject from(ProjectEntity projectEntity) {
		return ResponseProject.builder().build();
	}
}

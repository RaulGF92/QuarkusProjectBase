package es.ricoh.todolist.controller.dto.response;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import es.ricoh.todolist.repositories.entities.ProjectEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Builder
@Getter
@Setter
public class ResponseProject extends Response {

	private String description;
	private String name;
	private String id;
	private List<String> tasks;

	public static ResponseProject from(ProjectEntity projectEntity) {
		List<String> _tasks = projectEntity.getTasks() == null ? Collections.emptyList() : 
			projectEntity.getTasks().stream().map((item) -> item.getId().toString()).collect(Collectors.toList());
		
		return ResponseProject.builder()
				.name(projectEntity.getName())
				.description(projectEntity.getDescription())
				.tasks(_tasks )
				.build();
	}
}

package es.ricoh.todolist.controller.dto.response;

import es.ricoh.todolist.repositories.entities.ProjectEntity;
import es.ricoh.todolist.repositories.entities.TaskEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Builder
@Getter
@Setter
public class ResponseTask extends Response {

	private String title;
	private String description;
	private String id;

	public static ResponseTask from(TaskEntity taskEntity) {
		return ResponseTask.builder()
				.id(taskEntity.getId().toString())
				.title(taskEntity.getTitle())
				.description(taskEntity.getDescription())
				.build();
	}
}

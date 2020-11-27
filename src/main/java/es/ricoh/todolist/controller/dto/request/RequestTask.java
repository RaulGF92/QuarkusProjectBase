package es.ricoh.todolist.controller.dto.request;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import es.ricoh.todolist.repositories.entities.TaskEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter@Setter
public class RequestTask {

	@NotNull@NotEmpty
	private String title;
	@NotNull
	private String description;
	
	public TaskEntity toTaskEntity() {
		TaskEntity response = new TaskEntity();
		response.setTitle(this.getTitle());
		response.setDescription(this.getDescription());
		response.setStartDate(new Date());
		return response;
	}
}

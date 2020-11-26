package es.ricoh.todolist.controller.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import es.ricoh.todolist.repositories.entities.ProjectEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter@Setter
public class RequestProject {
	
	@NotNull@NotEmpty
	private String name;
	@NotNull@NotEmpty
	private String description;
	
	
	public ProjectEntity toProjectEntity() {
		ProjectEntity projectEntity = new ProjectEntity();
		projectEntity.setName(name);
		projectEntity.setDescription(description);
		return projectEntity;
	}

}

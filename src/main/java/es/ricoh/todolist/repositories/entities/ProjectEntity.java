package es.ricoh.todolist.repositories.entities;

import es.ricoh.todolist.model.Project;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
public class ProjectEntity extends Project {

	private Long id;
}

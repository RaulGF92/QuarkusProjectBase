package es.ricoh.todolist.repositories.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import es.ricoh.todolist.model.Project;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
public class ProjectEntity extends Project {
	
	@Id @GeneratedValue private Long id;
	
}

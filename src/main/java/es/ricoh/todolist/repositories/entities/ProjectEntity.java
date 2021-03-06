package es.ricoh.todolist.repositories.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	
	@Id @GeneratedValue @Column(name="project_id") private Long id;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "project")
	List<TaskEntity> tasks;
	
}

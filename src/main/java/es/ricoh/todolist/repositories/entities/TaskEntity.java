package es.ricoh.todolist.repositories.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import es.ricoh.todolist.model.Task;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
public class TaskEntity extends Task {

	@Id @GeneratedValue @Column(name="task_id") private Long id;
	
    @ManyToOne
    @JoinColumn(name="project_id")
	ProjectEntity project;
}

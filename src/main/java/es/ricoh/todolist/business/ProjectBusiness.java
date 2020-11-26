package es.ricoh.todolist.business;

import java.util.List;

import es.ricoh.todolist.repositories.entities.ProjectEntity;

public interface ProjectBusiness {

	List<ProjectEntity> getAllProjects();

	String createProject(ProjectEntity projectEntity);

}

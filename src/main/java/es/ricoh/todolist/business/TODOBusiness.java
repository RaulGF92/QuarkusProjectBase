package es.ricoh.todolist.business;

import java.util.List;
import java.util.Optional;

import es.ricoh.todolist.repositories.entities.ProjectEntity;
import es.ricoh.todolist.repositories.entities.TaskEntity;

public interface TODOBusiness {

	List<ProjectEntity> getAllProjects();

	String createProject(ProjectEntity projectEntity);

	Optional<ProjectEntity> getProjectById(String projectId);

	String createTask(ProjectEntity project, TaskEntity taskEntity);

}

package es.ricoh.todolist.business.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import es.ricoh.todolist.business.TODOBusiness;
import es.ricoh.todolist.repositories.entities.ProjectEntity;
import es.ricoh.todolist.repositories.entities.TaskEntity;
import es.ricoh.todolist.repositories.panache.ProjectRepository;
import es.ricoh.todolist.repositories.panache.TaskRepository;

@Named
@ApplicationScoped
public class TODOBusinessImpl implements TODOBusiness {

	@Inject
	ProjectRepository projectRepository;
	
	@Inject
	TaskRepository taskRepository;
	
	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public List<ProjectEntity> getAllProjects() {
		return projectRepository.listAll();
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public String createProject(ProjectEntity projectEntity) {
		this.projectRepository.persistAndFlush(projectEntity);
		return projectEntity.getId().toString();
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public Optional<ProjectEntity> getProjectById(String projectId) {
		return this.projectRepository.findByIdOptional(Long.valueOf(projectId));
	}
	
	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public String createTask(ProjectEntity project, TaskEntity taskEntity) {
		taskEntity.setProject(project);
		this.taskRepository.persistAndFlush(taskEntity);
		return taskEntity.getId().toString();
	}

}

package es.ricoh.todolist.business.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import es.ricoh.todolist.business.ProjectBusiness;
import es.ricoh.todolist.repositories.entities.ProjectEntity;

@Named
@ApplicationScoped
public class ProjectBusinessImpl implements ProjectBusiness {

	@Override
	public List<ProjectEntity> getAllProjects() {
		// TODO Auto-generated method stub
		return null;
	}

}

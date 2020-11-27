package es.ricoh.todolist.business.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import es.ricoh.todolist.business.TODOBusiness;
import es.ricoh.todolist.repositories.entities.ProjectEntity;
import es.ricoh.todolist.repositories.entities.TaskEntity;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.h2.H2DatabaseTestResource;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
@QuarkusTestResource(H2DatabaseTestResource.class)
class TODOBusinessImplTest {

	@Inject
	TODOBusiness bussiness;
	
	@Test
	void test() {
		
		ProjectEntity projectEntity = new ProjectEntity();
		projectEntity.setName("prueba");
		projectEntity.setDescription("prueba de testing");
		
		String projectId = bussiness.createProject(projectEntity);
		
		ProjectEntity project = bussiness.getProjectById(projectId).get();
		
		TaskEntity task1 = new TaskEntity();
		task1.setTitle("Hacer el test");
		task1.setProject(projectEntity);
		task1.setStartDate(new Date());
		bussiness.createTask(project, task1);
		
		TaskEntity task2 = new TaskEntity();
		task2.setTitle("Crear programa y tarea");
		task2.setProject(projectEntity);
		task2.setStartDate(new Date());
		bussiness.createTask(project, task2);
		
		TaskEntity task3 = new TaskEntity();
		task3.setTitle("Enlazar tareas con programas");
		task3.setProject(projectEntity);
		task3.setStartDate(new Date());
		bussiness.createTask(project, task3);
		
		
		ProjectEntity projectAdded = bussiness.getProjectById(projectId).get();
		assertEquals(3, projectAdded.getTasks().size());
		
	}

}

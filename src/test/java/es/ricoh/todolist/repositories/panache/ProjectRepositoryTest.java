package es.ricoh.todolist.repositories.panache;

import static org.junit.jupiter.api.Assertions.*;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;

import es.ricoh.todolist.repositories.entities.ProjectEntity;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.h2.H2DatabaseTestResource;

@QuarkusTest
@QuarkusTestResource(H2DatabaseTestResource.class)
class ProjectRepositoryTest {

	@Inject
	ProjectRepository repo;
	
	@Test
	@Transactional
	void test() {
		String name = "PruebaGuardado";
		String descripcion = "Descripcion";
		
		ProjectEntity entity = new ProjectEntity();
		entity.setName(name);
		entity.setDescription(descripcion);
		
		repo.persist(entity);
		
		ProjectEntity result = repo.findAll().firstResult();
		assertEquals(name, result.getName());
		assertEquals(descripcion, result.getDescription());
	}

}

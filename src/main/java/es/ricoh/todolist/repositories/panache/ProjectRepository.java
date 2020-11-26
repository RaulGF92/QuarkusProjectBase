package es.ricoh.todolist.repositories.panache;

import javax.enterprise.context.ApplicationScoped;

import es.ricoh.todolist.repositories.entities.ProjectEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class ProjectRepository implements PanacheRepository<ProjectEntity>  {

}

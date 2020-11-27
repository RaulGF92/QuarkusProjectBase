package es.ricoh.todolist.repositories.panache;

import javax.enterprise.context.ApplicationScoped;

import es.ricoh.todolist.repositories.entities.TaskEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class TaskRepository implements PanacheRepository<TaskEntity> {

}

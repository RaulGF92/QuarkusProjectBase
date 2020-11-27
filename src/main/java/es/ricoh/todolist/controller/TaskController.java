package es.ricoh.todolist.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import es.ricoh.todolist.business.TODOBusiness;
import es.ricoh.todolist.controller.dto.request.RequestTask;
import es.ricoh.todolist.controller.dto.response.ResponseProject;
import es.ricoh.todolist.controller.dto.response.ResponseTask;
import es.ricoh.todolist.controller.dto.response.Responses;
import es.ricoh.todolist.exceptions.ControllerException;
import es.ricoh.todolist.repositories.entities.ProjectEntity;
import lombok.Getter;
import lombok.Setter;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Getter
@Setter
public class TaskController extends Controller {

	@Inject
	TODOBusiness bussiness;

	@Path("/{projectId}/tasks/")
	@POST
	public Response createTask(@PathParam("projectId") String projectId, @RequestBody @Valid RequestTask requestTask)
			throws ControllerException {

		ProjectEntity project = this.bussiness.getProjectById(projectId)
				.orElseThrow(() -> new ControllerException("Can't find entity"));

		String id = bussiness.createTask(project, requestTask.toTaskEntity());
		return Response.ok(ResponseProject.builder().id(id).build()).build();
	}

	@Path("/{projectId}/tasks/")
	@GET
	public Response getTasks(@PathParam("projectId") String projectId) throws ControllerException {

		ProjectEntity project = this.bussiness.getProjectById(projectId)
				.orElseThrow(() -> new ControllerException("Can't find entity"));

		List<ResponseTask> tasks = project.getTasks().stream().map((item) -> ResponseTask.from(item))
				.collect(Collectors.toList());

		return Response.ok(Responses.ok(tasks)).build();
	}

}

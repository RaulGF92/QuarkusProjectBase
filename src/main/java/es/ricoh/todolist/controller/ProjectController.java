package es.ricoh.todolist.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import es.ricoh.todolist.business.ProjectBusiness;
import es.ricoh.todolist.controller.dto.request.RequestProject;
import es.ricoh.todolist.controller.dto.response.ResponseProject;
import es.ricoh.todolist.controller.dto.response.Responses;
import lombok.Getter;
import lombok.Setter;

@Path("/projects")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Getter@Setter
public class ProjectController extends Controller {

	@Inject
	ProjectBusiness business;
	
    @GET
    public Response getProjects() {
    	
    	List<ResponseProject> projects = this.business.getAllProjects()
    			.stream()
    			.map((item) -> ResponseProject.from(item))
    			.collect(Collectors.toList());
    	
        Responses<ResponseProject> responses = Responses.ok(projects);
		return Response.ok(responses).build();
    }
    
    @POST
    public Response saveProject(@Valid RequestProject request) {
    	String id = this.business.createProject(request.toProjectEntity());
    	return Response.ok(ResponseProject.builder().id(id).build()).build();
    }
}

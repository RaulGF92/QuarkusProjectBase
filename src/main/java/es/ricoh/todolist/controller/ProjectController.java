package es.ricoh.todolist.controller;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import es.ricoh.todolist.controller.dto.response.ResponseProject;
import es.ricoh.todolist.controller.dto.response.Responses;

@Path("/projects")
public class ProjectController extends Controller {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProjects() {
    	ArrayList<ResponseProject> projects = new ArrayList<ResponseProject>();
        Responses<ResponseProject> responses = Responses.ok(projects);
		return Response.ok(responses).build();
    }
}

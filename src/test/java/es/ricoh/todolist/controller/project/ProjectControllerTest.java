package es.ricoh.todolist.controller.project;

import static org.junit.jupiter.api.Assertions.*;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import es.ricoh.todolist.business.ProjectBusiness;
import es.ricoh.todolist.controller.ProjectController;
import es.ricoh.todolist.controller.dto.response.ResponseProject;
import es.ricoh.todolist.controller.dto.response.Responses;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import static org.mockito.Mockito.*;

import java.util.Collections;

@QuarkusTest
class ProjectControllerTest {

	@Inject
	ProjectController controller;

	@Test
	void testCreation() {
		assertNotNull(controller.getBusiness());
	}

	@Test
	void test() {
		
		ProjectBusiness previousBusiness = controller.getBusiness();
		ProjectBusiness businessMock = mock(ProjectBusiness.class);
		
		when(businessMock.getAllProjects())
			.thenReturn(Collections.emptyList());
		
		this.controller.setBusiness(businessMock);
		
		ExtractableResponse<Response> response = given()
			.when().get("/projects")
			.then()
				.statusCode(200)
				.extract();
		
		Responses<ResponseProject> responses = response.as(Responses.class);
		assertNotNull(responses);
		
		this.controller.setBusiness(previousBusiness);
	}

}

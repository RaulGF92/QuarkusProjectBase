package es.ricoh.todolist.controller.project;

import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.collection.IsArray;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

@QuarkusTest
class ProjectControllerTest {

	@Test
	void test() {
		ExtractableResponse<Response> response = given()
			.when().get("/projects")
			.then()
				.statusCode(200)
				.extract();
		
		list = response.as(List<ResponseProject>);
	}

}

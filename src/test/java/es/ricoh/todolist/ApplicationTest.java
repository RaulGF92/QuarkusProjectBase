package es.ricoh.todolist;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import es.ricoh.todolist.controller.dto.Request;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ApplicationTest {

    @Test
    public void testHelloEndpoint() {
    	
        given()
          .when().get("/isAlive")
          .then()
             .statusCode(200)
             .body(is("TEST"));
    }

}
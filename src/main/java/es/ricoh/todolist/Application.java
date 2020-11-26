package es.ricoh.todolist;

import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@OpenAPIDefinition(
	    tags = {
	            @Tag(name="project", description="Project operations."),
	            @Tag(name="task", description="Task operations.")
	    },
	    info = @Info(
	        title="Example Quarkus API",
	        version = "1.0.1",
	        contact = @Contact(
	            name = "Raúl García Fernández",
	            url = "https://raulgf92.github.io/homepage/",
	            email = "raulgf92@gmail.com"),
	        license = @License(
	            name = "Apache 2.0",
	            url = "http://www.apache.org/licenses/LICENSE-2.0.html"))
	)
public class Application extends javax.ws.rs.core.Application {

}

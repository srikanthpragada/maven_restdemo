package restdemo;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class Hello {

	  @GET
	  @Produces ("text/plain")
	  public String getMessage() {
		  return "Hello!";
	  }
	  
	  @POST
	  @Produces ("text/plain")
	  public String getPostMessage() {
		  return "Hello Post!";
	  }
}

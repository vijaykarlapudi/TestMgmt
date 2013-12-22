package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class BaseService {
	@GET
	@Path("")
	public Response getBase() {
		String response = "<html><body><h1>Call a service</h1><br />refer to help for available services. <p>Sample - http://&lt;Server:host&gt;/&lt;Application&gt;/user/list</body>/<html>";
		return Response.status(200).entity(response).build();
	}
}

package tmcommon;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import service.TmLaunch;

@Path("/user")
public class UserManager {

	@GET
	@Path("/applicationlaunch")
	@Produces("application/json")
	public TmLaunch LaunchApplication() {
		TmLaunch appLaunch = new TmLaunch();	
		return appLaunch;
	}	
}

package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import tmcommon.TmLaunch;

@Path("/user")
public class UserManager {

	@GET
	@Path("/applicationlaunch")
	@Produces("application/json")
	public TmLaunch LaunchApplication() {
		TmLaunch appLaunch = new TmLaunch();

		return appLaunch;
	}

	/***
	 * @GET
	 * @Path("/{id ")
	 * @Produces("application/json") public Response
	 *                               getUserById(@PathParam("id") Integer id) {
	 *                               List<User> userInfoList = new
	 *                               ArrayList<User>(); User user = new User();
	 *                               user.setId(id); user.setFirstName("Bob");
	 *                               user.setLastName("Smith");
	 *                               userInfoList.add(user); return
	 *                               Response.status
	 *                               (200).entity(userInfoList).build();
	 *                               //return user; }
	 ***/
}

package testCallback;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
@Path("/callback")
public class Callback {

	
	@Path("/driver/delete")
	@Consumes(MediaType.TEXT_PLAIN)
	@POST
	public Response deletedRide(String message)
		{
		 System.out.println("CALLBACK: server has informed, driver voided a booked transfer: "+message);
		 return Response.status(Status.OK).entity("CALLBACK: received-->"+message).build();
		 ///commento a caso
		}
	
	@Path("/echo")
	@GET
	public Response echo()
		{
		return Response.status(Status.OK).entity("echo deddio").build();
		}
}

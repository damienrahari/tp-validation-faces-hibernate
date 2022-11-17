package api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import entity.Livre;


@Path("/livre")
public class ApiBibli {
	@GET
	@Path("/list")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Livre> getLivres(){
		return null;
	}

}

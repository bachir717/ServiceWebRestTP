package eu.ensup;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMsg() {
        return "Hello CH";
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public User postMsg(User user){
        if(user.getUsername().equals("cherif")){
            User person = new User("cherif", "password", "123");
            return person;
        }
        else
        {
            User person = new User();
            String output = "Erreur";
            return person;
        }

    }

}

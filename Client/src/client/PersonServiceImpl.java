package client;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/rest")
@Consumes("application/json")
@Produces("application/json")
public class PersonServiceImpl implements PersonService {
    private static Map<Integer, Person> persons = new HashMap<Integer, Person>();

    public PersonServiceImpl() {
        super();
    }

    @Override
    @POST
    @Path("/add")
    public Response addPerson(Person p) {
        String resp = "{\"status\":\"201\",\"message\":\"Created\"}";
        // TODO Implement this method
        //        Response response = new Response();
        //        if (persons.get(p.getId()) != null) {
        //            response.setStatus(false);
        //            response.setMessage("Person Already Exists");
        //            return response;
        //        }
        //        persons.put(p.getId(), p);
        //        response.setStatus(true);
        //        response.setMessage("Person created successfully");
        //        return response;
        return Response.status(Response.Status.CREATED).entity(resp).build();
    }

    @GET
    @Path("/{id}/getDummy")
    public Person getDummyPerson(@PathParam("id") int id) {
        Person p = new Person();
        p.setAge(99);
        p.setName("Dummy");
        p.setId(id);
        return p;
    }

    @Override
    @GET
    @Path("/{id}/get")
    public Person getPerson(@PathParam("id") int id) {
        // TODO Implement this method
        return persons.get(id);
    }

    @Override
    @GET
    @Path("/getAll")
    public Person[] getAllPersons() {
        // TODO Implement this method
        Set<Integer> ids = persons.keySet();
        Person[] p = new Person[ids.size()];
        int i = 0;
        for (Integer id : ids) {
            p[i] = persons.get(id);
            i++;
        }
        return p;
    }
}

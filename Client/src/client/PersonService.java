package client;

import javax.ws.rs.core.Response;

public interface PersonService {
    public Response addPerson(Person p);

    public Person getPerson(int id);

    public Person[] getAllPersons();
}

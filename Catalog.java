package restdemo;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/catalog")
public class Catalog {
	List<Book> books;
	
	public Catalog() {
		books = new ArrayList<Book>();
		books.add( new Book("Java Comp. Ref",600));
		books.add( new Book("Spring in Action",850));
		books.add( new Book("AngularJS",300));
	}
	
	
	@GET 
	@Path("{id}")
	@Produces ( MediaType.APPLICATION_JSON)
    public Book getBook( @PathParam("id") int id) {
        return  books.get(id - 1);	
    }
	
	
	@GET 
	@Produces ( MediaType.APPLICATION_JSON)
    public List<Book> getALlBooks() {
        return  books;	
    }
}

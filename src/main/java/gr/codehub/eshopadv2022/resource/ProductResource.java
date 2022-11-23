package gr.codehub.eshopadv2022.resource;

import gr.codehub.eshopadv2022.model.Product;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;



@Path("/eshop")
public class ProductResource {
    @GET
    @Produces("text/plain")
    @Path("1")
    public Product one() {
        return Product
                .builder()
                .name("snack")
                .price(1.20)
                .id(12)
                .build();
    }
}
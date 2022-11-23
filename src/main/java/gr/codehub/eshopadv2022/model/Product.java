package gr.codehub.eshopadv2022.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@AllArgsConstructor
@Builder
@Data
//@Entity
//@NoArgsConstructor
public class Product {
    //@Id
    private int id;
    private String name;
    private double price;
}

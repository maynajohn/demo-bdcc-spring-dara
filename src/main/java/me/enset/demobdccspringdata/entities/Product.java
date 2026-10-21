package me.enset.demobdccspringdata.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString @Builder
@Table(name= "PRODUCTS")
public class Product {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private double price;
    private double quantity;
}

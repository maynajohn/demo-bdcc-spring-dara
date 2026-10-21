package me.enset.demobdccspringdata.repository;

import me.enset.demobdccspringdata.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

 package crud.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import crud.crud.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
    
}
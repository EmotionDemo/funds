package com.zy.Repository;

import com.zy.Entry.Product;
import com.zy.Entry.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {
    Product findByProId(String proId);
}

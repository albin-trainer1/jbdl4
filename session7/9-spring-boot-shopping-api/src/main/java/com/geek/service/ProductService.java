package com.geek.service;

import java.util.List;

import com.geek.model.Product;

public interface ProductService {
List<Product> getAllProducts();
Product findById(int id);
Product addNewProduct(Product p);
Product updateProduct(Product p);
void deleteProduct(int id);
List<Product> searchByName(String name);
}

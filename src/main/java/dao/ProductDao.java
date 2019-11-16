package dao;

import models.Product;

import java.util.List;

public interface ProductDao {


    //create
    void add(Product product);


    //read
    List<Product> getAllAvailable();
    List<Product> getAllRented();
    List<Product> getAllDamaged();



    //update
    void returnLamp(int lamp_id, boolean damaged, boolean returned);


}

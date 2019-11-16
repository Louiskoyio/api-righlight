package dao;

import models.Product;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class Sql2oProductDao implements ProductDao {

    private final Sql2o sql2o;

    public Sql2oProductDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(Product product) {

    }

    @Override
    public List<Product> getAllAvailable() {

        try(Connection con = sql2o.open()){
            return con.createQuery("SELECT * FROM products")
                    .throwOnMappingFailure(false)
                    .executeAndFetch(Product.class);
        }
    }

    @Override
    public List<Product> getAllRented() {
        return null;
    }

    @Override
    public List<Product> getAllDamaged() {
        return null;
    }

    @Override
    public void returnLamp(int lamp_id, boolean damaged, boolean returned) {

    }

}

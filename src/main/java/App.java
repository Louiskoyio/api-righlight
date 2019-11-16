import com.google.gson.Gson;
import dao.Sql2oProductDao;
import org.sql2o.Sql2o;

import java.sql.Connection;

import static spark.Spark.get;
import static spark.Spark.port;

public class App {
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567;
    }
    public static void main(String[] args){
        port(getHerokuAssignedPort());
        Sql2oProductDao productDao ;
        Connection con;
        Gson gson = new Gson();
       // String connectionString = "jdbc:postgresql://localhost:5432/rightlight";
      //  Sql2o sql2o = new Sql2o(connectionString, "louis", "23Armin23");

        String connectionString = "jdbc:postgresql://ec2-107-21-125-211.compute-1.amazonaws.com:5432/d33phj74o3bpn1";
        Sql2o sql2o = new Sql2o(connectionString, "qgtagqwgygcawn", "e3ca5ee486f36f4415305a4d0e13c1464975d1526b9eaf22152d93252c05bd95");


        productDao = new Sql2oProductDao(sql2o);

        get("/all-products", "application/json", (req, res) -> {
            res.type("application/json");
            return gson.toJson(productDao.getAllAvailable());
        });
}
}
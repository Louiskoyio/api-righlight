package models;

public class RentRecord {

    private int id;
    private int product_id;
    private String customer_id;
    private String seller_id;
    private String rent_date;
    private String return_date;
    private String name;
    private boolean returned;
    private boolean damaged;

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    public boolean isDamaged() {
        return damaged;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    public RentRecord(int product_id, String customer_id, String seller_id, String rent_date, String return_date, String name, boolean returned) {
        this.product_id = product_id;
        this.customer_id = customer_id;
        this.seller_id = seller_id;
        this.rent_date = rent_date;
        this.return_date = return_date;
        this.name = name;
        this.returned = returned;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public String getRent_date() {
        return rent_date;
    }

    public void setRent_date(String rent_date) {
        this.rent_date = rent_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

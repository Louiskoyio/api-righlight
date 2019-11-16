package models;

public class Seller {
    private String id;
    private String name;
    private String phone_number;
    private String password;

    public Seller(String name, String phone_number, String password) {
        this.name = name;
        this.phone_number = phone_number;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

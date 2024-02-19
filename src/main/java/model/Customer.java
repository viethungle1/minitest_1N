package model;

public class Customer {
    private int id;
    private String name;
    private String address;
    private String email;
    private String phone;
    private String provice;

    public Customer() {
    }

    public Customer(int id, String name, String address, String email, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public Customer(int id, String name, String address, String email, String phone, String provine) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.provice = provine;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getProvice() {
        return provice;
    }
}

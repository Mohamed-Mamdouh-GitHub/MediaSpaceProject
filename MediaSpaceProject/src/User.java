
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed H
 */
public class User implements Serializable {
    private String name,address,password,username;
    public Orders orders = new Orders();
    private char Gender;

    public User(String name, String address, String password, String username, Orders orders, char Gender) {
        this.name = name;
        this.address = address;
        this.password = password;
        this.username = username;
        this.orders = orders;
        this.Gender = Gender;
    }
    
    public User(String name, String userName, String password) {
        this.name = name;
        this.username = userName;
        this.password = password;
    }
    
    public User(String userName, String password, char g, String address) {
        this.name = name;
        this.username = userName;
        this.password = password;
        this.Gender = g;
        this.address = address;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char Gender) {
        this.Gender = Gender;
    }
    
}

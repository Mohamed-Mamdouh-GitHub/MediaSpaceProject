/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed H
 */
public class Manager {
    private String name,username,password;
    private int age;
    private char Gender;

    public Manager(String name, String userName, String password) {
        this.name = name;
        this.username = userName;
        this.password = password;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char Gender) {
        this.Gender = Gender;
    }

    public Manager(String name, String username, String password, int age, char Gender) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.age = age;
        this.Gender = Gender;
    }
    
    
}

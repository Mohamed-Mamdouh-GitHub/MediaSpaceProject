/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Mohamed H
 */
class Orders implements Serializable{
    public ArrayList<Product>arr = new ArrayList<Product>();// array list of products

    public Orders(ArrayList<Product> arr) {
        this.arr = arr;
    }

    public ArrayList<Product> getArr() {
        return arr;
    }

    public void setArr(ArrayList<Product> arr) {
        this.arr = arr;
    }
    public int search(String name){
        for(int i = 0;i<arr.size();i++){
            if(name.equals(arr.get(i).name)){
                return i;
            }
        }
        return -1;
    }
    public String get_bought(){
        String s = "";
        for(int i = 0; i<arr.size();i++){
            s+= arr.get(i).Quantity;
            s+=" ";
            s+=arr.get(i).name;
            s+=" ";
            if(i<arr.size()-1){
                s+=",";
            }
        }
        return s;
    }
    public Double get_price(){
        double price=0; 
        for(int i = 0; i<arr.size();i++){
           price+=arr.get(i).price *arr.get(i).Quantity; 
        }
        return price;
    }
    Orders(){
        
    }
}

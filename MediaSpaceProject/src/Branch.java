
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed H
 */
public class Branch {
     public static ArrayList<Product>space= new ArrayList<Product>();
     public static ArrayList<Product>pyramid= new ArrayList<Product>();
     Branch() throws FileNotFoundException, IOException{
         space.clear();
         pyramid.clear();
           Scanner input = new Scanner(new File("Branchquantity.txt"));
           String s = "";
           while(input.hasNextLine()){
               s+= input.nextLine();
           }
           
           String[] st = s.split(",");
           //
          
            Scanner input2 = new Scanner(new File("Branchproduct.txt"));
           String s2 = "";
           while(input2.hasNextLine()){
               s2+= input2.nextLine();
           }
           String[] st2 = s2.split(",");
     
           int count = 0;
           for(int i =0;i<st2.length;i++){
               if(count<=10){
                   Product p = new Product(st2[i],0,Integer.parseInt(st[i]));
                   space.add(p);
               }
               else{
                   Product p = new Product(st2[i],0,Integer.parseInt(st[i]));
                   pyramid.add(p);
               }
               count++;
           }
           input.close();
           input2.close();
           
     }
     public static void save() throws IOException{
         PrintWriter out = new PrintWriter(new FileWriter("Branchquantity.txt"));
         for(int i = 0;i<space.size();i++){
             out.print(space.get(i).Quantity);
             out.print(",");
            
         }
         for(int i = 0;i<pyramid.size();i++){
             out.print(pyramid.get(i).Quantity);
             out.print(",");
            
         }
         out.close();
     }
     
     
}

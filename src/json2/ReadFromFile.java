/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json2;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Poozer
 */
public class ReadFromFile {
    ReadFromFile1(){
       File file = new File("C:\\Users\\Poozer\\Desktop\\test.txt"); 
        try {
            Scanner sc = new Scanner(file);
            
            // we just need to use \\Z as delimiter
            sc.useDelimiter("\\Z");
            
            System.out.println(sc.next());
            
            // parsing file "JSONExample.json"
            Object obj = new JSONParser().parse(new FileReader(file));
            
            // typecasting obj to JSONObject
            JSONObject jo = (JSONObject) obj;
            
            // getting and printing info
            String firstName = (String) jo.get("firstName");
            String lastName = (String) jo.get("lastName");
            long age = (long) jo.get("age");
            Map address = ((Map)jo.get("address"));
            Iterator<Map.Entry> itr1 = address.entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
            System.out.println(firstName);
            System.out.println(lastName);
            System.out.println(age);
            System.out.println(pair.getKey() + " : " + pair.getValue());
            }
            JSONArray ja = (JSONArray) jo.get("phoneNumbers");
            
            // iterating phoneNumbers
            Iterator itr2 = ja.iterator();
            
            while (itr2.hasNext())
            {
                itr1 = ((Map) itr2.next()).entrySet().iterator();
                while (itr1.hasNext()) {
                    Map.Entry pair = itr1.next();
                    System.out.println(pair.getKey() + " : " + pair.getValue());
                } 
            }
        } catch (IOException ex) {
            Logger.getLogger(ReadFromFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ReadFromFile.class.getName()).log(Level.SEVERE, null, ex);
        }
  } 
} 


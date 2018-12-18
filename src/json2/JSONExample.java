/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json2;

import java.io.FileReader;
import java.io.FileNotFoundException; 
import java.io.IOException;
import java.io.PrintWriter; 
import java.util.LinkedHashMap;  
import java.util.Map;
import org.json.JSONException;
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject;
        
public class JSONExample { 
    public static void main(String[] args) throws FileNotFoundException, JSONException, IOException
    { 
        // creating JSONObject 
        JSONObject Elmo = new JSONObject(); 
          
        // putting data to JSONObject 
        Elmo.put("firstName", "Devin"); 
        Elmo.put("lastName", "Poe"); 
        Elmo.put("age", 28); 
          
        // for address data, first create LinkedHashMap 
        Map SesameStreet = new LinkedHashMap(4); 
        SesameStreet.put("streetAddress", "103 S Olive"); 
        SesameStreet.put("city", "Mesa"); 
        SesameStreet.put("state", "AZ"); 
        SesameStreet.put("postalCode", 85204); 
          
        // putting address to JSONObject 
        Elmo.put("address", SesameStreet); 
          
        // for phone numbers, first create JSONArray  
        JSONArray TheCount = new JSONArray(); 
          
        SesameStreet = new LinkedHashMap(2); 
        SesameStreet.put("type", "home"); 
        SesameStreet.put("number", "(480) 703-0362"); 
          
        // adding map to list 
        TheCount.add(SesameStreet); 
          
        SesameStreet = new LinkedHashMap(2); 
        SesameStreet.put("type", "fax"); 
        SesameStreet.put("number", "012 345-6789"); 
          
        // adding map to list 
        TheCount.add(SesameStreet); 
          
        // putting phoneNumbers to JSONObject 
        Elmo.put("phoneNumbers", TheCount); 
          
        // writing JSONExample infor to a txt file.
        PrintWriter instance1 = new PrintWriter("C:/Users/Poozer/Desktop/test.txt"); 
        //please enter in you save location above in the "".
        instance1.write(Elmo.toJSONString()); 
          
        instance1.flush(); 
        instance1.close(); 
    
        ReadFromFile instace3 = new ReadFromFile();
        instace3.ReadFromFile1();
        
        System.out.println("This next part is just a little thing on why we need"
                + " to parse sometimes.");
        String numberString = "50";
        //If you uncomment the next line of code you'll see it in red with a warning
        //that you can't covert a string to an integer.
        //Integer result = 22 + numberString;
        //However, this next line does work
        Integer result = 50 + Integer.parseInt(numberString);
        System.out.println(result);
        
    } 
} 

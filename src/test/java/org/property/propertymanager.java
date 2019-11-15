package org.property;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertymanager {
	 
    private static propertymanager instance;
    private static final Object lock = new Object();
    private static String propertyFilePath = System.getProperty("user.dir")+
            "\\config.properties";
    
    private static String url;
 
 
    //Create a Singleton instance. We need only one instance of Property Manager.
    public static propertymanager getInstance () {
    	System.out.println("++"+propertyFilePath);
        if (instance == null) {
            synchronized (lock) {
                instance = new propertymanager();
                instance.loadData();
            }
        }
        return instance;
    }
 
    //Get all configuration data and assign to related fields.
    private void loadData() {
        //Declare a properties object
        Properties prop = new Properties();
 
        //Read configuration.properties file
        try {
            prop.load(new FileInputStream(propertyFilePath));
            //prop.load(this.getClass().getClassLoader().getResourceAsStream("configuration.properties"));
        } catch (IOException e) {
            System.out.println("Configuration properties file cannot be found");
        }
 
        //Get properties from configuration.properties
        
        url = prop.getProperty("url");
      
    }
 
    public String getURL () {
      return url;
    }
 
   
}
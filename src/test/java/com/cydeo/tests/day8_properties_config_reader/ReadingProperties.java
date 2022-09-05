package com.cydeo.tests.day8_properties_config_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
    @Test
    public void reading_from_properties_test() throws IOException {
        //create the object of Properties class
        Properties properties=new Properties();

        //we need to open the file in java memory using file input stream
        FileInputStream file= new FileInputStream("configuration.properties");

        //load the properties object using fileInputStream object
        properties.load(file);


        //use properties object to read value
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));


    }
}


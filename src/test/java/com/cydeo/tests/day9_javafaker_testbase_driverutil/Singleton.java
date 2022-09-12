package com.cydeo.tests.day9_javafaker_testbase_driverutil;

public class Singleton {

          //1#create private constructor
        private  Singleton(){}


         //2#create private static string
         //prevent access and provide a getter method
        private static String word;

        //This utility method will return the "word" in the way we want to return

        public static String getWord(){
            if(word==null){

                System.out.print("first time call.Word object is null"+"assigning value to it now");
                word="something";
            }else{
                System.out.println("word already has value");
            }
            return word;

        }




}

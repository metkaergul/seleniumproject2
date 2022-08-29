package com.cydeo.tests.day5_TetsNg_Intro_Dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNg_Intro {

    @BeforeClass
    public void SetUpMethod(){
        System.out.println("------->BeforeClass is running!");
    }
    @AfterClass
    public void TearDown(){
        System.out.println("------->AfterClass is running");
    }


    @BeforeMethod
    public void SetUpmethod(){

        System.out.println("-->BeforeMethod is running!");

    }

    @AfterMethod
    public void TearDownMethod(){
        System.out.println("-->AfterMethod is running!");

    }
    @Test(priority = 1)//normally in java code is executed from  top the bottom but we can change the order by prioritizing,
    public void test1(){
        System.out.println("test1 is running");
        //ASSERT EQUALS :compare two of the same things
        String actual= "apple";
        String expected= "apple";
        Assert.assertEquals(actual,expected);
    }

    @Test(priority = 2)
    public void test2(){
        System.out.println("test 2is running");
        //ASSERT TRUE :
        String actual= "apple";
        String expected= "apple";
        Assert.assertTrue(actual.equals(expected));
    }
}

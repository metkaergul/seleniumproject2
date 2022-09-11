package com.cydeo.tests.day9_javafaker_testbase_driverutil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){
//creating faker object to reach methods
        Faker faker=new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        //numerify()method will generate random mumbers in the format we want to get
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));

        //we want first three digit of number to be stable and the rest is changing, it is also possible
        System.out.println("faker.numerify(\"123-###-####\") = " + faker.numerify("123-###-####"));
        //letterify()method will return random letters where we pass "?"
        System.out.println("faker.letterify(\"???-??-???\") = " + faker.letterify("???-??-???"));
        //bothify()method  randomly generated both letters and numbers which is represented by ? and # respectively
        System.out.println("faker.bothify(\"##?#-???##-??##\") = " + faker.bothify("##?#-???##-??##"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard().replaceAll("-", ""));
    }
}

package com.niit.ibm;

/**
 * Hello world!
 *
 */
public class App


{
    static String name;
    int age;

    static{
        name = "Akshay Thool";
        System.out.println(name);
    }

    void message1(){
        System.out.println("Instance methods");
    }

    static void message(){
        System.out.println("3 Static method -->"+name);
    }

    public App(){
        System.out.println("Static Method --> Construtor");
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        new App();
        System.out.println("Static Variable Method-->"+App.name);
        App.message();
        new App().message1();
    }
}

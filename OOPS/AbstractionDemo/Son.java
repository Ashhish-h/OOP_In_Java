package OOPS.AbstractionDemo;

public class Son extends Parent{
    void eat(String type){
        System.out.println("Son is " + type);
    }

    void walk(int legs){
        System.out.println("Son also walks on " + legs + " legs");
    }
}
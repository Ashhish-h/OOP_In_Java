package OOP.generics.wildCardInGeneric;

import java.util.ArrayList;
import java.util.List;

public class UpperAndLowerBoundedWildCard {
    public static void deleteBike(List<? extends Bike> list, Bike bike){ // upper bounded wild cards
        list.remove(bike);
        System.out.println("bike removed");
    }

    public static void addBike(List<? super Bullet> list2){  // lower bounded wild cards
        list2.add(new Bullet("classic"));  
        System.out.println("Bike added");
    }

    public static void printItems(List<?> list){
        for (Object object : list) {
            System.out.println(object);
        }
    }

    public static void main(String[] args) {
        List<Vehicle> v1 = new ArrayList<>();
        List<Bullet> b1 = new ArrayList<>();

        addBike(b1);
        addBike(v1);
        printItems(b1);
        printItems(v1);
        Bullet bike1 = b1.get(0);
        deleteBike(b1, bike1);
        printItems(b1);
        
    }
}

class Vehicle {
    String name;
    Vehicle(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}

class Bike extends Vehicle {
    String name;
    Bike(String name){
        super(name);
    }
}

class Bullet extends Bike {
    String name;
    Bullet(String name){
        super(name);
    }
}

class Car extends Vehicle {
    String name;
    Car(String name){
        super(name);
    }
}
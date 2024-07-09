package OOP.interfaces;

public class Main {
    public static void main(String[] ags){
        Car car = new Car();
        car.startEngine();
        car.stopEngine();
        car.pressBrake();
        car.startMedia();
        car.stopMedia();
    }
}



// if you have same method name in all the interfaces it will cause problems because you can not use same method name in a program if it does not have different numbers of parameters to solve this probelem we create seperate classes that implements each interfaces

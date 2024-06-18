package OOPS.ExtendingInterfaces;

public class Main implements Interface_B{

    @Override
    public void functionA() {
        System.out.println("Function A");
    }

    @Override
    public void functionB() {
        System.out.println("Function B");
    }
    
}


//if a interface extends another interface and  main class implements any one interface then user has to implement all the functions in both interfaces.
// In java multiple inheritence is achieved by interefaces
// Methods in interface are implicitly public;;
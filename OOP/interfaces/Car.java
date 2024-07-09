package OOP.interfaces;

public class Car implements Engine, Brake, Media{
    public void startEngine(){
        System.out.println("Engine has started");
    }
    
    public void stopEngine(){
        System.out.println("Engine has stopped");
    }

    public void acc(){
        System.out.println("Engine is accelarating");
    }

    public void pressBrake() {
        System.out.println("Car has stopped");
    }

    public void startMedia(){
        System.out.println("Music player has stopped");
    }

    public void stopMedia(){
        System.out.println("Music player has stoppped");
    }
}

package OOPS.inheritence;

public class Main {
    public static void main(String[] args){
        Child Rohan = new Child();
        Rohan.eat();
        Rohan.breath(); 
        Rohan.age = 1;
        Rohan.name = "Rohan";
        System.out.println(Rohan.name + " " + Rohan.age);
    }
}


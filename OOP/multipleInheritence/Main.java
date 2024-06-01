package OOPS.multipleInheritence;

public class Main {
    public static void main(String[] args) {
        Dog Tom = new Dog();
        Tom.breathe();
        Tom.eat();
        Tom.name = "Dog";
        Tom.legs = 4;
        Tom.age = 11;
        System.out.println(Tom.name);
        System.out.println(Tom.legs);
        System.out.println(Tom.age);

    }
}

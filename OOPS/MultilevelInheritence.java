package OOPS;

public class MultilevelInheritence
{
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

class Animal {
    void breathe(){
        System.out.println("Animal is capable of breathing");
    }

    void eat(){
        System.out.println("Animal is capable of eating");
    }
}

class Mammal extends Animal {
    String name;
    int legs;
}

class Dog extends Mammal {
    int age;
}
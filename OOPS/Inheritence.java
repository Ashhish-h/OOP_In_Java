package OOPS;

public class Inheritence
{   
    public static void main(String[] args){
        Child Rohan = new Child();
        Rohan.eat();
        Rohan.breath(); 
        Rohan.age = 1;
        Rohan.name = "Rohan";
        System.out.println(Rohan.name + " " + Rohan.age);
    }
}

class Parent
{
    public void eat()
    {
        System.out.println("Can eat");
    }

    public void breath(){
        System.out.println("Breath");
    }
}

class Child extends Parent
{
    int age;
    String name;
}
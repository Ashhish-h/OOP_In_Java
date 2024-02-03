package OOPS.EnumsExample;

public class EnumsExample {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        Week(){ //constructor of enum
            System.out.println("This is constructor for this enum");
        }

    }

    //enum concept
    //We use enum when we want to create or want to work on fixed objects
    //These are enums constant
    //They are by default public static final
    //enums can not inherit any other class since it inherits java.lang.Enum class and multiple inheritence is not allowed in java
    //since it is final you can create child enums
    //enum Week(Week is a data type)
    //enum can implement as many interface as user wants
    //You can create constructor of a enum class
    public static void main(String[] args){
        Week week;
        week = Week.Monday;
        System.out.println(week);
    }  
}

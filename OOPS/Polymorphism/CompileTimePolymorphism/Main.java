package CompileTimePolymorphism;

public class Main {
    public static void main(String[] args){
        Sum Variables = new Sum();
        Variables.a = 10;
        Variables.b = 20;
        Variables.c = 30;
        Variables.getSum(10, 20);
        Variables.getSum(10, 20, 30);
    }
}

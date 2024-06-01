package CompileTimePolymorphism;

public class Sum {
    int a,b,c;

    void getSum(int a, int b){
        int sum = a + b;
        System.out.println("Sum of a and b are :" + sum);
    }

    void getSum(int a, int b, int c){
        int sum = a + b + c;
        System.out.println("Sum of a, b and c are :" + sum);
    }
}

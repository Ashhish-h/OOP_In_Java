package OOP.generics.boundedTypeParameterExample;

public class Main {
    public static void main(String[] args){
        // BankAccount<Integer> amount = new BankAccount<>();
        BankAccount<Number> balance = new BankAccount<>();
        // balance.amount = 10000;
        balance.showBalance();

        balance.amount = 780999.86; // it will show an error because we are only accepting Integer of Number so it will restrict it to recieve Integer to solve this use Number instead of Integer

        balance.showBalance();


    }
}

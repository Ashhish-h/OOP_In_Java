package OOP.generics.generic;

public class Main {
    public static void main(String[] args){
        // we are specifing different type for the BankAccount class without doing any type of type conversion(explicit)

        BankAccount<String> accountOwner = new BankAccount<>("Ashish");
        accountOwner.showInfo();
        BankAccount<Integer> account = new BankAccount<>(10000);
        account.showInfo();

        Integer[] amt = {1000, 120202, 32000};
        Double[] amount = {9000.90, 78888.90, 763330.70};

        account.depositMoney(amt);

        account.depositMoney(amount);
        
    }
}

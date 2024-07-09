package OOP.generics.boundedTypeParameterExample;

class BankAccount<T extends Number> { 
    // You can extend a class and an interface at same like by <T extends Number & Runnable> but it doen't support exteding two classes at the same time same logic as multiple inheritence.

    T amount;

    public void showBalance(){
        System.out.println(this.amount);
    }

}
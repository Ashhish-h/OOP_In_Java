package OOP.generics.generic;
// This is an example of generic class and method in java. It's syntax and everything will be shown with this example

class BankAccount<T> {
    T info;
    BankAccount(T info){
        this.info = info;
    }

    public void showInfo(){
        System.out.println(info);
    }

    public <E> void depositMoney(E[] amt){
        /**  we didn't use E here instead of T because if you have two type parameters with the same name T, it can lead to confusion and potential bugs. To resolve this, you should use different names for the type parameters in your class and the depositMoney method. */
        for(E i : amt){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

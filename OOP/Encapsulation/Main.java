package OOP.Encapsulation;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter the details of the user");
        BankAccount user1 = new BankAccount();
        user1.userName = "Ashish";
        user1.setPassword("Ash123_");
        user1.userAddress = "Gla University, Mathura";
        System.out.println("User Details");
        System.out.println(user1.userName);
        System.out.println(user1.getPassword());
        System.out.println(user1.userAddress);
    }
}

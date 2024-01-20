package OOPS;

public class CreatingGettersAndSetters{
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

class BankAccount{
    public String userName;
    private String userPassword;
    public String userAddress;

    public void setPassword(String Password){
        this.userPassword = Password;
    }

    public String getPassword(){
        return this.userPassword;
    }

}
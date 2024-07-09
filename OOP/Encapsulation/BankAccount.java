package OOP.Encapsulation;

public class BankAccount {
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

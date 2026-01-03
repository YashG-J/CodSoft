package ATM;

public class Task3 {

    public static void main(String[] args) {

        BankAccount userAccount = new BankAccount(5000);
        User_interface atm = new User_interface(userAccount);

        atm.menu();
    }
}

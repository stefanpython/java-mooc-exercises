public class YourFirstAccount {

    public static void main(String[] args) {
        // Create a new account with an initial balance
        Account newAccount = new Account("My Account", 100.0);
        
        // Deposit money into the account
        newAccount.deposit(20.0);
        
        // Print the account balance
        System.out.println("Account balance: " + newAccount.toString());
    }
}

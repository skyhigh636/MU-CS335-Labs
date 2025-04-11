package lab1;

/**
 * Class containing constructor,deposit,withdraw,getter methods for Transactions
 * @since 12/02/2025
 */



public class BankAccount {

    private double balance;

    //Constructors
    public BankAccount()
    {
        /**
         * default Balance
         */
        balance = 0;
    }

    public BankAccount(double initialBalance)
    {
        /**
         * starting balance
         */
        balance = initialBalance;
    }

    // Methods
    public void deposit(double amount)
    {
        /**
         * balance + amount deposited
         */
        balance = balance + amount;

    }

    public boolean withdraw(double amount)
    {
        /**
         * check if balance is bigger than amouny withdrawn
         */
        if (balance>= amount)
        {
            balance = balance - amount;
            return true;
        }
        else
            return false;

    }

    public double getBalance()
    {
        /**
         * @return balance
         */
        return balance;
    }
}
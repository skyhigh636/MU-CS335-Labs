package lab1;

import javax.swing.JOptionPane;

/**
 * Class containing a method to deposit or withdraw from BankAccount class
 *
 * @since 12/02/2025
 */
public class Transactions {


    public int answer1, answer2, amount;
    public boolean withdrawOK = true;
    public BankAccount ba;

    public Transactions() {
/**
 * @param answer1
 * @param answer2
 * @param amount
 * @param ba
 */


        answer1 = 0;
        answer2 = 0;
        amount = 0;
        ba = new BankAccount(1000);

    }

    public static void main(String[] args) {

        Transactions transaction = new Transactions();
        transaction.getInput();
        System.exit(0);

    }

    public void getInput() {
        /**
         * @param answer1,answer2,amount
         * @param ba
         * @param depStrng
         */
        answer1 = JOptionPane.showConfirmDialog(null, "Make a Depoist?", null, JOptionPane.YES_NO_OPTION);

        if (answer1 == JOptionPane.YES_OPTION) {
            String depString = JOptionPane.showInputDialog("Enter amount:");
            amount = Integer.parseInt(depString);

            //deposit an amount in the account
            ba.deposit(amount);

        } else if (answer1 == JOptionPane.NO_OPTION) {
            answer2 = JOptionPane.showConfirmDialog(null, "Make a Withdraw?", null, JOptionPane.YES_NO_OPTION);

            if (answer2 == JOptionPane.YES_OPTION) {
                String withString = JOptionPane.showInputDialog("Enter amount:");
                amount = Integer.parseInt(withString);

                //withdraw an amount from the account
                ba.withdraw(amount);

            }


        }
        if (!withdrawOK)
            JOptionPane.showMessageDialog(null, "Your Balance  = " + ba.getBalance() + " which is not enough for this withdraw ");
        else JOptionPane.showMessageDialog(null, " Your balance is " + ba.getBalance());

    }


}



package L8Q2;
/* Define a class name BankAccount. The class allows the customer to open the saving account
with their name, IC or passport number and the deposit amount. The class consists of deposit
method and withdraws method. Besides, the class can display the current balance. Create
a Tester class to test the program.
 */

public class BankAccount {

    private String name,ic;
    private double amount;

    public BankAccount(String n, String i, double a) {
        name = n;
        ic = i;
        amount = a;
    }

    public void deposit(double a){
        amount += a;
        System.out.println("Deposit " + a + " successfully");
    }

    public void withdraws(double a) {
        if (a > amount)
            System.out.println("Your withdraw more than your balance");
        else {
            amount -= a;
            System.out.println("Withdraw " + a + " successfully");
        }
    }

    public void output(){
        System.out.println("The current balance is " + amount);
    }
}

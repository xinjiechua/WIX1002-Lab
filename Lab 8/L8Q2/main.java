package L8Q2;

public class main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Jane","030303070733", 50000);
        acc.deposit(800);
        acc.withdraws(275);
        acc.output();
    }
}

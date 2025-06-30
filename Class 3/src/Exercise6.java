import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount> accountsList = new ArrayList<>();
        String accountNumber;
        double accountBalance;
        System.out.println("Enter the account number and balance. Type 'stop' to finish.");

        do {
            System.out.print("Number: ");
            accountNumber = scanner.nextLine();

            if (!isNumber(accountNumber) && !wishStop(accountNumber))
                System.out.println("Type a number, please");
            else if (!wishStop(accountNumber)) {
                System.out.print("Balance: ");
                accountBalance = scanner.nextDouble();
                scanner.nextLine();
                accountsList.add(new BankAccount(accountNumber, accountBalance));
            }
        } while (!wishStop(accountNumber));

        if (accountsList.isEmpty()) {
            System.out.println("Unfortunately, no item was added to the bank account list.");
        } else {
            BankAccount biggestBalanceAccount= getBiggestBalanceAccount(accountsList);
            System.out.printf("The account with biggest balance is " + biggestBalanceAccount.getNumber() +
                    " and its balance is R$%.2f \n",biggestBalanceAccount.getBalance());
        }

    }
    static boolean isNumber(String string) {
        return string.matches("\\d+");
    }
    static boolean wishStop(String answer){
        return answer.equalsIgnoreCase("stop");
    }

    public static BankAccount getBiggestBalanceAccount(ArrayList<BankAccount> accountsList){
        BankAccount biggestBalanceAccount = accountsList.get(0);
        for (BankAccount account : accountsList) {
            if (account.getBalance() > biggestBalanceAccount.getBalance()) {
                biggestBalanceAccount = account;
            }
        }
        return biggestBalanceAccount;
    }
}

class BankAccount {
    private String number;
    private double balance;

    public BankAccount(String number, double balance) {
        this.number = number;
        this. balance =  balance;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double  balance) {
        this. balance =  balance;
    }
}


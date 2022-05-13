import java.io.*;

public class Main {
    public static void main(String[] args) {
        Account Account = new Account();
        Account.add(10);
        Account.withdraw(6);
        System.out.println(Account.getBalance());
    }
}
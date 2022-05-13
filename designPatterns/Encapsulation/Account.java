public class Account {
    private int balance;

    public void add(int rs) {
        this.balance += rs;
    }

    public void withdraw(int rs) {
        this.balance -= rs;
    }

    public int getBalance() {
        return this.balance;
    }
}
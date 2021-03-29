package FacadePattern;

public class Wallet {

    private int cash = 1000;

    public int getWalletBalance() {
        return cash;
    }

    public void decreaseCashAmount(int amount) {
        cash -= amount;
    }

    public void increaseCashAmount(int amount) {
        cash += amount;
    }

    public boolean withdrawCash(int amount) {

        if(amount > getWalletBalance()) {
            System.out.println("    [Error] You don't have enough cash ( Current Balance: " + getWalletBalance() + " )");
            return false;
        }
        else {
            decreaseCashAmount(amount);
            System.out.println("    [Withdrawal Complete] new balance: " + getWalletBalance());
            return true;
        }
    }

    public void depositCash(int amount) {
        increaseCashAmount(amount);
        System.out.println("    [Deposit Complete] new balance: " + getWalletBalance());
    }
}

package FacadePattern;

public class TransactionFacade {

    private int userNumber;
    private int securityCode;

    UserNumberCheck userNumberCheck;
    SecurityCodeCheck securityCodeCheck;
    Wallet wallet;
    AssistantRobot assistantRobot;

    public TransactionFacade(int userNumber, int securityCode) {
        this.userNumber = userNumber;
        this.securityCode = securityCode;

        assistantRobot = new AssistantRobot();
        userNumberCheck = new UserNumberCheck();
        securityCodeCheck = new SecurityCodeCheck();
        wallet = new Wallet();
    }

    public int getUserNumber() {
        return userNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(int amount) {
        if(userNumberCheck.checkUserNumber(getUserNumber()) &&
                securityCodeCheck.checkSecurityCode(getSecurityCode())) {
            wallet.withdrawCash(amount);
        }
        else {
            System.out.println("    [User Authorization Failed]");
        }
    }

    public void depositCash(int amount) {
        if(userNumberCheck.checkUserNumber(getUserNumber()) &&
                securityCodeCheck.checkSecurityCode(getSecurityCode())) {
            wallet.depositCash(amount);
        }
        else {
            System.out.println("    [User Authorization Failed]");
        }
    }
}

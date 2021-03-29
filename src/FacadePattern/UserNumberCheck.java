package FacadePattern;

public class UserNumberCheck {

    private final int userNumber = 32498;

    public int getUserNumber() {
        return userNumber;
    }

    public boolean checkUserNumber(int userNumber) {
        return (userNumber == getUserNumber());
    }
}

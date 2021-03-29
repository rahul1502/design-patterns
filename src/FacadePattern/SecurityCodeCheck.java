package FacadePattern;

public class SecurityCodeCheck {

    private int securityCode = 6874;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean checkSecurityCode(int securityCode) {
        return (securityCode == getSecurityCode());
    }
}

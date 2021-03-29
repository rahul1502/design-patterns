package FacadePattern;

public class FacadePatternTester {

    public void test() {

        TransactionFacade transactionFacade = new TransactionFacade(32498, 6874);

        transactionFacade.depositCash(500);
        transactionFacade.withdrawCash(900);
        transactionFacade.withdrawCash(1000);

    }
}

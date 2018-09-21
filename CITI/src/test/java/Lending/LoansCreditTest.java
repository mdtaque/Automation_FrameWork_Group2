package Lending;

import base.CommonAPI;
import org.testng.annotations.Test;

public class LoansCreditTest extends CommonAPI {
    @Test
    public void LoansCredit(){
        clickOnlinkText("Lending");
        clickOnlinkText("Personal Loans & Lines of Credit");
    }
}

package homePageObjectTest;

import base.CommonAPI;
import homePageObject.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePageTest extends CommonAPI {
    HomePage objectHomePage;

    @BeforeMethod
    public void initializePageObject() {
        this.objectHomePage = new HomePage();
    }
    @Test
    public void testSignupLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        boolean actual = objectHomePage.verifySignUpLink();
        Assert.assertTrue(actual);
        System.out.println("testSignupLink test has passed");
    }
    @Test
    public void testTheHeadLineText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual = objectHomePage.goToHelpCentrePageAndCollectTheHeadlineText();
        String expected = "Hi, how can we help you?";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testTheHeadLineText tes has passed");
    }
    @Test
    public void testHelpCenterLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        boolean actual = objectHomePage.verifyHelpCenterLink();
        Assert.assertTrue(actual);
        System.out.println("testHelpCenterLink test has passed");
    }
    @Test
    public void testCarrerLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        boolean actual = objectHomePage.goToCareerPage();
        Assert.assertTrue(actual);
    }
    @Test
    public void testUniversityLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectHomePage.clickUniversityLink();
    }
    @Test
    public void testSalaryLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectHomePage.clickSalaryLink();
    }
    @Test
    public void testJobLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectHomePage.gotoJobsPage();
    }
    @Test
    public void testPressLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectHomePage.pressLinkFromGeneralSecOfFooterLink();
    }
    @Test
    public void testDeveloperLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectHomePage.developerLinkFromGeneralSecOfFotterLink();
    }
    @Test
    public void testLearningLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectHomePage.learningLinkFromGeneralSecOfFooterLink();
    }
    @Test
    public void testTalentLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectHomePage.talentLinkFromBusSolSecOfFooterLink();
    }
    @Test
    public void testMarketingLink() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectHomePage.marketingLinkfromBusSolSecOfFotterLink();
    }
    @Test
    public void testSalesLinkOfBusSol(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectHomePage.salesLinkFromBusSolSecOfFooterLink();
    }
    @Test
    public void testLearningLinkofSolutionSec(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectHomePage.learningLinkFromSolutionSec();
    }
    @Test
    public void testTalentLinkFromBusSolSecOfFooterLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectHomePage.talentLinkFromBusSolSecOfFooterLink();
    }
    @Test
    public void testMobileLinkFromBrowseLinkedInSec(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectHomePage.mobileLinkFromBrowseLinkedInSec();
    }
    @Test
    public void testProFinderLinkFromBrowLinInSec(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectHomePage.proFinderLinkFromBrowLinInSec();
    }
    @Test
    public void testMembersLinkFromDirectorySec(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectHomePage.membersLinkFromDirectorySec();
    }
    @Test
    public void testPulseLinkFromDirectorySec(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectHomePage.pulseLinkFromDirectorySec();
    }
    @Test
    public void testTopjobLinkFromDirectorySec(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectHomePage.topjobLinkFromDirectorySec();
    }
    @Test
    public void testClickUniversityLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objectHomePage.clickUniversityLink();}
}



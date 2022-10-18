package tests;

import helper.Constants;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class LogInTests extends TestsSetUp {

    @Test
    public void unSuccessfulLogInTest(){
        logInPage.logIn(Constants.LOCKEDUSERNAME, Constants.PASSWORD);
        String message = logInPage.getErrorMessage();
        assertEquals(Constants.LOCKEDUSEREXCEPTIONMESSAGE, message);
    }
    @Test
    public void successfulLogInTest() {
        logInPage.logIn(Constants.VALIDUSERNAME, Constants.PASSWORD);
        String actualUrl = getTheCurrentPageUrl();
        AssertJUnit.assertEquals(Constants.INVENTORYPAGEURL, actualUrl);
    }
}

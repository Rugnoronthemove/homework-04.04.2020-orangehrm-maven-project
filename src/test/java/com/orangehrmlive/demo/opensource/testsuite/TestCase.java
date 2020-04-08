package com.orangehrmlive.demo.opensource.testsuite;

import com.orangehrmlive.demo.opensource.pages.AccountPage;
import com.orangehrmlive.demo.opensource.pages.HomePage;
import com.orangehrmlive.demo.opensource.testbase.TestBase;
import org.testng.annotations.Test;

public class TestCase extends TestBase {

    //object creation
    HomePage homePage = new HomePage();
    AccountPage accountPage = new AccountPage();

    //TestCases
    @Test
    public void verifyUserCanSuccessfullyLogin() {
        //send text to username field
        homePage.clickAndSendTextToUsernameField();
        //send text to password field
        homePage.clickAndSendTextToPasswordField();
        //click on login button
        homePage.clickOnLoginBtn();
        //verify text on AccountPage
        accountPage.verifyTextWelcomeAdmin();
    }

    @Test
    public void verifyUserCanSuccessfullyLogout() {
        //send text to username field
        homePage.clickAndSendTextToUsernameField();
        //send text to password field
        homePage.clickAndSendTextToPasswordField();
        //click on login button
        homePage.clickOnLoginBtn();
        //verify text on AccountPage
        accountPage.verifyTextWelcomeAdmin();
        //click on welcome admin button
        accountPage.clickOnWelcomeAdmin();
        //click on logout link
        accountPage.clickOnLogoutLink();
        //verify text on HomePage
        homePage.verifyTextLoginPanelText();
    }

}

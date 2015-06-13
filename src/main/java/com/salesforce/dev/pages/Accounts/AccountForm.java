package com.salesforce.dev.pages.Accounts;

import com.salesforce.dev.framework.DriverManager;
import com.salesforce.dev.pages.Base.FormBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Date;

/**
 * Created by Walter on 10/06/2015.
 */
public class AccountForm extends FormBase{

    private String accountName, parentAccount, accountNumber, accountSite, accountType, accountIndustry;
    private String accountRating, accountPhone, accountFax, accountWebsite, accountThicker, accountOwnership,accountSICCode;
    private String accountBillingStreet,accountShippingStreet,accountBillingCity,accountShippingCity;
    private String accountBillingState,accountShippingState,accountBillingZip,accountShippingZip,accountBillingCountry;
    private String accountShippingCountry,accountCustomerPriority,accountSLA, accountSLASerialNumber;
    private String accountUpsellOpportunity, accountDescription;
    private Boolean accountActive;
    private Integer accountEmployees, accountAnnualRevenue, accountNumberLocations;
    private Date accountSLAExpirationDate;

    //Account Information

    @FindBy(name = "acc2")
    private WebElement accountNameFld;

    @FindBy(id = "acc3")
    private WebElement parentAccountFld;

    @FindBy(id = "acc5")
    private WebElement accountNumberFld;

    @FindBy(id = "acc23")
    private WebElement accountSiteFld;

    @FindBy(id = "acc6")
    private WebElement accountTypeFld;

    @FindBy(id = "acc7")
    private WebElement accountIndustryFld;

    @FindBy(id = "acc8")
    private WebElement accountAnnualRevenueFld;

    @FindBy(id = "acc9")
    private WebElement accountRatingFld;

    @FindBy(id = "acc10")
    private WebElement accountPhoneFld;

    @FindBy(id = "acc11")
    private WebElement accountFaxFld;

    @FindBy(id = "acc12")
    private WebElement accountWebsiteFld;

    @FindBy(id = "acc13")
    private WebElement accountThickerFld;

    @FindBy(id = "acc14")
    private WebElement accountOwnershipFld;

    @FindBy(id = "acc15")
    private WebElement accountEmployeesFld;

    @FindBy(id = "acc16")
    private WebElement accountSICCodeFld;

    //AddressAddress Information

    @FindBy(id = "acc17street")
    private WebElement accountBillingStreetFld;

    @FindBy(id = "acc17city")
    private WebElement accountBillingCityFld;

    @FindBy(id = "acc17state")
    private WebElement accountBillingStateFld;

    @FindBy(id = "acc17zip")
    private WebElement accountBillingZipFld;

    @FindBy(id = "acc17country")
    private WebElement accountBillingCountryFld;

    @FindBy(id = "acc18street")
    private WebElement accountShippingStreetFld;

    @FindBy(id = "acc18city")
    private WebElement accountShippingCityFld;

    @FindBy(id = "acc18state")
    private WebElement accountShippingStateFld;

    @FindBy(id = "acc18zip")
    private WebElement accountShippingZipFld;

    @FindBy(id = "acc18country")
    private WebElement accountShippingCountryFld;

    // Additional Information

    @FindBy(id = "00N1a0000058Wdm")
    private WebElement accountCustomerPriorityFld;

    @FindBy(id = "00N1a0000058Wdp")
    private WebElement accountSLAExpirationDateFld;

    @FindBy(id = "00N1a0000058Wdn")
    private WebElement accountNumberLocationsFld;

    @FindBy(id = "00N1a0000058Wdl")
    private WebElement accountActiveFld;

    @FindBy(id = "00N1a0000058Wdo")
    private WebElement accountSLAFld;

    @FindBy(id = "00N1a0000058Wdq")
    private WebElement accountSLASerialNumberFld;

    @FindBy(id = "00N1a0000058Wdr")
    private WebElement accountUpsellOpportunityFld;

    //Description Information

    @FindBy(name = "acc20")
    private WebElement accountDescriptionFld;


    public AccountForm(WebDriver driver) {
        super.driver = driver;
        super.wait = DriverManager.getInstance().getWait();
        PageFactory.initElements(super.driver, this);

    }

    @Override
    public Object clickSaveNewBtn() {
        return null;
    }

    @Override
    public Object clickCancelBtn() {
        return null;
    }

    @Override
    public AccountDetail clickSaveBtn() {
        clickSaveButton();
        return new AccountDetail(driver);
    }

    public AccountForm setAccountNumberFld(String accountNumber) {
        accountNameFld.clear();
        accountNameFld.sendKeys(accountNumber);
        return this;
    }

    public AccountForm setAccountSiteFld(String accountSite) {
        accountSiteFld.clear();
        accountSiteFld.sendKeys(accountSite);
        return this;
    }

    public AccountForm setAccountTypeFld(String accountType) {
        accountTypeFld.clear();
        accountTypeFld.sendKeys(accountType);
        return this;
    }

    public AccountForm setAccountIndustryFld(String accountIndustry) {
        accountIndustryFld.clear();
        accountIndustryFld.sendKeys(accountIndustry);
        return this;
    }

    public AccountForm setAccountAnnualRevenueFld(String accountAnnualRevenue) {
        accountAnnualRevenueFld.clear();
        accountAnnualRevenueFld.sendKeys(accountAnnualRevenue);
        return this;
    }

    public AccountForm setAccountRatingFld(String accountRating) {
        accountRatingFld.clear();
        accountRatingFld.sendKeys(accountRating);
        return this;
    }

    public AccountForm setAccountPhoneFld(String accountPhone) {
        accountPhoneFld.clear();
        accountPhoneFld.sendKeys(accountPhone);
        return this;
    }

    public AccountForm setAccountFaxFld(String accountFax) {
        accountFaxFld.clear();
        accountFaxFld.sendKeys(accountFax);
        return this;
    }

    public AccountForm setAccountWebsiteFld(String accountWebsite) {
        accountWebsiteFld.clear();
        accountWebsiteFld.sendKeys(accountWebsite);
        return this;
    }

    public AccountForm setAccountThickerFld(String accountThicker) {
        accountThickerFld.clear();
        accountThickerFld.sendKeys(accountThicker);
        return this;
    }

    public AccountForm setAccountOwnershipFld(String accountOwnership) {
        accountOwnershipFld.clear();
        accountOwnershipFld.sendKeys(accountOwnership);
        return this;
    }

    public AccountForm setAccountEmployeesFld(String accountEmployees) {
        accountEmployeesFld.clear();
        accountEmployeesFld.sendKeys(accountEmployees);
        return this;
    }

    public AccountForm setAccountSICCodeFld(String accountSICCode) {
        accountSICCodeFld.clear();
        accountSICCodeFld.sendKeys(accountSICCode);
        return this;
    }

    public AccountForm setAccountBillingStreetFld(String accountBillingStreet) {
        accountBillingStreetFld.clear();
        accountBillingStreetFld.sendKeys(accountBillingStreet);
        return this;
    }

    public AccountForm setAccountBillingCityFld(String accountBillingCity) {
        accountBillingCityFld.clear();
        accountBillingCityFld.sendKeys(accountBillingCity);
        return this;
    }

    public AccountForm setAccountBillingStateFld(String accountBillingState) {
        accountBillingStateFld.clear();
        accountBillingStateFld.sendKeys(accountBillingState);
        return this;
    }

    public AccountForm setAccountBillingZipFld(String accountBillingZip) {
        accountBillingZipFld.clear();
        accountBillingZipFld.sendKeys(accountBillingZip);
        return this;
    }

    public AccountForm setAccountBillingCountryFld(String accountBillingCountry) {
        accountBillingCountryFld.clear();
        accountBillingCountryFld.sendKeys(accountBillingCountry);
        return this;
    }

    public AccountForm setAccountShippingStreetFld(String accountShippingStreet) {
        accountShippingStreetFld.clear();
        accountShippingStreetFld.sendKeys(accountShippingStreet);
        return this;
    }

    public AccountForm setAccountShippingCityFld(String accountShippingCity) {
        accountShippingCityFld.clear();
        accountShippingCityFld.sendKeys(accountShippingCity);
        return this;
    }

    public AccountForm setAccountShippingStateFld(String accountShippingState) {
        accountShippingStateFld.clear();
        accountShippingStateFld.sendKeys(accountShippingState);
        return this;
    }

    public AccountForm setAccountShippingZipFld(String accountShippingZip) {
        accountShippingZipFld.clear();
        accountShippingZipFld.sendKeys(accountShippingZip);
        return this;
    }

    public AccountForm setAccountShippingCountryFld(String accountShippingCountry) {
        accountShippingCountryFld.clear();
        accountShippingCountryFld.sendKeys(accountShippingCountry);
        return this;
    }

    public AccountForm setAccountCustomerPriorityFld(String accountCustomerPriority) {
        accountCustomerPriorityFld.clear();
        accountCustomerPriorityFld.sendKeys(accountCustomerPriority);
        return this;
    }

    public AccountForm setAccountSLAExpirationDateFld(String accountSLAExpirationDate) {
        accountSLAExpirationDateFld.clear();
        accountSLAExpirationDateFld.sendKeys(accountSLAExpirationDate);
        return this;
    }

    public AccountForm setAccountNumberLocationsFld(String accountNumberLocations) {
        accountNumberLocationsFld.clear();
        accountNumberLocationsFld.sendKeys(accountNumberLocations);
        return this;
    }

    public AccountForm setAccountActiveFld() {
        accountActiveFld.clear();
        accountActiveFld.click();
        return this;
    }

    public AccountForm setAccountSLAFld(String accountSLA) {
        accountSLAFld.clear();
        accountSLAFld.sendKeys(accountSLA);
        return this;
    }

    public AccountForm setAccountSLASerialNumberFld(String accountSLASerialNumber) {
        accountSLASerialNumberFld.clear();
        accountSLASerialNumberFld.sendKeys(accountSLASerialNumber);
        return this;
    }

    public AccountForm setAccountUpsellOpportunityFld(String accountUpsellOpportunity) {
        accountUpsellOpportunityFld.clear();
        accountUpsellOpportunityFld.sendKeys(accountUpsellOpportunity);
        return this;
    }

    public AccountForm setAccountDescriptionFld(String accountDescription) {
        accountDescriptionFld.clear();
        accountDescriptionFld.sendKeys(accountDescription);
        return this;
    }


}
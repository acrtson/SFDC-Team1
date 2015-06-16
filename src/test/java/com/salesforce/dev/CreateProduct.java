package com.salesforce.dev;

import com.salesforce.dev.framework.Environment;
import com.salesforce.dev.pages.Base.NavigationBar;
import com.salesforce.dev.pages.Chatter.ChatterHome;
import com.salesforce.dev.pages.Home.HomePage;
import com.salesforce.dev.pages.MainPage;
import com.salesforce.dev.pages.Product.ProductDetails;
import com.salesforce.dev.pages.Product.ProductForm;
import com.salesforce.dev.pages.Product.ProductsHome;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.salesforce.dev.pages.Product.ProductBuilder;
/**
 * Created by Monica Pardo on 6/13/2015.
 *
 */
public class CreateProduct {

    String productName="New product";
    String prodCode="Codigo1";
    String prodDesc="this is a new product";

    HomePage homePage;
    MainPage mainPage;
    NavigationBar navigationBar;
    private ProductsHome productsHome;
    private ProductForm productForm;
    private ProductDetails productDetails;

    @BeforeMethod
    public void setUp(){
        homePage = new HomePage();
        String userNameValue= Environment.getInstance().getPrimaryUser();
        String passwordValue=Environment.getInstance().getPrimaryPassword();
        mainPage = homePage.loginAs(userNameValue, passwordValue);
        navigationBar = mainPage.gotoNavBar();

    }
    @Test
    public void CreatePostAndComment(){

        productsHome=navigationBar.clickProductTab();
        productForm=productsHome.clickNewBtn();
        productForm= new ProductBuilder(productName)
                .setProductName(productName)
                .setProductCode(prodCode)
                .setProductDesc(prodDesc)
                .setProductActive(true).build();
        productDetails=productForm.saveProduct();
        Assert.assertTrue(productDetails.VerifyProduct(productName), "product Was not Created");



    }

    @AfterMethod
    public void tearDown(){
        productDetails.DeleteProduct();
    }

}

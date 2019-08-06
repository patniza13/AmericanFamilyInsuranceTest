package com.amfam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage (WebDriver driver) {
        super(driver);

    }

    @FindBy(css = "#sq-zip-5c51e40c-82b8-4192-9a10-4dd12b7752e0")
    private WebElement zipField;

    @FindBy(css = "#sq-product-5c51e40c-82b8-4192-9a10-4dd12b7752e0")
    private WebElement productField;

    @FindBy(css = "[type=\"submit\"]")
    private List<WebElement> startQuoteButton;


    public void inputZip(String zip) {
        zipField.sendKeys( zip );
    }

    public void inputProduct(String product) {
        productField.sendKeys( product );
    }

    public GetQuotePage clickStartQuoteButton() {
        startQuoteButton.get( 2 ).click();
        return new GetQuotePage();
    }


}

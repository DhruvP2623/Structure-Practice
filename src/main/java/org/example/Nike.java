package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Nike extends Utils {

    String regMsg = "https://demo.nopcommerce.com/search?q=Nike";

    public void nikeProducts() {
        Assert.assertEquals(regMsg, "https://demo.nopcommerce.com/search?q=Nike");
        List<WebElement> productList = driver.findElements(By.xpath("//h2[@class=\"product-title\"]"));
        for (WebElement element : productList) {
            System.out.println(element.getText());

        }
    }
}

package page_object;

import base.SampleWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends SampleWebDriver {
    @FindBy(how = How.ID, using = "search_query_top")
    WebElement searchBox;

    @FindBy(how = How.CLASS_NAME, using = "Product-count")
    WebElement productcount;


    public void search () {
        searchBox.sendKeys("women");
        searchBox.click();
    }




    public void searchTest(){
        driver.findElement(By.id("search_query_top")).sendKeys("women");
        driver.findElement(By.name("submit_search")).click();

    }
    public void contactusTest(){
        driver.findElement(By.linkText("Contact us")).click();
        driver.findElement(By.id("email")).sendKeys("ahadsheraz96@.com");
        driver.findElement(By.xpath("//input[@id='id_order']")).sendKeys("123456789");
        // driver.findElement(By.xpath("//button[@id='submitMessage']")).click();
    }
    public void addingToCartTest(){
        driver.findElement(By.linkText("Women")).click();
        driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']")).click();
        //driver.findElement(By.xpath("//span[@class='continue btn btn-default button exclusive-medium']")).click();

    }
    public void viewCartTest(){
        driver.findElement(By.xpath("//b")).click();
        driver.findElement(By.id("newsletter-input")).sendKeys("ahad123");
    }
    public void bestSellingTest(){
        driver.findElement(By.linkText("Best sellers" )).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[2]")).click();
        //driver.findElement(By.xpath("//div[@class='quick-view-wrapper-mobile']")).click();
        //driver.findElement(By.linkText("Add to cart")).click();
    }






}
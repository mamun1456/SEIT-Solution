package solution_mamun;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;


import com.gargoylesoftware.htmlunit.ElementNotFoundException;

public class BasePage {
	
		private  WebElement webAction(final By locator) {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(DriverWrapper.getDriver()).withTimeout(15, TimeUnit.SECONDS)
					.pollingEvery(1, TimeUnit.SECONDS)
					.ignoring(java.util.NoSuchElementException.class)
					.ignoring(StaleElementReferenceException.class)
					.ignoring(ElementNotFoundException.class)
					.withMessage(
							"Webdriver waited for 15 seconds but still could not find the element therefore Timeout Exception has been thrown ");
			WebElement element = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					return driver.findElement(locator);
				}
			});
			return element;
		}

		public void clickOn(By locator) {
			try {
				webAction(locator).click();
			} catch (NoSuchElementException e) {
				Assert.fail("Element is not found with this locator: " + locator.toString());
				e.printStackTrace();
			}
		}
	}


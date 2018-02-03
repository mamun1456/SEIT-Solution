package solution_mamun;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Food extends BasePage{
	public static void findFood(){
	       Map<WebElement,WebElement> listOfFoods = (Map<WebElement, WebElement>) 
	    		   DriverWrapper.getDriver().findElements(By.xpath("//div[@class='itemContent']/span"));
	       for (Map.Entry<WebElement,WebElement> entry : listOfFoods.entrySet()){
	          if(entry.getKey().getText().equalsIgnoreCase("Applesauce")||entry.getKey().getText().equalsIgnoreCase("Juice")){
	              HashMap<String,String>selectedFoods= new HashMap<String,String>();
	              selectedFoods.put(entry.getKey().getText(),entry.getValue().getText());
	              System.out.println(selectedFoods);
	          }
	           
	       }

	   }

	}

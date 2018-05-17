package landingPages;

import org.openqa.selenium.By;
import solution_mamun.BasePage;


public class WeightWatchers extends BasePage{
	private By findMeeting= By.id("ela-menu-visitor-desktop-supplementa_find-a-meeting");
	private By zipCode= By.id("meetingSearch");
	private By firstLink = By.xpath("//*[@id=\"ml-1180510\"]/result-location/div/div[1]/a/location-address/div/div/div[1]/div[1]/span");
	
	public void clickOnFindMeeting() {
		clickOn(findMeeting);
	}
	 
	public void enterZipCode(String text) {
		 sendText(zipCode, text);
	 }
	 
	public void clickOnFirstLink() {
			clickOn(firstLink);
		}
}

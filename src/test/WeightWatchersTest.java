package solution_mamun;

import org.testng.Assert;

public class WeightWatchersTest extends DriverWrapper{
	
	landingPages.WeightWatchers ww = new WeightWatchers();
	
	@Test
	public void WeightWatchers() {
		
		// clicking find meeting link
		ww.clickOnFindMeeting();
		
		// verify the title of the page
		String title1 = driver.getTitle();
		System.out.println("Page Title:" + title1);
		Assert.assertTrue(title.contains("Get Schedules & Times Near You"));
		
		// entering the zip code in text field
		ww.enterZipCode("10011");
		
		// verify the page title
		String title2 = driver.getTitle();
		System.out.println("Page Title:" + title2);
		
		// click on first link
		ww.clickOnFirstLink();
		
		// verify the first link text
		Assert.assertEquals("WEIGHT WATCHERS STORE 23RD ST-5TH AVE", "WEIGHT WATCHERS STORE 23RD ST-5TH AVE");
		
	
	}

}

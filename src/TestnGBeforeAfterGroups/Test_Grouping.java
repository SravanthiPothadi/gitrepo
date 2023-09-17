package TestnGBeforeAfterGroups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Test_Grouping {
  @BeforeGroups("security")
  public void setupsecurity() {
	  System.out.println("setupsecurity()");
  }
  @AfterGroups("security")
  public void teardownsecurity() {
	  System.out.println("teardownsecurity()");
}
  @BeforeGroups("ui")
  public void setupUI() {
	  System.out.println("setupUI()");
  }
  @AfterGroups("ui")
  public void teardownUI() {
	  System.out.println("teardownUI()");
}
  @BeforeGroups("db")
  public void setupDB() {
	  System.out.println("setupDB()");
  }
  @AfterGroups("db")
  public void teardownDB() {
	  System.out.println("teardownDB() ");
}
  
  //Security related Real Test Cases
  @Test	(groups="security")
  public void accessAdminPage() {
	  System.out.println("accessAdminPage()");
  }
  @Test	(groups="security")
  public void accesscCampaignsPage() {
	  System.out.println("accesscCampaignsPage()");
  }
  @Test	(groups="security")
  public void accessHOOPage() {
	  System.out.println("accessHOOPage()");
  }
  
//UI related Real Test Cases
  @Test	(groups="ui")
  public void OpenFileDialog() {
	  System.out.println(" OpenFileDialog())");
  }
	 @Test	(groups="ui")
	  public void OpenConfirmationDialog() {
		  System.out.println(" OpenConfirmationDialog() ");
	 }
	 @Test	(groups="ui")
		  public void OpenSlotsPage() {
			  System.out.println(" OpenSlotsPage()");
	 }
		  
//DB related Real Test Cases
  @Test	(groups="db")
  public void testInsert() {
	  System.out.println("testInsert() ");
  }
  @Test	(groups="db")
  public void testDelete() {
	  System.out.println("testDelete() ");
  }
  @Test	(groups="db")
  public void testUpdate() {
	  System.out.println("testUpdate()");
  }
  }
  
  
  
  
  


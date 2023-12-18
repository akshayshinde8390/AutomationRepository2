package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TasksPage 
{
	//store all the webelements of task page
	
	@FindBy(partialLinkText = "Projects & Customers")
	private WebElement Project_Customers_Sub_Module;
	@FindBy(xpath = "//input[@value='Create New Customer']")
	private WebElement Create_New_Customer_Button;
	@FindBy(xpath = "//input[@value='Create New Project']")
	private WebElement Create_new_Project_Button;
	
	@FindBy(name = "name")
	private WebElement Customer_Name_TB;
	

}

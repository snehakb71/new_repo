package pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	@CacheLookup
	WebElement username;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.ID,using="submitbutton")
	@CacheLookup
	WebElement login;
	
	@FindBy(id="pixflex-menu-arrow")
	@CacheLookup
	WebElement jobs;
	
	@FindBy(id="versa_active")
	@CacheLookup
	WebElement pixfix_versa;
	
	@FindBy(xpath="//a[@data-original-title='Add Job']")
	@CacheLookup
	WebElement new_j;
	
	@FindBy(id="job_name")
	@CacheLookup
	WebElement job_nam;
	
	
	@FindBy(id="versa_src_udp")
	@CacheLookup
	WebElement udp1c;
	
	
	@FindBy(id="gstaf_src_udp_ip")
	@CacheLookup
	WebElement udp_source1;
	
	@FindBy(id="gstaf_src_udp_port")
	@CacheLookup
	WebElement udp_port1;
	
	@FindBy(id="gstaf_src_udp_interface")
	@CacheLookup
	WebElement udp_inter;
	
	@FindBy(id="add_pfmt_input")
	@CacheLookup
	WebElement add_udp;
	
	
	public void loginpix(String usr, String pss) throws Exception
	{
		username.sendKeys(usr);
		password.sendKeys(pss);
		login.click();
		
		//Thread.sleep(1000);
		//jobs.click();
		
		//Thread.sleep(1000);
		//pixfix_versa.click();
	}
	
	public void job_type( ) throws InterruptedException
	{
        jobs.click();
		Thread.sleep(1000);
		pixfix_versa.click();
		Thread.sleep(1000);
		new_j.click();
		
	
	}
	
	public void versa_udp_job(String job_name, String addr, String port, String inter)
	{
		job_nam.sendKeys(job_name);
		udp1c.click();
		udp_source1.clear();
		udp_source1.sendKeys(addr);
		
		udp_port1.sendKeys(port);
		udp_inter.click();
		udp_inter.sendKeys(inter);
		
		add_udp.click();
	}
	

}

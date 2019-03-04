package pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class XportOutput {
	
	WebDriver driver;

	public XportOutput(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* ****************** XPORT UDP OUTPUT **************************** */

	@FindBy(xpath = "//*[@id=\"sink_type_list\"]/div[2]/div[1]/div/a")
	@CacheLookup
	WebElement udpOut;
	
	@FindBy(id = "udp_o_sink_multi_addr")
	@CacheLookup
	WebElement udpOut_ip;
	
	@FindBy(id = "udp_o_sink_port")
	@CacheLookup
	WebElement udpOut_port;
	
	/* ****************** RATE CONTROL(CBR/VBR) **************************** */
	
	@FindBy(id = "ts_rc_mode")
	@CacheLookup
	WebElement rateControl;
	
	/* ****************** XPORT RTP OUTPUT **************************** */
	
	@FindBy(id = "gstaf_format_packetizer")
	WebElement packetizer;
	
	/* ****************** XPORT SRT OUTPUT **************************** */

	@FindBy(xpath = "//a[@onclick=\"set_sink_type('SRT');\"]")
	WebElement srtOut;
	
	@FindBy(id = "srt_o_sink_srt_server")
	WebElement srtOut_push;

	@FindBy(id = "srt_o_sink_multi_addr")
	WebElement srtOut_ip;

	@FindBy(id = "srt_o_sink_port")
	WebElement srtOut_port;
	
/**************************************************************************************************************/
	

	/* ****************** UDP OUTPUT **************************** */
	
	public void udpOutput(String ip, String port) throws Exception {
		
		udpOut.click();
		Thread.sleep(500);
		
		udpOut_ip.clear();
		udpOut_ip.sendKeys(ip);
		udpOut_port.clear();
		udpOut_port.sendKeys(port);
		
		new Select(rateControl).selectByVisibleText("CBR Auto");
	}
	
    /* ****************** RTP OUTPUT **************************** */
	
	public void rtpOutput(String ip, String port) throws Exception {
		
		udpOutput(ip, port);
		new Select(packetizer).selectByVisibleText("RTP");
	}
	
/* ****************** UDP OUTPUT **************************** */
	
	public void srtOutput(String port) throws Exception {
		
		srtOut.click();
		Thread.sleep(500);
		
		srtOut_push.click();
		
		srtOut_port.clear();
		srtOut_port.sendKeys(port);
		
		new Select(rateControl).selectByVisibleText("CBR Auto");
	}

}

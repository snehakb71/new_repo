package utilitySmoke;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FlexInputDataProvider {
	
Properties pro;
	
	public FlexInputDataProvider() throws Exception
	{
		File src = new File("./ConfigurationSmoke/Flex.properties");		
		FileInputStream fis = new FileInputStream(src);	
		pro = new Properties();		
		pro.load(fis);
	}
	
	
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	public String getUrl()
	{
		return pro.getProperty("ServerURL");
	}
	
	public String UsernamePixfix()
	{
		return pro.getProperty("Username");
	}
	
	public String PasswordPixfix()
	{
		return pro.getProperty("Password");
	}
	
	public String UdpInputIP()
	{
		return pro.getProperty("UdpInputIPAddress");
	}
	
	public String RTPIP()
	{
		return pro.getProperty("RtpInputIPAddress");
	}
	
	public String InputRtmpurl()
	{
		return pro.getProperty("RtmpInputURL");
	}
	
	public String UdpInputInterface()
	{
		return pro.getProperty("InputInterface");
	}
	
	public String IPLocal()
	{
		return pro.getProperty("LoacalIPAddress");
	}
		
	public String OutputRtmpURL()
	{
		return pro.getProperty("RtmpOutputURL");
	}
	
	public String UdpInputPort()
	{
		return pro.getProperty("UdpInputPort");
	}
	
	
	public String UdpInputIPUnicast()
	{
		return pro.getProperty("UnicastIP");
	}
	
	
	
}

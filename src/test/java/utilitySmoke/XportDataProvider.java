package utilitySmoke;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class XportDataProvider {
	
	Properties pro;
	
	public XportDataProvider() throws Exception {
		
		File src= new File("./ConfigurationSmoke/Xport.properties");
		FileInputStream fis = new FileInputStream(src);		
		pro = new Properties();		
		pro.load(fis);
	}
	
	public String browser()
	{
		return pro.getProperty("browser");
	}
	
	public String serverURL()
	{
		return pro.getProperty("serverURL");
	}
	
	public String serverIP()
	{
		return pro.getProperty("serverIP");
	}
	
	public String userName()
	{
		return pro.getProperty("userName");
	}
	
	public String passWord()
	{
		return pro.getProperty("passWord");
	}
	
	public String systemIP()
	{
		return pro.getProperty("systemIP");
	}
	
	public String networkInterfaceDhcp()
	{
		return pro.getProperty("networkInterfaceDhcp");
	}
	
	public String networkInterfaceStatic()
	{
		return pro.getProperty("networkInterfaceStatic");
	}
	
	public String udpInputIPaddress()
	{
		return pro.getProperty("udpInputIPaddress");
	}
	
	public String udpPort()
	{
		return pro.getProperty("udpPort");
	}
	
	public String magewellVideoDevice()
	{
		return pro.getProperty("magewellVideoDevice");
	}
	
	public String magewellAudioDevice()
	{
		return pro.getProperty("magewellAudioDevice");
	}
	
	public String bmdVideoDevice()
	{
		return pro.getProperty("bmdVideoDevice");
	}
	
	public String bmdAudioDevice()
	{
		return pro.getProperty("bmdAudioDevice");
	}
	
	public String magewellVideoInterface()
	{
		return pro.getProperty("magewellVideoInterface");
	}
	
	public String bmdVideoInterface()
	{
		return pro.getProperty("bmdVideoInterface");
	}

}

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
		return pro.getProperty("sr201Url");
	}
	
	public String user_name()
	{
		return pro.getProperty("username");
	}
	
	public String password()
	{
		return pro.getProperty("password");
	}
	
	public String udp_job_name()
	{
		return pro.getProperty("udp_job_name");
	}
	
	public String udp_switcher_jobName()
	{
		return pro.getProperty("switcher_udp_job");
	}
	
	public String rtmp_job_name()
	{
		return pro.getProperty("rtmp_job_name");
	}
	
	public String rtmp_swither_jobName()
	{
		return pro.getProperty("rtmp_switcher_job");
	}
	
	public String file_job_name()
	{
		return pro.getProperty("file_job_name");
	}
	
	public String file_switcher_jobName()
	{
		return pro.getProperty("file_switcher_job");
	}
	
	public String srt_job_name()
	{
		return pro.getProperty("srt_job_name");
	}
	
	public String rtsp_job_name()
	{
		return pro.getProperty("rtsp_job_name");
	}
	
	public String udp1_input_ip1_multicast()
	{
		return pro.getProperty("udp1_ip");
	}
	
	public String udp1_input_ip2_multicast()
	{
		return pro.getProperty("udp2_ip");
	}
	
	public String udp1_input_ip2_unicast()
	{
		return pro.getProperty("udp_unicast");
	}
	
	public String udp1_input_unicast_port1()
	{
		return pro.getProperty("udp_unicastPort1");
	}
	
	public String udp1_input_unicast_port2()
	{
		return pro.getProperty("udp_unicastport2");
	}
	
	public String udp1_input_unicast_port3()
	{
		return pro.getProperty("udp_unicastport3");
	}

}

package utilitySmoke;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ProfileDataProviderSmoke {

Properties profile_pro;
	
	public ProfileDataProviderSmoke() throws Exception
	{
		File src = new File("./ConfigurationSmoke/Profilesmoke.properties");
		FileInputStream fis = new FileInputStream(src);
		profile_pro = new Properties();
		
		profile_pro.load(fis);
	}
	
	public String profile_pal_360()
	{
		return profile_pro.getProperty("profile_pal_360");
	}
	
	public String profile_ntsc_224()
	{
		return profile_pro.getProperty("profile_ntsc_224");
	}
	
	public String profile_hd_424()
	{
		return profile_pro.getProperty("profile_hd_424");
	}
	
	public String profile_HD_1920()
	{
		return profile_pro.getProperty("profile_HD_1920");
	}
	
	public String profile_HD_1280()
	{
		return profile_pro.getProperty("profile_HD_1280");
	}
	
	public String profile_hd_854()
	{
		return profile_pro.getProperty("profile_hd_854");
	}
	
	public String profile_hd_640()
	{
		return profile_pro.getProperty("profile_hd_640");
	}
	
	public String profile_hd_256()
	{
		return profile_pro.getProperty("profile_hd_256");
	}
	
	public String profile_pal_720()
	{
		return profile_pro.getProperty("profile_pal_720");
	}
	
	public String profile_pal_544()
	{
		return profile_pro.getProperty("profile_pal_544");
	}
	
	public String profile_pal_224()
	{
		return profile_pro.getProperty("profile_pal_224");
	}
	
	public String profile_NTSC_720()
	{
		return profile_pro.getProperty("profile_NTSC_720");
	}
	
	public String profile_NTSC_544()
	{
		return profile_pro.getProperty("profile_NTSC_544");
	}
	
	public String profile_NTSC_360()
	{
		return profile_pro.getProperty("profile_NTSC_360");
	}
	
	
	///////////////Bcast Profiles
	public String profile_Bcast_1920()
	{
		return profile_pro.getProperty("profile_Bcast_1920");
	}
	
	public String profile_Bcast_NTSC()
	{
		return profile_pro.getProperty("profile_Bcast_NTSC");
	}
	
	public String profile_Bcast_PAL()
	{
		return profile_pro.getProperty("profile_Bcast_PAL");
	}
	
	public String profile_P2P_1920()
	{
		return profile_pro.getProperty("profile_P2P_1920");
	}
	
	public String profile_P2P_NTSC()
	{
		return profile_pro.getProperty("profile_P2P_NTSC");
	}
	
	public String profile_P2P_PAL()
	{
		return profile_pro.getProperty("profile_P2P_PAL");
	}
}

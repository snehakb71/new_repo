package utilitySmoke;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class OverlaysDataProvider {
	

	Properties Preset;

	public OverlaysDataProvider() throws Exception {
		File src = new File("./ConfigurationSmoke/Flex.properties");
		FileInputStream fis = new FileInputStream(src);
		Preset = new Properties();
		Preset.load(fis);
	}

	public String PROFILE_PAL_720() {
		return Preset.getProperty("PROFILE_PAL_720");
	}

	public String PROFILE_PAL_544() {
		return Preset.getProperty("PROFILE_PAL_544");
	}

	public String PROFILE_PAL_360() {
		return Preset.getProperty("PROFILE_PAL_360");
	}

	public String PROFILE_PAL_224() {
		return Preset.getProperty("PROFILE_PAL_224");
	}

	public String PROFILE_NTSC_720() {
		return Preset.getProperty("PROFILE_NTSC_720");
	}

	public String PROFILE_NTSC_544() {
		return Preset.getProperty("PROFILE_NTSC_544");
	}

	public String PROFILE_NTSC_360() {
		return Preset.getProperty("PROFILE_NTSC_360");
	}

	public String PROFILE_NTSC_224() {
		return Preset.getProperty("PROFILE_NTSC_224");
	}

	public String PROFILE_HD_1080() {
		return Preset.getProperty("PROFILE_HD_1080");
	}

	public String PROFILE_HD_720() {
		return Preset.getProperty("PROFILE_HD_720");
	}

	public String PROFILE_HD_480() {
		return Preset.getProperty("PROFILE_HD_480");
	}

	public String PROFILE_HD_360() {
		return Preset.getProperty("PROFILE_HD_360");
	}

	public String PROFILE_HD_240() {
		return Preset.getProperty("PROFILE_HD_240");
	}

	public String PROFILE_HD_144() {
		return Preset.getProperty("PROFILE_HD_144");
	}

	public String PROFILE_P2P_1080() {
		return Preset.getProperty("PROFILE_P2P_1080");
	}

	public String PROFILE_P2P_PAL() {
		return Preset.getProperty("PROFILE_P2P_PAL");
	}

	public String PROFILE_P2P_NTSC() {
		return Preset.getProperty("PROFILE_P2P_NTSC");
	}

	public String PROFILE_BCAST_1080() {
		return Preset.getProperty("PROFILE_BCAST_1080");
	}

	public String PROFILE_BCAST_PAL() {
		return Preset.getProperty("PROFILE_BCAST_PAL");
	}

	public String PROFILE_BCAST_NTSC() {
		return Preset.getProperty("PROFILE_BCAST_NTSC");
	}
	
     /*	********************** BITRATES *********************  */
	
	public String BITRATE_PAL_720() {
		return Preset.getProperty("OTT_PAL_720x576");
	}

	public String BITRATE_PAL_544() {
		return Preset.getProperty("OTT_PAL_544x432");
	}

	public String BITRATE_PAL_360() {
		return Preset.getProperty("OTT_PAL_360x288");
	}

	public String BITRATE_PAL_224() {
		return Preset.getProperty("OTT_PAL_224x176");
	}

	public String BITRATE_NTSC_720() {
		return Preset.getProperty("OTT_NTSC_720x480");
	}

	public String BITRATE_NTSC_544() {
		return Preset.getProperty("OTT_NTSC_544x360");
	}

	public String BITRATE_NTSC_360() {
		return Preset.getProperty("OTT_NTSC_360x240");
	}

	public String BITRATE_NTSC_224() {
		return Preset.getProperty("OTT_NTSC_224x144");
	}

	public String BITRATE_HD_1080() {
		return Preset.getProperty("OTT_HD_1920x1080");
	}

	public String BITRATE_HD_720() {
		return Preset.getProperty("OTT_HD_1280x720");
	}

	public String BITRATE_HD_480() {
		return Preset.getProperty("OTT_HD_854x480");
	}

	public String BITRATE_HD_360() {
		return Preset.getProperty("OTT_HD_640x360");
	}

	public String BITRATE_HD_240() {
		return Preset.getProperty("OTT_HD_424x240");
	}

	public String BITRATE_HD_144() {
		return Preset.getProperty("OTT_HD_256x144");
	}

	public String BITRATE_P2P_1080() {
		return Preset.getProperty("P2P_1920x1080");
	}

	public String BITRATE_P2P_PAL() {
		return Preset.getProperty("P2P_PAL");
	}

	public String BITRATE_P2P_NTSC() {
		return Preset.getProperty("P2P_NTSC");
	}

	public String BITRATE_BCAST_1080() {
		return Preset.getProperty("Bcast_1920x1080");
	}

	public String BITRATE_BCAST_PAL() {
		return Preset.getProperty("Bcast_PAL");
	}

	public String BITRATE_BCAST_NTSC() {
		return Preset.getProperty("Bcast_NTSC");
	}

}

package utilitySmoke;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class OutputDataProviderSmoke {

Properties output_pro;
	
	public OutputDataProviderSmoke() throws Exception
	{
		File src = new File("./ConfigurationSmoke/outputSmoke.properties");
		
		FileInputStream fis = new FileInputStream(src);
		
		output_pro = new Properties();
		
		output_pro.load(fis);
	}
	
	public String cluster_name()
	{
		return output_pro.getProperty("udp_cluster");
	}
	public String udp_out_ip()
	{
		return output_pro.getProperty("udp_out1_address");
	}
	
	public String udp_outUnicast_serverIp()
	{
		return output_pro.getProperty("udp_unicast_server_ip");
	}
	
	public String udp_out_profile1_port()
	{
		return output_pro.getProperty("udp_port1");
	}
	
	public String udp_out_profile2_port()
	{
		return output_pro.getProperty("udp_port2");
	}
	
	public String udp_out_profile3_port()
	{
		return output_pro.getProperty("udp_port3");
	}

	public String CbrAuto_mode()
	{
		return output_pro.getProperty("RateContrallerCBRAuto");
	}
	
	public String Cbr_mode()
	{
		return output_pro.getProperty("RateContrallerCBR");
	}
	
	public String track_1_out()
	{
		return output_pro.getProperty("output_track1");
	}
	
	public String track_2_out()
	{
		return output_pro.getProperty("output_track2");
	}
	
	public String metaTrack()
	{
		return output_pro.getProperty("MetaTrack");
	}
	
	public String pactizer()
	{
		return output_pro.getProperty("output_pacatizer");
	}
	
	public String cueToneMode()
	{
		return output_pro.getProperty("cueToneMode");
	}
	
	
	public String compli_PtsBasePcr()
	{
		return output_pro.getProperty("compli_PtsBasePcr");
	}
	
	public String rtmp_cluster_name()
	{
		return output_pro.getProperty("rtmp_cluster");
	}
	
	public String rtmp_server_url()
	{
		return output_pro.getProperty("rtmp_out_url");
	}

	public String rtmp_stream_name1()
	{
		return output_pro.getProperty("rtmp_stream_name1");
	}
	
	public String rtmp_stream_name2()
	{
		return output_pro.getProperty("rtmp_stream_name2");
	}
	
	public String rtmp_stream_name3()
	{
		return output_pro.getProperty("rtmp_stream_name3");
	}
	
	
	
	////////////  ////////////////   mp4 output
	
	
	
	
	
	public String mp4_cluster_name()
	{
		return output_pro.getProperty("mp4_cluster");
	}
	
	public String file_path_1_profile()
	{
		return output_pro.getProperty("FilePath_profile_1");
	}
	
	public String file_path_2_profile()
	{
		return output_pro.getProperty("FilePath_profile_2");
	}
	
	public String file_path_3_profile()
	{
		return output_pro.getProperty("FilePath_profile_3");
	}
	
	public String movmuxer()
	{
		return output_pro.getProperty("movMuxer");
	}
	
	public String mkvMuxer()
	{
		return output_pro.getProperty("mkvMuxer");
	}
	
	public String flvMuxer()
	{
		return output_pro.getProperty("flvMuxer");
	}
	
	public String Tsmuxer()
	{
		return output_pro.getProperty("Tsmuxer");
	}
	
	public String UserDefinedSlicing()
	{
		return output_pro.getProperty("UserDefined");
	}
	
	
	
	
///////////////////////////////////// ************ Raw output
	
	
	public String rawVideoDevice()
	{
		return output_pro.getProperty("rawVideoDevice");
	}
	
	public String rawAudioDevice()
	{
		return output_pro.getProperty("rawAudioDevice");
	}
	
	public String ScteLineNum()
	{
		return output_pro.getProperty("ScteLineNum");
	}
///////////////////////////////////// ************ NDi output

	public String ndivideoSource1()
	{
		return output_pro.getProperty("ndivideoSource1");
	}
	
	public String ndiAudioSource1()
	{
		return output_pro.getProperty("ndiAudioSource1");
	}
	
	public String ndivideoSource2()
	{
		return output_pro.getProperty("ndivideoSource2");
	}
	
	public String ndiAudioSource2()
	{
		return output_pro.getProperty("ndiAudioSource2");
	}
	///////////////////////////////////// *********** streamer
	
	public String streamer_name()
	{
		return output_pro.getProperty("streamer_name");
	}
	
	public String hls_streamer_pro()
	{
		return output_pro.getProperty("streamer_pro_hls");
	}
	
	public String dash_streamer_pro()
	{
		return output_pro.getProperty("streamer_pro_dash");
	}
	
	public String mss_streamer_pro()
	{
		return output_pro.getProperty("streamer_pro_mss");
	}
}

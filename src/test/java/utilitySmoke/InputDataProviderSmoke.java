package utilitySmoke;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class InputDataProviderSmoke {

	Properties pro;

	public InputDataProviderSmoke() throws Exception {
		File src = new File("./ConfigurationSmoke/inputSmoke.properties");

		FileInputStream fis = new FileInputStream(src);

		pro = new Properties();

		pro.load(fis);
	}

	public String getBrowser() {
		return pro.getProperty("Browser");
	}

	public String getUrl() {
		return pro.getProperty("sr201Url");
	}

	public String user_name() {
		return pro.getProperty("username");
	}

	public String password() {
		return pro.getProperty("password");
	}

	public String udp_job_name() {
		return pro.getProperty("udp_job_name");
	}

	public String udp_switcher_jobName() {
		return pro.getProperty("switcher_udp_job");
	}

	public String rtmp_job_name() {
		return pro.getProperty("rtmp_job_name");
	}

	public String rtmp_swither_jobName() {
		return pro.getProperty("rtmp_switcher_job");
	}

	public String file_job_name() {
		return pro.getProperty("file_job_name");
	}

	public String file_switcher_jobName() {
		return pro.getProperty("file_switcher_job");
	}

	public String srt_job_name() {
		return pro.getProperty("srt_job_name");
	}

	public String rtsp_job_name() {
		return pro.getProperty("rtsp_job_name");
	}

	public String udp1_input_ip1_multicast() {
		return pro.getProperty("udp1_ip");
	}

	public String udp1_input_ip2_multicast() {
		return pro.getProperty("udp2_ip");
	}

	public String udp1_input_ip2_unicast() {
		return pro.getProperty("udp_unicast");
	}

	public String udp1_input_unicast_port1() {
		return pro.getProperty("udp_unicastPort1");
	}

	public String udp1_input_unicast_port2() {
		return pro.getProperty("udp_unicastport2");
	}

	public String udp1_input_unicast_port3() {
		return pro.getProperty("udp_unicastport3");
	}

	public String udp_port() {
		return pro.getProperty("udp_port");
	}

	public String rtp_multicast_input() {
		return pro.getProperty("rtp_multicast");
	}

	public String udp_interface() {
		return pro.getProperty("udp_interface");
	}

	public String depacketizer() {
		return pro.getProperty("depacketizer");
	}

	//////////////////// ************************************ scte track
	
	
	public String Metadata() {
		return pro.getProperty("metadataTrack");
	}

	public String cuetone() {
		return pro.getProperty("metatypescte");
	}

	public String perodic() {
		return pro.getProperty("cuetonesourcePerodic");
	}

	public String scteApi() {
		return pro.getProperty("cuetonesourceAPI");
	}

	public String scteInband() {
		return pro.getProperty("cuetonesourceInband");
	}

	public String scteApiCueInCueOut() {
		return pro.getProperty("APIcutoneTypeOutIn");
	}

	public String scteApiCueOutDuration() {
		return pro.getProperty("APIcutoneTypeOutDuration");
	}
	
	public String scteNum() {
		return pro.getProperty("scteNum");
	}

	/////////////////////////////////////// ************** ********rtmp input
	public String rtmp_url() {
		return pro.getProperty("rtmp_server_url");
	}

	public String rtmp_stream_name() {
		return pro.getProperty("rtmp_streamer_name");
	}

	//////////////////////////////// ******************* ********mp4 input
	public String mp4_file_path() {
		return pro.getProperty("mp4_file_path");
	}

	/////////////////////////////// ******************* ********Ts input
	public String ts_filePath() {
		return pro.getProperty("ts_filePath");
	}

	public String SwitcherJobName() {
		return pro.getProperty("Switcher_jobName");
	}

	public String ImageFilePath() {
		return pro.getProperty("ImageFile");
	}
	
	
	public String demuxer() {
		return pro.getProperty("demuxer");
	}
	

	////////////////////////////// ******************* ******** Raw input
	public String rawVideoDevice() {
		return pro.getProperty("rawVideoDevice");
	}
	
	public String rawVideoDevice_2() {
		return pro.getProperty("rawVideoDevice_2");
	}

	public String rawVideoInterfaceSdi() {
		return pro.getProperty("rawVideoInterfaceSdi");
	}

	public String rawVideoInterfaceHdmi() {
		return pro.getProperty("rawVideoInterfaceHdmi");
	}

	public String rawAudiodevice() {
		return pro.getProperty("rawAudiodevice");
	}

	public String rawAudiodevice_2() {
		return pro.getProperty("rawAudiodevice_2");
	}
	public String rawMagewellVideoDevice() {
		return pro.getProperty("rawMagewellVideoDevice");
	}

	public String rawMagewellAudioDevice() {
		return pro.getProperty("rawMagewellAudioDevice");
	}

	
	///*************************************** ************* HTTP input
	
	
	public String HLS_http_input() {
		return pro.getProperty("HLS_http_input");
	}
	
	/////////////////////// ********************************NDI input///////

	public String NdiDevice() {
		return pro.getProperty("NdiDevice");
	}

	/////////////////////// ******************smoke Job names///////
	public String smokeVersaUdpMulticastUdpUnicast() {
		return pro.getProperty("smokeUdpMulticastUdpUnicastjob");
	}

	public String smokeUdpUnicastRtpUnicastjob() {
		return pro.getProperty("smokeVersaUdpUnicastRtpUnicast");
	}

	public String smokeVersaRtpUnicastUdpunicast() {
		return pro.getProperty("smokeRtpUnicastUdpunicastjob");
	}

	public String smokeVersaUdpMulticastRtmpoutjob() {
		return pro.getProperty("smokeUdpMulticastRtmpoutjob");
	}
	//

	public String SmokeVersaRTMPInUdpUbnicast() {
		return pro.getProperty("smokeRTMPInUdpUbnicastjob");
	}

	public String smokeVersaUdpunicastRTMP() {
		return pro.getProperty("smokeUdpunicastRTMPjob");
	}

	public String smokeVersaRtmpInputRTMPOutput() {
		return pro.getProperty("smokeRtmpInputRTMPOutputjob");
	}

	public String smokeVersaRtpMulticastMultipleOutput() {
		return pro.getProperty("smokeRtpMulticastMultipleOutputjob");
	}

	public String smokeVersaUdpMultiProfileWowzaStreamer() {
		return pro.getProperty("smokeUdpMultiProfileWowzaStreamerJob");
	}

	public String smokeVersaFileMultiProfileWowzaStreamer() {
		return pro.getProperty("smokeFileMultiProfileWowzaStreamerjob");
	}

	public String SmokeVersaTestInUdpOut() {
		return pro.getProperty("SmokeTestInUdpOutJob");
	}

	public String SmokeVersaFileTsMultipleFileOut() {
		return pro.getProperty("SmokeFileTsMultipleFileOutJob");
	}

	public String smokeVersa() {
		return pro.getProperty("smokeVersaJob");
	}

	public String smokeFlex() {
		return pro.getProperty("smokeFlexJob");
	}

	public String smokeXport() {
		return pro.getProperty("smokeXportJob");
	}

	public String smokeStatix() {
		return pro.getProperty("smokeStatixjob");
	}

}

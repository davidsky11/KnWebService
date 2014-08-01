package com.kn.whl.test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import net.sf.json.JSONObject;

public class KnMain {
	public String getName(String name){
		return "My name is " + name;
	}
	
	public static void main(String[] args){
		getServiceVersion();
	}
	
	public  static String getServiceVersion(){
		try {
			Properties versionProperties = new Properties();
			versionProperties.load(KnMain.class.getResourceAsStream("/version.properties"));
			String versionCode = versionProperties.get("versionCode").toString();
			String versionName = versionProperties.get("versionName").toString();
			JSONObject versionJSONObject = new JSONObject();
			versionJSONObject.put("versionCode", versionCode);
			versionJSONObject.put("versionName", versionName);
			System.out.println("version:"+versionJSONObject.toString());
			return versionJSONObject.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		/*try {
			FileInputStream jsonFileInputStream = new FileInputStream(VERSION_JSON_PATH);
			ByteArrayOutputStream jsonByteArrayOutputStream = new ByteArrayOutputStream(
					1024);
			byte[] buffer = new byte[1024];
			int len = 0;
			while((len=jsonFileInputStream.read(buffer))!=-1){
				jsonByteArrayOutputStream.write(buffer, 0, len);
			}
			JSONObject versionJSONObject = JSONObject.fromObject(new String(jsonByteArrayOutputStream.toByteArray()));
			System.out.println("version:"+versionJSONObject.toString());
			
			if(jsonFileInputStream!=null){
				jsonFileInputStream.close();
			}
			if(jsonByteArrayOutputStream!=null){
				jsonByteArrayOutputStream.close();
			}
			return versionJSONObject.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		return null;
	}
	
	public String getServiceTime(){
		String currentTime = null;
		Date currentDate = new Date();
		currentTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS").format(currentDate);
		return currentTime;
	}
	
}

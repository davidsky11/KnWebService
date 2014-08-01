package com.kn.whl.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.kn.whl.entity.Android;
import com.kn.whl.service.AndroidService;
import com.kn.whl.test.KnMain;
@WebService(serviceName="com.kn.whl.service.AndroidService")
@SOAPBinding(style=Style.RPC)
public class AndroidServiceImpl implements AndroidService {

	@Override
	public Android getAndroidVersion() {
		try {
			Properties versionProperties = new Properties();
			versionProperties.load(KnMain.class.getResourceAsStream("/version.properties"));
			String versionCode = versionProperties.get("versionCode").toString();
			String versionName = versionProperties.get("versionName").toString();
			Date   versionDate = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss").parse(versionProperties.get("versionDate").toString());
			Android android = new Android();
			android.setVersionCode(versionCode);
			android.setVersionName(versionName);
			android.setVersionDate(versionDate);
			
			/*JSONObject versionJSONObject = new JSONObject();
			versionJSONObject.put("versionCode", versionCode);
			versionJSONObject.put("versionName", versionName);*/
			System.out.println("version:"+android);
			return android;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}

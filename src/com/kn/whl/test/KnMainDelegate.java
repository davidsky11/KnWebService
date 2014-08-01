	package com.kn.whl.test;

	
@javax.jws.WebService(
targetNamespace = 
	"http://test.whl.kn.com/"
,
serviceName = 
	"SeuicMainService"
, 
portName =
	"SeuicMainPort"
	,wsdlLocation = "WEB-INF/wsdl/KnMainService.wsdl"
)



public class KnMainDelegate {

	com.kn.whl.test.KnMain knMain = new com.kn.whl.test.KnMain();

			public String getName(String name)  {		
			return knMain.getName(name);
		}
				public String getServiceVersion()  {		
			return knMain.getServiceVersion();
		}
				public String getServiceTime()  {		
			return knMain.getServiceTime();
		}
	
}
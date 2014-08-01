package com.kn.whl.test;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public final class ClientProxyFactory {
	private static final String HOST = "http://localhost:8080/KnService/services/";
	private static final String WSDL = "?wsdl";
	
	public static final JaxWsProxyFactoryBean instance(Class<?> serviceClass,String address){  
        //创建WebService客户端代理工厂      
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();     
        //注册WebService接口      
        factory.setServiceClass(serviceClass);     
        //设置WebService地址      
        factory.setAddress(HOST+address+WSDL); 
        return factory;
    }   
}

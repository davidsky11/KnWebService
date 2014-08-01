package com.kn.whl.test;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.kn.whl.web.services.IHelloServices;

public class HellowordClient {
	public  String save(String username, String password, String email, String birthday) throws Exception{  
        //创建WebService客户端代理工厂      
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();     
        //注册WebService接口      
        factory.setServiceClass(IHelloServices.class);     
        //设置WebService地址      
        factory.setAddress("http://localhost:8080/KnService/services/HelloServices?wsdl");          
        IHelloServices helloServices = (IHelloServices)factory.create();     
        System.out.println("invoke helloServices webservice...");  
        String hello = helloServices.sayHello("caiyasi");  
          
       System.out.println(hello);  
       
       helloServices.save(username, password, email, birthday);
       return username+password+email+birthday;
    }  
}

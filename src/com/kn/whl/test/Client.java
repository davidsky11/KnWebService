package com.kn.whl.test;  
  
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.kn.whl.web.services.IHelloServices;
  
public class Client {  
    public static void main(String[] args) {  
    	invoke();  
    }  
     
    /** 
     * 通过Spring测试webservices 
     */  
    public static void invokeBySpring(){  
    	//创建WebService客户端代理工厂      
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();     
        //注册WebService接口      
        factory.setServiceClass(IHelloServices.class);     
       //设置WebService地址      
        factory.setAddress("http://localhost:8080/helloServices");          
        IHelloServices iHelloWorld = (IHelloServices)factory.create();     
        System.out.println(iHelloWorld.sayHello("ximing"));
        System.exit(0);     
    }  
     
    public static void invoke(){  
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
    }  
}  
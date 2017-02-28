package com.avalk.cxf;

/**
 * Created by Abrams on 27.11.2016.
 */

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import javax.xml.ws.Endpoint;
import javax.xml.ws.soap.SOAPBinding;


@Configuration
@EnableAutoConfiguration
@ImportResource({"classpath:META-INF/cxf-servlet.xml"})
public class WebServiceConfig {
    @Autowired
    private ApplicationContext applicationContext;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Server ready...");
       // Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        SpringApplication.run(WebServiceConfig.class, args);
    }
    protected WebServiceConfig() throws Exception {
        System.out.println("Starting Server");

    }

    @Bean
    public Endpoint endpoint() {
        LocationWS implementor = new LocationWS();
        EndpointImpl ep = new EndpointImpl(springBus(), implementor);
        ep.publish("/location");
        return ep;
    }

    @Bean(name= Bus.DEFAULT_BUS_ID)
    public Bus springBus() {
        return new SpringBus();
    }
}

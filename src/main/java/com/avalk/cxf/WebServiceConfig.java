package com.avalk.cxf;

/**
 * Created by Abrams on 27.11.2016.
 */
import javax.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.avalk.cxf.LocationWS;

import java.util.Arrays;


@Configuration
public class WebServiceConfig {
    @Autowired
    private Bus bus;

    public static void main(String[] args) {
        SpringApplication.run(LocationWS.class, args);
    }

    @Bean
    public Server rsServer() {
        JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
        endpoint.setBus(bus);
        endpoint.setAddress("/");
        endpoint.setServiceBeans(Arrays.<Object>asList(new LocationWS()));
        return endpoint.create();
    }
}

package com.avalk.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by Abrams on 19.07.2016.
 */
@WebService(endpointInterface = "com.avalk.cxf.ILocationsWS",
        serviceName = "Locations", targetNamespace = "com.epam.aValk", portName = "8080")
@SOAPBinding(style = SOAPBinding.Style.RPC, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED, use = SOAPBinding.Use.LITERAL)
public class LocationWS implements ILocationsWS {

    @WebMethod(operationName = "EchoMessageTest")
    public String basicMessage(@WebParam(name = "message") String message) {
        String result = "";
        result = "testHello" + message;
        return result;
    }
}

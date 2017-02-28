package com.avalk.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * Created by Abrams on 19.07.2016.
 */
@javax.jws.WebService( endpointInterface = "com.avalk.cxf.ILocationsWS")
@SOAPBinding(style = SOAPBinding.Style.RPC, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED, use = SOAPBinding.Use.LITERAL)
public class LocationWS implements ILocationsWS {

    @WebMethod(operationName = "EchoMessageTest")
    @RequestWrapper(targetNamespace="http://avalk.com/types",
            className="java.lang.String")

    public String basicMessage(@WebParam(name = "message", mode = WebParam.Mode.IN) String message) {
        String result = "";
        result = "testHello" + message;
        return result;
    }
}

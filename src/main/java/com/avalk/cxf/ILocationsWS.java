package com.avalk.cxf;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by Abrams on 18.07.2016.
 */
@WebService(name = "Locations", targetNamespace = "http://avalk.com")
public interface ILocationsWS {

    @WebResult
    public String basicMessage(@WebParam(name = "message") String message);

}

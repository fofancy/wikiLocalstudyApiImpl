package com.fofancy.wiki.geographicalobjects.ws;

import com.fofancy.geographicalObjects.info.GeographicalObjectInfo;
import com.fofancy.geographicalObjects.info.GeographicalObjectsInfoParameters;
import com.fofancy.geographicalObjects.info.IGeographicalObjectsInfoReceiver;
import com.fofancy.wiki.geographicalobjects.info.WikiGeographicalObjectsInfoReceiverQualifier;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by shaylin3 on 06.05.2017.
 */
@WebService(
        targetNamespace = "http://wiki.fofancy.com/",
        portName = "WikiGeographicalObjectsInfoReceiverServiceEndpointPort",
        serviceName="geographical-objects-info",
        endpointInterface = "com.fofancy.geographicalObjects.info.IGeographicalObjectsInfoReceiver"
)
public class WikiGeographicalObjectsInfoReceiverServiceEndpoint{
    @Inject
    @WikiGeographicalObjectsInfoReceiverQualifier
    private IGeographicalObjectsInfoReceiver service;

    @WebMethod(action = "receiveDescription", operationName = "receiveDescription")
    public GeographicalObjectInfo receiveDescription(GeographicalObjectsInfoParameters properties) {
        return service.receiveDescription(properties);
    }
}

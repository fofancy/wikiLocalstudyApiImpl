package com.fofancy.wiki.mapinfo.ws;

import com.fofancy.mapInfo.nearestObjects.INearestObjectsReceiver;
import com.fofancy.mapInfo.nearestObjects.MapObjectImpl;
import com.fofancy.mapInfo.nearestObjects.NearestObjectsReceiverParametersImpl;
import com.fofancy.wiki.mapinfo.nearestobjects.WikiNearestObjectsReceiverQualifier;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;

/**
 * Created by shaylin3 on 08.05.2017.
 * TODO: Split all EE components from jar which is needed to be implemented
 * TODO: More fixed wsdl file (from location)
 */
@WebService(
        targetNamespace = "http://wiki.fofancy.com/",
        portName = "WikiNearestObjectsReceiverServiceEndpointPort",
        serviceName="nearest-objects",
        endpointInterface = "com.fofancy.mapInfo.nearestObjects.INearestObjectsReceiver"
)
public class WikiNearestObjectsReceiverServiceEndpoint {
    @Inject
    @WikiNearestObjectsReceiverQualifier
    private INearestObjectsReceiver service;

    //TODO: rename to receiveNearestMapObjects
    @WebMethod(action = "getNearestMapObjects")
    public ArrayList<MapObjectImpl> receiveNearestMapObjects(NearestObjectsReceiverParametersImpl params) {
        return service.receiveNearestMapObjects(params);
    }
}

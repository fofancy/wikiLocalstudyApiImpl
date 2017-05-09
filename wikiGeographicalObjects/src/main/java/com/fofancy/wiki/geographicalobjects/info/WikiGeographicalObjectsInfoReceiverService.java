package com.fofancy.wiki.geographicalobjects.info;

import com.fofancy.geographicalObjects.info.GeographicalObjectInfo;
import com.fofancy.geographicalObjects.info.IGeographicalObjectsInfoReceiver;
import com.fofancy.geographicalObjects.info.GeographicalObjectsInfoParameters;

import javax.inject.Named;

/**
 * Created by shaylin3 on 15.04.2017.
 */
@WikiGeographicalObjectsInfoReceiverQualifier
public class WikiGeographicalObjectsInfoReceiverService implements IGeographicalObjectsInfoReceiver {

    public GeographicalObjectInfo receiveDescription(GeographicalObjectsInfoParameters properties) {
        WikiGeographicalObjectsInfoQueryFactory factory = WikiGeographicalObjectsInfoQueryFactory.newInstance();
        factory.setParameters(properties);
        WikiGeographicalObjectsInfoQuery query = factory.createGeographicalObjectsInfoQuery();

        GeographicalObjectInfo response = query.execute();

        return response;
    }
}

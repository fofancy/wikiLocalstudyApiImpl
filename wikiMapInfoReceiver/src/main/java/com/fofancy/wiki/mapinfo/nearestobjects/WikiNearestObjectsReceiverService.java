/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fofancy.wiki.mapinfo.nearestobjects;

import com.fofancy.mapInfo.nearestObjects.*;

import java.util.ArrayList;

@WikiNearestObjectsReceiverQualifier
public class WikiNearestObjectsReceiverService implements INearestObjectsReceiver {
    
    public WikiNearestObjectsReceiverService() {
    }
    public ArrayList<MapObjectImpl> receiveNearestMapObjects(NearestObjectsReceiverParametersImpl params) {
        Coords coords = new Coords();
        coords.setLatitude(Double.valueOf(String.valueOf(params.getProperty("latitude"))));
        coords.setLongitude(Double.valueOf(String.valueOf(params.getProperty("longitude"))));

        int radius = Integer.valueOf(String.valueOf(params.getProperty("radius")));

        WikiNearestObjectsQueryFactory factory = WikiNearestObjectsQueryFactory.newInstance();
        factory.setCoords(coords);
        factory.setRadius(radius);
        WikiNearestObjectsQuery query = factory.createQuery();
        
        return query.execute();
    }
}

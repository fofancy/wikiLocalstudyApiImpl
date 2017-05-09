/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fofancy.wiki.mapinfo.nearestobjects;

import com.fofancy.mapInfo.nearestObjects.Coords;
import com.fofancy.mapInfo.nearestObjects.MapObjectImpl;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shaylin3
 */
class WikiNearestObjectsQuery {
    WikiNearestObjectsApiWrapper apiWrapper;
    Coords coords;
    int radius;
    
    public WikiNearestObjectsQuery() {
        
    }

    public Coords getCoords() {
        return coords;
    }

    public void setCoords(Coords coords) {
        this.coords = coords;
    }
   
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    /*
    * ToDO
    */
    public ArrayList<MapObjectImpl> execute(){
        return WikiNearestObjectsApiWrapper.getNearestObjects(coords, radius);
    }

}

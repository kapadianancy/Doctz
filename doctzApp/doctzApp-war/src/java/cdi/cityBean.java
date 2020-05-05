/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdi;

import client.myadmin;
import entity.*;
import java.util.ArrayList;
import java.util.Collection;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

/**
 *
 * @author ADMIN
 */
@Named(value = "cityBean")
@RequestScoped
public class cityBean {

    myadmin a;
    Response res;
    GenericType<Collection<CityTb>> gcity;
    Collection<CityTb> allcity;
    
    private int id,stateId;
    private String cityName;
    public cityBean() {
        a=new myadmin();
        gcity=new GenericType<Collection<CityTb>>(){};
        allcity=new ArrayList<CityTb>();
    }

    public Collection<CityTb> getAllcity() {
        res=a.getAllCity(Response.class);
        allcity=res.readEntity(gcity);
        return allcity;
    }

    public void setAllcity(Collection<CityTb> allcity) {
        this.allcity = allcity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
    
    
}

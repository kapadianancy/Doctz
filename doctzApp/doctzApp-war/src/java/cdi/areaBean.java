/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdi;

import client.myclient;
import entity.AreaTb;
import java.util.ArrayList;
import java.util.Collection;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Admin
 */
@Named(value = "areaBean")
@RequestScoped
public class areaBean {

    myclient c;
    Response res;
    GenericType<Collection<AreaTb>> garea;
    
    private int id;
    private String name;
    private int cid;
    private int pincode;
    private double lati;
    private double longi;
    private int isActive;
    Collection<AreaTb> allareas;
    
    
    public areaBean() {
        c=new myclient();
        garea=new GenericType<Collection<AreaTb>>(){};
        allareas=new ArrayList<AreaTb>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public double getLati() {
        return lati;
    }

    public void setLati(double lati) {
        this.lati = lati;
    }

    public double getLongi() {
        return longi;
    }

    public void setLongi(double longi) {
        this.longi = longi;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public Collection<AreaTb> getAllareas() {
        res=c.getAllArea(Response.class);
        allareas=res.readEntity(garea);
        return allareas;
    }

    public void setAllareas(Collection<AreaTb> allareas) {
        this.allareas = allareas;
    }
    
    
}

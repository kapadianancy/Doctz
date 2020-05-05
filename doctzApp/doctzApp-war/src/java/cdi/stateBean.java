/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdi;

import client.*;
import entity.AreaTb;
import entity.StateTb;
import java.util.ArrayList;
import java.util.Collection;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

/**
 *
 * @author ADMIN
 */
@Named(value = "stateBean")
@RequestScoped
public class stateBean {

    myadmin a;
    Response res;
    GenericType<Collection<StateTb>> gstate;
    Collection<StateTb> allstates;
    
    private int id;
    private String stateName;
    
    public stateBean() {
        a=new myadmin();
        gstate=new GenericType<Collection<StateTb>>(){};
        allstates=new ArrayList<StateTb>();
    }

    public Collection<StateTb> getAllstates() {
        res=a.getAllState(Response.class);
        allstates=res.readEntity(gstate);
        return allstates;
    }

    public void setAllstates(Collection<StateTb> allstates) {
        this.allstates = allstates;
    }
    

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    
}

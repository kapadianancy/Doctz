/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdi;

import client.myclient;
import entity.AreaTb;
import entity.SpecializationTb;
import java.util.ArrayList;
import java.util.Collection;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

/**
 *
 * @author Admin
 */
@Named(value = "specializationBean")
@RequestScoped
public class specializationBean {

    Response res;
    myclient c;
    Collection<SpecializationTb> allspec;
    GenericType<Collection<SpecializationTb>> gspec;
    
    private int id;
    private String name;
    private int pid;
    private String des;
    private String image;
    private int isActive;
    
     public specializationBean() {
         c=new myclient();
         allspec=new ArrayList<SpecializationTb>();
         gspec=new GenericType<Collection<SpecializationTb>>(){};
    }
    

    public Collection<SpecializationTb> getAllspec() {
        res=c.getAllSpecialization(Response.class);
        allspec=res.readEntity(gspec);
        return allspec;
    }

    public void setAllspec(Collection<SpecializationTb> allspec) {
        this.allspec = allspec;
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

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }
    
    
    public String getme()
    {
        return "Nidhi";
    }
            
    /**
     * Creates a new instance of specializationBean
     */
   
}

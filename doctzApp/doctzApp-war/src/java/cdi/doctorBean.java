/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdi;

import beans.doctzBeanLocal;
import client.myclient;
import entity.DoctorTb;
import entity.SpecializationTb;
import java.util.ArrayList;
import java.util.Collection;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Admin
 */
@Named(value = "doctorBean")
@RequestScoped
public class doctorBean {

    
    myclient c;
    Response res;
    
    GenericType<Collection<DoctorTb>> gdoc;
   
    
    private int id;
    private String name;
    private int sid;
    private String exp;
    private String gender;
    private int uid;
    private String certi;
    private String edu;
    private String profile;
    private int isActive;
    private Collection<DoctorTb> alldocs;

    public doctorBean() {
        c=new myclient();
        gdoc=new GenericType<Collection<DoctorTb>>(){};
        alldocs=new ArrayList<DoctorTb>();
       
    }

    public Response getRes() {
        return res;
    }

    public void setRes(Response res) {
        this.res = res;
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

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getCerti() {
        return certi;
    }

    public void setCerti(String certi) {
        this.certi = certi;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public Collection<DoctorTb> getAlldocs() {
         res=c.getAllDoctor(Response.class);
         alldocs=res.readEntity(gdoc);
         return alldocs;
    }

    public void setAlldocs(Collection<DoctorTb> alldocs) {
        this.alldocs = alldocs;
    }
    
}

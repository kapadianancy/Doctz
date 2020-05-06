/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdi;

import client.myadmin;
import client.myclient;
import entity.SpecializationTb;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.servlet.http.Part;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;


/**
 *
 * @author Admin
 */
@Named(value = "specializationBean")
@RequestScoped
public class specializationBean {

    Response res;
    myclient c;
    myadmin a;
    Collection<SpecializationTb> allspec;
    GenericType<Collection<SpecializationTb>> gspec;
    
    private int id;
    private String name;
    private String des;
    private String image;
    private int isActive;
    private Part uploadedFile;
    private String folder = "H:\\Doctz\\doctzApp\\doctzApp-war\\web\\resources\\img\\specialities";
    
     public specializationBean() {
         c=new myclient();
         a=new myadmin();
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

    public Part getUploadedFile() {
        return uploadedFile;
    }

    public void setUploadedFile(Part uploadedFile) {
        this.uploadedFile = uploadedFile;
    }
    
   
    
    public void uploadImage()
    {
        try (InputStream input = this.uploadedFile.getInputStream())
        {
            String fileName = this.uploadedFile.getSubmittedFileName();
            Files.copy(input, new File(folder, fileName).toPath());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public String addSpecilaization()
    {
        this.uploadImage();
       // System.out.println(this.name+" "+this.uploadedFile.getSubmittedFileName());
        res=a.addSpecialization(Response.class, this.name, this.des,this.uploadedFile.getSubmittedFileName());
        this.name="";
        this.des="";
        return "addSpecialities.xhtml";
    }
            
    /**
     * Creates a new instance of specializationBean
     */
   
}

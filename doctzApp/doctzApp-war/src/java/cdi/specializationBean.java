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
    GenericType<SpecializationTb> gs;
    
    private int id,selectedId;
    private String name;
    private String des;
    private String image;
    private int isActive;
    private Part uploadedFile;
    private SpecializationTb s;
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

    public SpecializationTb getS() {
        return s;
    }

    public void setS(SpecializationTb s) {
        this.s = s;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSelectedId() {
        return selectedId;
    }

    public void setSelectedId(int selectedId) {
        this.selectedId = selectedId;
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

        return "specialities.xhtml?faces-redirect=true";
    }
            
    public String Delete()
    {
        res=a.deleteSpecialization(Response.class, String.valueOf(this.selectedId));
        return "specialities.xhtml?faces-redirect=true";
    }
   
    public String edit(int id)
    {
//        System.out.println(id);
//        SpecializationTb s1=new SpecializationTb();
//       res=a.getSpecializationById(Response.class, String.valueOf(id));
//       s1=res.readEntity(gs);
//        System.out.println(s1.getName());
//       this.name=s.getName();
//       this.des=s.getDescription();
//       this.image=s.getImage();
       return "editSpecialities.xhtml";
    }
    
    public String update()
    {
        res=a.updateSpecialization(Response.class, String.valueOf(this.id), this.name, this.des, this.uploadedFile.getSubmittedFileName());
        return "specialities.xhtml?faces-redirect=true";
    }
}

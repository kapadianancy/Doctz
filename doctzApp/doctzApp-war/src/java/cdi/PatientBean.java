/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdi;

import beans.doctzBeanLocal;
import client.myclient;
import entity.*;
import java.util.ArrayList;
import java.util.Collection;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

/**
 *
 * @author ADMIN
 */
@Named(value = "patientBean")
@RequestScoped
public class PatientBean {

    @EJB doctzBeanLocal ejb;
    Response res;
    myclient c;
    Collection<PatientTb> allpatient;
    GenericType<Collection<PatientTb>> gpatient;
    
    private int patientid,userid,age;
    private String patientname,gender,address,username,password,email;
    private long contact;
    private int isActive;
    private String errorMsg="";
    
    private PatientTb currentUser;
    GenericType<PatientTb> gp;
  
    
    
    public PatientBean() {
         
         c=new myclient();
         allpatient=new ArrayList<PatientTb>();
         gpatient=new GenericType<Collection<PatientTb>>(){};
         currentUser=new PatientTb();
         gp=new GenericType<PatientTb>(){};
         
     
    }

    public Collection<PatientTb> getAllpatient() {
          allpatient=ejb.getAllPatient();
          return allpatient;
    }

    public void setAllpatient(Collection<PatientTb> allpatient) {
        this.allpatient = allpatient;
    }

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }
    
    
      public PatientTb getCurrentUser() {
        
//        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
//               
//        HttpSession session= request.getSession(true);
//        String str=session.getAttribute("username").toString();
//        System.out.println(str);
//        PatientTb p1=new PatientTb();
//        
//        p1=ejb.getPatientByEmail(str);
//        System.out.println(p1);
//        this.patientid=p1.getPatientId();
//        this.patientname=p1.getPatientName();
//        this.age=p1.getAge();
//        this.gender=p1.getGender();
//        this.address=p1.getAddress();
//        this.userid=p1.getUserId().getUserId();
//        this.username=p1.getUserId().getUserName();
//        this.email=p1.getUserId().getEmail();
//        this.contact=p1.getUserId().getContact(); 
//        
//        return p1;
       
        return currentUser;
    }

    public void setCurrentUser(PatientTb currentUser) {
       
        this.currentUser = currentUser;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
    
    
    

    
    public String addPatient()
    {
        //Pbkdf2PasswordHashImpl pb=new Pbkdf2PasswordHashImpl();
      
        //String pass=pb.generate(this.password.toCharArray());
        
       // System.out.println(pb.generate(this.password.toCharArray())+" done");
        
       //System.out.println(pb.generate(this.password.toCharArray())+" done");
        res=c.patientRegistration(Response.class, this.patientname, this.gender, this.address, String.valueOf(this.age), this.username,this.password , this.email, String.valueOf(this.contact));
        if(res.getStatus() > 0)
        {
            return "index.xhtml";
        }
        return "signup.xhtml";
        
    }
    
    
        public String editProfile()
    {
        //PatientTb p=this.getCurrentUser();
        System.out.println(this.getPatientname());
  //    res=c.editPatientProfile(Response.class, String.valueOf(this.currentUser.getPatientId()), this.patientname, this.gender, this.address, String.valueOf(this.age), this.username,this.email,String.valueOf(this.contact), String.valueOf(this.userid));
//        System.out.println("res:"+res);
//        if(res.getStatus() > 0)
//        {
//            this.errorMsg="";
//            
//            return "userProfile.xhtml";
//        }
//        else
//        {
//            this.errorMsg="Could not edit your Profile please try again";
//            return "userProfile.xhtml";
//        
//            
//        }
//        
        return "userProfile.xhtml";
    }
    
    public void display()
    {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
          
        HttpSession session= request.getSession(true);
        String str=session.getAttribute("username").toString();
        
//        this.setCurrentUser(ejb.getPatientByEmail(str));
//        this.setPatientname(currentUser.getPatientName());
    }
    
}

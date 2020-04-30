/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdi;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.security.enterprise.AuthenticationStatus;
import static javax.security.enterprise.AuthenticationStatus.SEND_FAILURE;
import static javax.security.enterprise.AuthenticationStatus.SUCCESS;
import javax.security.enterprise.SecurityContext;
import javax.security.enterprise.authentication.mechanism.http.AuthenticationParameters;
import static javax.security.enterprise.authentication.mechanism.http.AuthenticationParameters.withParams;
import javax.security.enterprise.credential.Credential;
import javax.security.enterprise.credential.Password;
import javax.security.enterprise.credential.UsernamePasswordCredential;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@Named(value = "loginBean")
@RequestScoped
public class loginBean {

     @Inject
    SecurityContext sc;
     
    private String username;
    private String password,message;
    public loginBean() {
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String checklogin(){
        //System.out.println("In Checking");
        try{
             HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
                HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
                Credential credential = new UsernamePasswordCredential(getUsername(), new Password(getPassword()));
                AuthenticationStatus status = sc.authenticate(request,response, withParams().credential(credential));
                   System.err.println(status);
                if(status.equals(SUCCESS)){
                    HttpSession session= request.getSession(true);
                    session.setAttribute("username",getUsername());
                    session.setAttribute("password",getPassword());
                    //System.out.println(sc.isCallerInRole("admin"));
                    if(sc.isCallerInRole("admin")){
                        return "temp.xhtml";
                    }
                    else if(sc.isCallerInRole("patient")){
                        return "index.xhtml";
                    }
                    else{
                        System.out.println("No Role Found");
                    }
                }
                else if(status.equals(SEND_FAILURE)){
                    message="Invalid User";
                    return "login.xhtml";
                }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return null;
        
        
    }
    
    public String getLogin()
    {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpSession session= request.getSession(true);
        if(session.getAttribute("username")!=null)
        {
           return session.getAttribute("username").toString();
        }
        return "Login/Signup";
        
    }
    public String getLink()
    {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpSession session= request.getSession(true);
        if(session.getAttribute("username")!=null)
        {
           return "edit_profile.xhtml";
        }
        return "faces/login.xhtml";
    }
}

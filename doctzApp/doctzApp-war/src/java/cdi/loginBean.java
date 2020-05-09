/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdi;

import beans.doctzBeanLocal;
import client.myclient;
import entity.*;
import java.nio.charset.Charset;
import java.util.Properties;
import java.util.Random;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
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
import javax.ws.rs.core.Response;

/**
 *
 * @author Admin
 */
@Named(value = "loginBean")
@RequestScoped
public class loginBean {

    @EJB doctzBeanLocal ejb;
    
     @Inject
    SecurityContext sc;
     
     myclient c;
     Response res;
    private String username;
    private String password,message,color;
   
    public loginBean() {
        c=new myclient();
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
                        return "admin/dashboard.xhtml?faces-redirect=true";
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
//            PatientBean p=new PatientBean();
//            p.display();

           return "dashboard.xhtml";
        }
        return "faces/login.xhtml";
    }
    
    
    public void sendMail()
    {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 5) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        
        ejb.changePassword(this.username, saltStr);
        
        final String SMTP_HOST = "smtp.gmail.com";
        final String SMTP_PORT = "587";
        final String GMAIL_USERNAME = "nidhinancy0921@gmail.com";
        final String GMAIL_PASSWORD = "nidhi0921nancy";

       // System.out.println("Process Started");

        Properties prop = System.getProperties();
        prop.setProperty("mail.smtp.starttls.enable", "true");
        prop.setProperty("mail.smtp.host", SMTP_HOST);
        prop.setProperty("mail.smtp.user", GMAIL_USERNAME);
        prop.setProperty("mail.smtp.password", GMAIL_PASSWORD);
        prop.setProperty("mail.smtp.port", SMTP_PORT);
        prop.setProperty("mail.smtp.auth", "true");
        //System.out.println("Props : " + prop);

        Session session = Session.getInstance(prop, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(GMAIL_USERNAME,
                        GMAIL_PASSWORD);
            }
        });

       
        MimeMessage message = new MimeMessage(session);
        try {
            //System.out.println("before sending");
            message.setFrom(new InternetAddress(GMAIL_USERNAME));
            message.addRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(this.username));
            message.setSubject("New Password");
            message.setContent("<h3>Your New Password For Doctz :"+saltStr+" </h3>"
            + "<br> <a href='http://localhost:8001/doctzApp-war/faces/login.xhtml'>Click link for login</a>", "text/html");
            //message.setText("<h1>Your New Password For Doctz : </h1>"+saltStr,"UTF-8","text/html");
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(this.username));
            Transport transport = session.getTransport("smtp");
            System.out.println("Got Transport" + transport);
            transport.connect(SMTP_HOST, GMAIL_USERNAME, GMAIL_PASSWORD);
            transport.sendMessage(message, message.getAllRecipients());
           //System.out.println("message Object : " + message);
          //  System.out.println("Email Sent Successfully");
        } catch (AddressException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (MessagingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        
    }
    
    public String forget_password()
    {
        PatientTb p=ejb.getPatientByEmail(this.username);
        System.out.println(p);
        if(p.getPatientId() != null)
        {           
            sendMail();         
            this.message="Check Your Mail Please";
            this.color="green";
        }
        else
        {
            this.message="Invalid Email";  
            this.color="red";
        }
        return "faces/forget_password.xhtml";
    }
}

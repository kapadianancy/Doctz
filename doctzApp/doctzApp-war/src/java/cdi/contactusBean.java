/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdi;

import java.util.Properties;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author ADMIN
 */
@Named(value = "contactusBean")
@RequestScoped
public class contactusBean {

    private String name,email,subject,message;
    
    public contactusBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String sendMessage()
    {
        
      String to = "nidhinancy0921@gmail.com";//change accordingly  
      String from = this.email;//change accordingly  
      String host = "localhost";//or IP address  
  
     //Get the session object  
      Properties properties = System.getProperties();  
      properties.setProperty("mail.smtp.host", host);  
      Session session = Session.getDefaultInstance(properties);  
  
     //compose the message  
      try{  
         MimeMessage message = new MimeMessage(session);  
         message.setFrom(new InternetAddress(from));  
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
         message.setSubject(this.subject);  
         message.setText("Inquiry Mail : "+this.message);  
  
         // Send message  
         Transport.send(message);  
         //System.out.println("message sent successfully....");  
  
      }catch (MessagingException mex) {mex.printStackTrace();}
        
        
        return "Message sent successfully....";
    }
    
}

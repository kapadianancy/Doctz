/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdi;

import client.myclient;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Admin
 */
@Named(value = "searchBean")
@RequestScoped
public class searchBean {

    //myclient c;
    //Response res;
   // GenericType<Object>
            
    
    private String searchStr;
    public searchBean() {
        //c=new myclient();
    }

    public String getSearchStr() {
        return searchStr;
    }

    public void setSearchStr(String searchStr) {
        this.searchStr = searchStr;
    }
    
    public String searchByArea()
    {
        return "hospitals.xhtml?faces-redirect=true&area="+this.getSearchStr();
    }
    
}

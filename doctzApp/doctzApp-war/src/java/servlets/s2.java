package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import beans.doctzBeanLocal;
import client.myadmin;
import client.myclient;
import entity.*;
import entity.SpecializationTb;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

/**
 *
 * @author ADMIN
 */
public class s2 extends HttpServlet {

   @EJB doctzBeanLocal ejb;
   Response res;
   myclient c1=new myclient();
   myadmin a1=new myadmin();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet s2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet s2 at " + request.getContextPath() + "</h1>");
            
//            res=c1.patientRegistration(Response.class, "Alexa", "Female", "Alexa", "44", "alexa","alexa", "a4@gmail.com","9876543210");
//            out.println(res);
            
//           res=a1.addState(Response.class, "Punjab");

            //res=a1.updateSpecialization(Response.class, "1", "Urologyyyy", "Urology is a part of health care that deals with diseases of the male and female urinary tract.", "resources/img/specialities/specialities-01.png");

            
            Collection<SpecializationTb> sp=new ArrayList<SpecializationTb>();
            GenericType<Collection<SpecializationTb>> s=new GenericType<Collection<SpecializationTb>>(){};
            res =a1.getAllSpecialization(Response.class);
          //  out.println(res);
            sp=res.readEntity(s);
            
            for(SpecializationTb s1:sp)
            {
                out.println(s1.getName()+" "+s1.getDescription()+" "+s1.getImage()+"<br>");
            }
            
            
//            Collection<HospitalTb> sp=ejb.getHospitalByAreaAndSpecializationName("Ring Road", "Dentist");
//            
//            for(HospitalTb s1:sp)
//            {
//                out.println("\n"+s1.getHospitalName()+"<br>");
//          
            res=c1.editPatientProfile(Response.class, "4", "Nancy", "female", "ganesh--park", "20", "Nancy", "kapadianancy21@gmail.com", "9426555735", "41");
            out.println("res:" +res);
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

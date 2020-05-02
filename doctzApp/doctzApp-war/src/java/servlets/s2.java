package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import beans.doctzBeanLocal;
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
            
//           // Collection<DoctorTb> sp=new ArrayList<DoctorTb>();
//            GenericType<Collection<DoctorTb>> s=new GenericType<Collection<DoctorTb>>(){};
//            res =c1.getAllDoctor(Response.class);
//          //  out.println(res);
//            sp=res.readEntity(s);
            
            Collection<HospitalTb> sp=ejb.getHospitalByAreaAndSpecializationName("Ring Road", "Dentist");
            
            for(HospitalTb s1:sp)
            {
                out.println("\n"+s1.getHospitalName()+"<br>");
            }
            
            out.println("hello</body>");
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

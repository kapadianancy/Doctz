/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import beans.doctzBeanLocal;
import entity.*;
import java.util.Collection;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author ADMIN
 */
@Path("adminRest")
@RequestScoped
public class adminRest {

    @EJB doctzBeanLocal ejb;
    @Context
    private UriInfo context;

  
    public adminRest() {
    }

    //public int addState(String stateName);
    @POST
    @Path("/addState/{stateName}")
    @Produces(MediaType.APPLICATION_JSON)
    public int addState(@PathParam("stateName") String stateName)
    {
        return ejb.addState(stateName);
    }
    
    //public int updateState(int stateId,String stateName);
    @POST
    @Path("/updateState/{stateId}/{stateName}")
    @Produces(MediaType.APPLICATION_JSON)
    public int updateState(@PathParam("stateId") int stateId,@PathParam("stateName") String stateName)
    {
        return ejb.updateState(stateId, stateName);
    }
    
    //public int deleteState(int stateId);
    @DELETE
    @Path("/deleteState/{stateId}")
    @Produces(MediaType.APPLICATION_JSON)
    public int deleteState(@PathParam("stateId") int stateId)
    {
        return ejb.deleteState(stateId);
    }

    //  public Collection<StateTb> getAllState();
    @GET
    @Path("/getAllState")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<StateTb> getAllState() {
        return ejb.getAllState();
    }
    
    // public int addCity(String cityName,int stateId);
    @POST
    @Path("/addCity/{cityName}/{stateId}")
    @Produces(MediaType.APPLICATION_JSON)
    public int addCity(@PathParam("cityName") String cityName,@PathParam("stateId") int stateId)
    {
        return ejb.addCity(cityName, stateId);
    }
    
    //public int updateCity(int cityId,String cityName,int stateId);
    @POST
    @Path("/updateCity/{cityId}/{cityName}/{stateId}")
    @Produces(MediaType.APPLICATION_JSON)
    public int updateCity(@PathParam("cityId") int cityId,@PathParam("cityName") String cityName,@PathParam("stateId") int stateId)
    {
        return ejb.updateCity(cityId, cityName, stateId);
    }
    
    //public int deleteCity(int cityId);
    @DELETE
    @Path("/deleteCity/{cityId}")
    @Produces(MediaType.APPLICATION_JSON)
    public int deleteCity(@PathParam("cityId") int cityId)
    {
        return ejb.deleteCity(cityId);
    }
    
    //public Collection<CityTb> getAllCity();  
    @GET
    @Path("/getAllCity")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<CityTb> getAllCity()
    {
        return ejb.getAllCity();
    }
    
    //public int addArea(String areaName,int cityId,int pincode,double latitude,double longitude);
    @POST
    @Path("/addArea/{areaName}/{cityId}/{pincode}/{latitude}/{longitude}")
    @Produces(MediaType.APPLICATION_JSON)
    public int addArea(@PathParam("areaName") String areaName,@PathParam("cityId") int cityId,@PathParam("pincode") int pincode,@PathParam("latitude") double latitude,@PathParam("longitude") double longitude)
    {
        return ejb.addArea(areaName, cityId, pincode, latitude, longitude);
    }
    
    //public int updateArea(int areaId,String areaName,int cityId,int pincode,double latitude,double longitude);
    @POST
    @Path("/updateArea/{areaId}/{areaName}/{cityId}/{pincode}/{latitude}/{longitude}")
    @Produces(MediaType.APPLICATION_JSON)
    public int updateArea(@PathParam("areaId") int areaId,@PathParam("areaName") String areaName,@PathParam("cityId") int cityId,@PathParam("pincode") int pincode,@PathParam("latitude") double latitude,@PathParam("longitude") double longitude)
    {
        return ejb.updateArea(areaId, areaName, cityId, pincode, latitude, longitude);
    }
    
    //public int deleteArea(int areaId);
    @DELETE
    @Path("/deleteArea/{areaId}")
    @Produces(MediaType.APPLICATION_JSON)
    public int deleteArea(@PathParam("areaId") int areaId)
    {
        return ejb.deleteArea(areaId);
    }
    
    //public Collection<AreaTb> getAllArea();
    @GET
    @Path("/getAllArea")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<AreaTb> getAllArea()
    {
        return ejb.getAllArea();
    }

    //public Collection<HospitalTb> getAllHospital();
    @GET
    @Path("/getAllHospital")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<HospitalTb> getAllHospital()
    {
        return ejb.getAllHospital();
    }
    
    //public int verifyHospital(int hospitalId);
    @POST
    @Path("/verifyHospital/{hospitalId}")
    @Produces(MediaType.APPLICATION_JSON)
    public int verifyHospital(@PathParam("hospitalId") int hospitalId)
    {
        return ejb.verifyHospital(hospitalId);
    }
    
    //public Collection<DoctorTb> getAllDoctor();
    @GET
    @Path("/getAllDoctor")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<DoctorTb> getAllDoctor()
    {
        return ejb.getAllDoctor();
    }
    
    //public int verifyDoctor(int doctorId);
    @POST
    @Path("/verifyDoctor/{doctorId}")
    @Produces(MediaType.APPLICATION_JSON)
    public int verifyDoctor(@PathParam("doctorId") int doctorId)
    {
        return ejb.verifyDoctor(doctorId);
    }
    
    //public int addSpecialization(String name,String description,String image);
    @POST
    @Path("/addSpecialization/{name}/{description}/{image}")
    @Produces(MediaType.APPLICATION_JSON)
    public int addSpecialization(@PathParam("name") String name,@PathParam("description") String description,@PathParam("image") String image)
    {
        return ejb.addSpecialization(name, description, image);
    }
    
    //public int updateSpecialization(int specializaionId, String name,String description,String image);
    @POST
    @Path("/updateSpecialization/{specializaionId}/{name}/{description}/{image}")
    @Produces(MediaType.APPLICATION_JSON)
    public int updateSpecialization(@PathParam("specializaionId") int specializaionId,@PathParam("name") String name,@PathParam("description") String description,@PathParam("image") String image)
    {
        System.out.println(name);
        return ejb.updateSpecialization(specializaionId, name, description, image);
    }
    
    //public int deleteSpecialization(int specializaionId);
    @DELETE
    @Path("/deleteSpecialization/{specializaionId}")
    @Produces(MediaType.APPLICATION_JSON)
    public int deleteSpecialization(@PathParam("specializaionId") int specializaionId)
    {
        return ejb.deleteSpecialization(specializaionId);
    }
    
    //public Collection<SpecializationTb> getAllSpecialization();
    @GET
    @Path("/getAllSpecialization")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<SpecializationTb> getAllSpecialization()
    {
        return ejb.getAllSpecialization();
    }
    
    //public Collection<AppointmentTb> getAllAppointment();
    @GET
    @Path("/getAllAppointment")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<AppointmentTb> getAllAppointment()
    {
        return ejb.getAllAppointment();
    }
    
}

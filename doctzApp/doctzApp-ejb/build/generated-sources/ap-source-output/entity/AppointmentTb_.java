package entity;

import entity.DoctorTb;
import entity.HospitalTb;
import entity.PatientTb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-30T18:52:11")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-30T17:33:30")
>>>>>>> 9810d3d9b261c73e3f5474845c9f51e22c7299c7
@StaticMetamodel(AppointmentTb.class)
public class AppointmentTb_ { 

    public static volatile SingularAttribute<AppointmentTb, Date> date;
    public static volatile SingularAttribute<AppointmentTb, String> amPm;
    public static volatile SingularAttribute<AppointmentTb, DoctorTb> doctorId;
    public static volatile SingularAttribute<AppointmentTb, HospitalTb> hospitalId;
    public static volatile SingularAttribute<AppointmentTb, PatientTb> patientId;
    public static volatile SingularAttribute<AppointmentTb, Integer> appointmentId;
    public static volatile SingularAttribute<AppointmentTb, Date> time;
    public static volatile SingularAttribute<AppointmentTb, String> invoice;
    public static volatile SingularAttribute<AppointmentTb, Integer> isActive;
    public static volatile SingularAttribute<AppointmentTb, String> status;

}
package entity;

import entity.DoctorTb;
import entity.HospitalTb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-30T18:52:11")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-30T17:33:30")
>>>>>>> 9810d3d9b261c73e3f5474845c9f51e22c7299c7
@StaticMetamodel(DoctorScheduleTb.class)
public class DoctorScheduleTb_ { 

    public static volatile SingularAttribute<DoctorScheduleTb, Date> date;
    public static volatile SingularAttribute<DoctorScheduleTb, Integer> numberOfPatient;
    public static volatile SingularAttribute<DoctorScheduleTb, HospitalTb> hospitalId;
    public static volatile SingularAttribute<DoctorScheduleTb, DoctorTb> doctorId;
    public static volatile SingularAttribute<DoctorScheduleTb, Date> fromTime;
    public static volatile SingularAttribute<DoctorScheduleTb, Integer> isActive;
    public static volatile SingularAttribute<DoctorScheduleTb, Integer> scheduleId;
    public static volatile SingularAttribute<DoctorScheduleTb, Date> toTime;

}
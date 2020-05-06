package entity;

import entity.DoctorTb;
import entity.HospitalTb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-06T20:00:33")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-06T15:44:48")
>>>>>>> d9d866fc4d4652b1f7b3f80b0a2317f5b5fdf6c3
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
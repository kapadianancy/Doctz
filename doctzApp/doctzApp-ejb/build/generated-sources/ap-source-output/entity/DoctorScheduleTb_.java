package entity;

import entity.DoctorTb;
import entity.HospitalTb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-09T10:14:17")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-12T18:04:10")
>>>>>>> 923add26c3b8a9a66c1d8ace3ca62baf91969b45
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
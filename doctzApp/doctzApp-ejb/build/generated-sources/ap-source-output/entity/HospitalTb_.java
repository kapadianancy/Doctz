package entity;

import entity.AppointmentTb;
import entity.AreaTb;
import entity.CityTb;
import entity.DoctorScheduleTb;
import entity.FeesTb;
import entity.HospitalFacilityTb;
import entity.ReviewTb;
import entity.UserTb;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-30T18:52:11")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-30T17:33:30")
>>>>>>> 9810d3d9b261c73e3f5474845c9f51e22c7299c7
@StaticMetamodel(HospitalTb.class)
public class HospitalTb_ { 

    public static volatile SingularAttribute<HospitalTb, Integer> pincode;
    public static volatile SingularAttribute<HospitalTb, String> address;
    public static volatile SingularAttribute<HospitalTb, String> documents;
    public static volatile SingularAttribute<HospitalTb, Double> latitude;
    public static volatile SingularAttribute<HospitalTb, Date> openingTime;
    public static volatile CollectionAttribute<HospitalTb, DoctorScheduleTb> doctorScheduleTbCollection;
    public static volatile SingularAttribute<HospitalTb, String> hospitalName;
    public static volatile SingularAttribute<HospitalTb, CityTb> cityId;
    public static volatile SingularAttribute<HospitalTb, Integer> isActive;
    public static volatile SingularAttribute<HospitalTb, UserTb> userId;
    public static volatile CollectionAttribute<HospitalTb, AppointmentTb> appointmentTbCollection;
    public static volatile CollectionAttribute<HospitalTb, FeesTb> feesTbCollection;
    public static volatile SingularAttribute<HospitalTb, AreaTb> areaId;
    public static volatile SingularAttribute<HospitalTb, Date> closingTime;
    public static volatile CollectionAttribute<HospitalTb, HospitalFacilityTb> hospitalFacilityTbCollection;
    public static volatile SingularAttribute<HospitalTb, Integer> hospitalId;
    public static volatile CollectionAttribute<HospitalTb, ReviewTb> reviewTbCollection;
    public static volatile SingularAttribute<HospitalTb, String> logo;
    public static volatile SingularAttribute<HospitalTb, Double> longitude;

}
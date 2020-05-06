package entity;

import entity.AppointmentTb;
import entity.DoctorAttachmentTb;
import entity.DoctorScheduleTb;
import entity.ReviewTb;
import entity.SpecializationTb;
import entity.UserTb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-06T20:00:33")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-06T15:44:48")
>>>>>>> d9d866fc4d4652b1f7b3f80b0a2317f5b5fdf6c3
@StaticMetamodel(DoctorTb.class)
public class DoctorTb_ { 

    public static volatile SingularAttribute<DoctorTb, String> education;
    public static volatile SingularAttribute<DoctorTb, String> gender;
    public static volatile CollectionAttribute<DoctorTb, DoctorAttachmentTb> doctorAttachmentTbCollection;
    public static volatile SingularAttribute<DoctorTb, String> profile;
    public static volatile CollectionAttribute<DoctorTb, DoctorScheduleTb> doctorScheduleTbCollection;
    public static volatile SingularAttribute<DoctorTb, String> experience;
    public static volatile SingularAttribute<DoctorTb, Integer> isActive;
    public static volatile SingularAttribute<DoctorTb, UserTb> userId;
    public static volatile CollectionAttribute<DoctorTb, AppointmentTb> appointmentTbCollection;
    public static volatile SingularAttribute<DoctorTb, String> doctorName;
    public static volatile SingularAttribute<DoctorTb, String> certificates;
    public static volatile SingularAttribute<DoctorTb, Integer> doctorId;
    public static volatile CollectionAttribute<DoctorTb, ReviewTb> reviewTbCollection;
    public static volatile SingularAttribute<DoctorTb, SpecializationTb> specializationId;

}
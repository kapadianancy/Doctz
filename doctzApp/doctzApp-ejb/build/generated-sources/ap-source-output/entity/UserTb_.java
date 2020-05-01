package entity;

import entity.DoctorTb;
import entity.HospitalTb;
import entity.PatientTb;
import entity.UsergroupTb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-01T17:03:20")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-01T18:17:36")
>>>>>>> 915544316dc5c268de99af0a8025803a7f764596
@StaticMetamodel(UserTb.class)
public class UserTb_ { 

    public static volatile CollectionAttribute<UserTb, DoctorTb> doctorTbCollection;
    public static volatile CollectionAttribute<UserTb, HospitalTb> hospitalTbCollection;
    public static volatile SingularAttribute<UserTb, String> password;
    public static volatile SingularAttribute<UserTb, Long> contact;
    public static volatile CollectionAttribute<UserTb, PatientTb> patientTbCollection;
    public static volatile CollectionAttribute<UserTb, UsergroupTb> usergroupTbCollection;
    public static volatile SingularAttribute<UserTb, String> userName;
    public static volatile SingularAttribute<UserTb, Integer> userId;
    public static volatile SingularAttribute<UserTb, String> email;

}
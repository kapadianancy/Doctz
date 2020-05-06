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
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-06T20:00:33")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-06T15:44:48")
>>>>>>> d9d866fc4d4652b1f7b3f80b0a2317f5b5fdf6c3
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
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
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-16T10:27:24")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-13T11:53:11")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-13T11:56:00")
>>>>>>> 3230b5225d7bfe69c9df43b428e4154eb39360b6
>>>>>>> 91f9faa7684f7c87dd7c15d9915ffe7e002d418b
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
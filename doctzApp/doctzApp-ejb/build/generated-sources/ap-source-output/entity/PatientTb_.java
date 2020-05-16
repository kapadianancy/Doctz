package entity;

import entity.AppointmentTb;
import entity.DoctorAttachmentTb;
import entity.ReviewTb;
import entity.UserTb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-13T11:53:11")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-13T11:56:00")
>>>>>>> 3230b5225d7bfe69c9df43b428e4154eb39360b6
@StaticMetamodel(PatientTb.class)
public class PatientTb_ { 

    public static volatile SingularAttribute<PatientTb, String> patientName;
    public static volatile SingularAttribute<PatientTb, String> address;
    public static volatile SingularAttribute<PatientTb, String> gender;
    public static volatile SingularAttribute<PatientTb, Integer> patientId;
    public static volatile CollectionAttribute<PatientTb, DoctorAttachmentTb> doctorAttachmentTbCollection;
    public static volatile CollectionAttribute<PatientTb, ReviewTb> reviewTbCollection;
    public static volatile SingularAttribute<PatientTb, Integer> isActive;
    public static volatile SingularAttribute<PatientTb, UserTb> userId;
    public static volatile SingularAttribute<PatientTb, Integer> age;
    public static volatile CollectionAttribute<PatientTb, AppointmentTb> appointmentTbCollection;

}
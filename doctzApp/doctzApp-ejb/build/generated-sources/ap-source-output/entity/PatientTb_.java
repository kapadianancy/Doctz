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
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-01T17:03:20")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-01T18:17:36")
>>>>>>> 915544316dc5c268de99af0a8025803a7f764596
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
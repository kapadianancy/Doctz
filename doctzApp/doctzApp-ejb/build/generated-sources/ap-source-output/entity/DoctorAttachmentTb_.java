package entity;

import entity.DoctorTb;
import entity.PatientTb;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-01T17:03:20")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-01T18:17:36")
>>>>>>> 915544316dc5c268de99af0a8025803a7f764596
@StaticMetamodel(DoctorAttachmentTb.class)
public class DoctorAttachmentTb_ { 

    public static volatile SingularAttribute<DoctorAttachmentTb, String> attachment;
    public static volatile SingularAttribute<DoctorAttachmentTb, DoctorTb> doctorId;
    public static volatile SingularAttribute<DoctorAttachmentTb, PatientTb> patientId;
    public static volatile SingularAttribute<DoctorAttachmentTb, Integer> attachmentId;

}
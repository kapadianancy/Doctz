package entity;

import entity.DoctorTb;
import entity.PatientTb;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-09T10:14:17")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-12T18:04:10")
>>>>>>> 923add26c3b8a9a66c1d8ace3ca62baf91969b45
@StaticMetamodel(DoctorAttachmentTb.class)
public class DoctorAttachmentTb_ { 

    public static volatile SingularAttribute<DoctorAttachmentTb, String> attachment;
    public static volatile SingularAttribute<DoctorAttachmentTb, DoctorTb> doctorId;
    public static volatile SingularAttribute<DoctorAttachmentTb, PatientTb> patientId;
    public static volatile SingularAttribute<DoctorAttachmentTb, Integer> attachmentId;

}
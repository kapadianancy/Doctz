package entity;

import entity.DoctorTb;
import entity.HospitalTb;
import entity.PatientTb;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-09T10:14:17")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-12T18:04:10")
>>>>>>> 923add26c3b8a9a66c1d8ace3ca62baf91969b45
@StaticMetamodel(ReviewTb.class)
public class ReviewTb_ { 

    public static volatile SingularAttribute<ReviewTb, HospitalTb> hospitalId;
    public static volatile SingularAttribute<ReviewTb, PatientTb> patientId;
    public static volatile SingularAttribute<ReviewTb, DoctorTb> doctorId;
    public static volatile SingularAttribute<ReviewTb, String> review;
    public static volatile SingularAttribute<ReviewTb, Integer> reviewId;

}
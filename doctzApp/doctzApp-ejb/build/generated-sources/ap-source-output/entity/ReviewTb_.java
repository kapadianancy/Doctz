package entity;

import entity.DoctorTb;
import entity.HospitalTb;
import entity.PatientTb;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-13T11:53:11")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-13T11:56:00")
>>>>>>> 3230b5225d7bfe69c9df43b428e4154eb39360b6
@StaticMetamodel(ReviewTb.class)
public class ReviewTb_ { 

    public static volatile SingularAttribute<ReviewTb, HospitalTb> hospitalId;
    public static volatile SingularAttribute<ReviewTb, PatientTb> patientId;
    public static volatile SingularAttribute<ReviewTb, DoctorTb> doctorId;
    public static volatile SingularAttribute<ReviewTb, String> review;
    public static volatile SingularAttribute<ReviewTb, Integer> reviewId;

}
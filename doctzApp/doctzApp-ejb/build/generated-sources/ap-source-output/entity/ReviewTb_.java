package entity;

import entity.DoctorTb;
import entity.HospitalTb;
import entity.PatientTb;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-30T18:52:11")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-30T17:33:30")
>>>>>>> 9810d3d9b261c73e3f5474845c9f51e22c7299c7
@StaticMetamodel(ReviewTb.class)
public class ReviewTb_ { 

    public static volatile SingularAttribute<ReviewTb, HospitalTb> hospitalId;
    public static volatile SingularAttribute<ReviewTb, PatientTb> patientId;
    public static volatile SingularAttribute<ReviewTb, DoctorTb> doctorId;
    public static volatile SingularAttribute<ReviewTb, String> review;
    public static volatile SingularAttribute<ReviewTb, Integer> reviewId;

}
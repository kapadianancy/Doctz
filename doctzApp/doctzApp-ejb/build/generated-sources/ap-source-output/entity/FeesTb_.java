package entity;

import entity.HospitalTb;
import entity.SpecializationTb;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-09T10:14:17")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-12T18:04:10")
>>>>>>> 923add26c3b8a9a66c1d8ace3ca62baf91969b45
@StaticMetamodel(FeesTb.class)
public class FeesTb_ { 

    public static volatile SingularAttribute<FeesTb, Integer> fees;
    public static volatile SingularAttribute<FeesTb, Integer> feesId;
    public static volatile SingularAttribute<FeesTb, HospitalTb> hospitalId;
    public static volatile SingularAttribute<FeesTb, SpecializationTb> specializationId;

}
package entity;

import entity.DoctorTb;
import entity.FeesTb;
import entity.HospitalFacilityTb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-06T20:00:33")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-06T15:44:48")
>>>>>>> d9d866fc4d4652b1f7b3f80b0a2317f5b5fdf6c3
@StaticMetamodel(SpecializationTb.class)
public class SpecializationTb_ { 

    public static volatile SingularAttribute<SpecializationTb, String> image;
    public static volatile CollectionAttribute<SpecializationTb, DoctorTb> doctorTbCollection;
    public static volatile CollectionAttribute<SpecializationTb, FeesTb> feesTbCollection;
    public static volatile CollectionAttribute<SpecializationTb, HospitalFacilityTb> hospitalFacilityTbCollection;
    public static volatile SingularAttribute<SpecializationTb, String> name;
    public static volatile SingularAttribute<SpecializationTb, String> description;
    public static volatile SingularAttribute<SpecializationTb, Integer> specializationId;
    public static volatile SingularAttribute<SpecializationTb, Integer> isActive;

}
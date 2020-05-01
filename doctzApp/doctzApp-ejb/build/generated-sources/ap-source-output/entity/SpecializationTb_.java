package entity;

import entity.DoctorTb;
import entity.FeesTb;
import entity.HospitalFacilityTb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-01T17:03:20")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-01T18:17:36")
>>>>>>> 915544316dc5c268de99af0a8025803a7f764596
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
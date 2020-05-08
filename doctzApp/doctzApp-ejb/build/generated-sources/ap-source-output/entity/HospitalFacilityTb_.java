package entity;

import entity.HospitalTb;
import entity.SpecializationTb;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-08T19:13:23")
@StaticMetamodel(HospitalFacilityTb.class)
public class HospitalFacilityTb_ { 

    public static volatile SingularAttribute<HospitalFacilityTb, Integer> facilityId;
    public static volatile SingularAttribute<HospitalFacilityTb, HospitalTb> hospitalId;
    public static volatile SingularAttribute<HospitalFacilityTb, SpecializationTb> specializationId;

}
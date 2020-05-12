package entity;

import entity.CityTb;
import entity.HospitalTb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-09T10:14:17")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-12T18:04:10")
>>>>>>> 923add26c3b8a9a66c1d8ace3ca62baf91969b45
@StaticMetamodel(AreaTb.class)
public class AreaTb_ { 

    public static volatile SingularAttribute<AreaTb, Integer> pincode;
    public static volatile CollectionAttribute<AreaTb, HospitalTb> hospitalTbCollection;
    public static volatile SingularAttribute<AreaTb, Integer> areaId;
    public static volatile SingularAttribute<AreaTb, String> areaName;
    public static volatile SingularAttribute<AreaTb, Double> latitude;
    public static volatile SingularAttribute<AreaTb, CityTb> cityId;
    public static volatile SingularAttribute<AreaTb, Integer> isActive;
    public static volatile SingularAttribute<AreaTb, Double> longitude;

}
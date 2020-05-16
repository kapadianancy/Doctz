package entity;

import entity.CityTb;
import entity.HospitalTb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-16T10:27:24")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-13T11:53:11")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-13T11:56:00")
>>>>>>> 3230b5225d7bfe69c9df43b428e4154eb39360b6
>>>>>>> 91f9faa7684f7c87dd7c15d9915ffe7e002d418b
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
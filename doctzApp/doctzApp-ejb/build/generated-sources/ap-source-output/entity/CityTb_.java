package entity;

import entity.AreaTb;
import entity.HospitalTb;
import entity.StateTb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-09T10:14:17")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-12T18:04:10")
>>>>>>> 923add26c3b8a9a66c1d8ace3ca62baf91969b45
@StaticMetamodel(CityTb.class)
public class CityTb_ { 

    public static volatile CollectionAttribute<CityTb, HospitalTb> hospitalTbCollection;
    public static volatile SingularAttribute<CityTb, String> cityName;
    public static volatile CollectionAttribute<CityTb, AreaTb> areaTbCollection;
    public static volatile SingularAttribute<CityTb, StateTb> stateId;
    public static volatile SingularAttribute<CityTb, Integer> cityId;
    public static volatile SingularAttribute<CityTb, Integer> isActive;

}
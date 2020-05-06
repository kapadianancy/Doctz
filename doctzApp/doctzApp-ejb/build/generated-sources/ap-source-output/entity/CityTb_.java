package entity;

import entity.AreaTb;
import entity.HospitalTb;
import entity.StateTb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-06T20:00:33")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-06T15:44:48")
>>>>>>> d9d866fc4d4652b1f7b3f80b0a2317f5b5fdf6c3
@StaticMetamodel(CityTb.class)
public class CityTb_ { 

    public static volatile CollectionAttribute<CityTb, HospitalTb> hospitalTbCollection;
    public static volatile SingularAttribute<CityTb, String> cityName;
    public static volatile CollectionAttribute<CityTb, AreaTb> areaTbCollection;
    public static volatile SingularAttribute<CityTb, StateTb> stateId;
    public static volatile SingularAttribute<CityTb, Integer> cityId;
    public static volatile SingularAttribute<CityTb, Integer> isActive;

}
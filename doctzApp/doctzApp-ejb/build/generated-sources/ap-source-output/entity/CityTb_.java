package entity;

import entity.AreaTb;
import entity.HospitalTb;
import entity.StateTb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-30T18:52:11")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-30T17:33:30")
>>>>>>> 9810d3d9b261c73e3f5474845c9f51e22c7299c7
@StaticMetamodel(CityTb.class)
public class CityTb_ { 

    public static volatile CollectionAttribute<CityTb, HospitalTb> hospitalTbCollection;
    public static volatile SingularAttribute<CityTb, String> cityName;
    public static volatile CollectionAttribute<CityTb, AreaTb> areaTbCollection;
    public static volatile SingularAttribute<CityTb, StateTb> stateId;
    public static volatile SingularAttribute<CityTb, Integer> cityId;
    public static volatile SingularAttribute<CityTb, Integer> isActive;

}
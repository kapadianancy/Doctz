package entity;

import entity.CityTb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-13T11:53:11")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-13T11:56:00")
>>>>>>> 3230b5225d7bfe69c9df43b428e4154eb39360b6
@StaticMetamodel(StateTb.class)
public class StateTb_ { 

    public static volatile CollectionAttribute<StateTb, CityTb> cityTbCollection;
    public static volatile SingularAttribute<StateTb, String> stateName;
    public static volatile SingularAttribute<StateTb, Integer> stateId;
    public static volatile SingularAttribute<StateTb, Integer> isActive;

}
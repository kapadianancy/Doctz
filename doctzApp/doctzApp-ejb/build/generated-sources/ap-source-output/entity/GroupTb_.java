package entity;

import entity.UsergroupTb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-29T20:23:27")
@StaticMetamodel(GroupTb.class)
public class GroupTb_ { 

    public static volatile SingularAttribute<GroupTb, String> groupName;
    public static volatile SingularAttribute<GroupTb, Integer> groupId;
    public static volatile CollectionAttribute<GroupTb, UsergroupTb> usergroupTbCollection;

}
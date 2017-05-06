package bean;

import bean.UserLogin;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-06T23:03:36")
@StaticMetamodel(ManageSID.class)
public class ManageSID_ { 

    public static volatile SingularAttribute<ManageSID, Boolean> isDeleted;
    public static volatile SingularAttribute<ManageSID, UserLogin> createdBy;
    public static volatile SingularAttribute<ManageSID, Date> deletedOn;
    public static volatile SingularAttribute<ManageSID, Long> id;
    public static volatile SingularAttribute<ManageSID, Date> createdOn;
    public static volatile SingularAttribute<ManageSID, UserLogin> deletedBy;
    public static volatile SingularAttribute<ManageSID, String> sid;

}
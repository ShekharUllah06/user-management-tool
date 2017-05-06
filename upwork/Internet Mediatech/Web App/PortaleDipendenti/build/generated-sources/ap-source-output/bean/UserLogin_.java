package bean;

import bean.ManageSID;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-06T23:03:36")
@StaticMetamodel(UserLogin.class)
public class UserLogin_ { 

    public static volatile CollectionAttribute<UserLogin, ManageSID> manageSIDCollection;
    public static volatile SingularAttribute<UserLogin, String> zipCode;
    public static volatile SingularAttribute<UserLogin, String> address;
    public static volatile SingularAttribute<UserLogin, String> city;
    public static volatile SingularAttribute<UserLogin, Boolean> isPasswordChangeRequired;
    public static volatile SingularAttribute<UserLogin, String> fullName;
    public static volatile SingularAttribute<UserLogin, Boolean> admin;
    public static volatile CollectionAttribute<UserLogin, ManageSID> manageSIDCollection1;
    public static volatile SingularAttribute<UserLogin, Boolean> isActive;
    public static volatile SingularAttribute<UserLogin, String> password;
    public static volatile SingularAttribute<UserLogin, Boolean> isDeleted;
    public static volatile SingularAttribute<UserLogin, Integer> createdBy;
    public static volatile SingularAttribute<UserLogin, Date> createOn;
    public static volatile SingularAttribute<UserLogin, Integer> id;
    public static volatile SingularAttribute<UserLogin, String> email;
    public static volatile SingularAttribute<UserLogin, String> username;

}
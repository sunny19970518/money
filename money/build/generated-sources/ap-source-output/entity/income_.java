package entity;

import entity.incomeKind;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-24T12:52:05")
@StaticMetamodel(income.class)
public class income_ { 

    public static volatile SingularAttribute<income, String> note;
    public static volatile SingularAttribute<income, String> itemName;
    public static volatile SingularAttribute<income, Float> money;
    public static volatile SingularAttribute<income, incomeKind> income_kind;
    public static volatile SingularAttribute<income, Long> id;
    public static volatile SingularAttribute<income, Date> Date;

}
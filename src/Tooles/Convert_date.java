package Tooles;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author hamid
 */
public class Convert_date {
    public static Date Convert(LocalDate date){

        ZoneId id=ZoneId.systemDefault();
        return java.sql.Date.from(date.atStartOfDay(id).toInstant());

    }
    public static java.sql.Date CovertToSqlDate(Date date){
        java.sql.Date d=new java.sql.Date(date.getTime());
        return d;
    }
}


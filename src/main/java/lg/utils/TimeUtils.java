package lg.utils;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 * author: LG
 * date: 2019-11-07 17:41
 * desc:
 * 时间
 */
public class TimeUtils {

    public static  String getCurrentTime(){
        return format(System.currentTimeMillis());
    }

    public static String format(long time){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        cal.setTimeInMillis(time);
        String format = formatter.format(cal.getTime());
        return format;
    }

    public static String format(Instant time){
        String format =  DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss").format(LocalDateTime.ofInstant(time, ZoneId.systemDefault()));
        return format;
    }
}

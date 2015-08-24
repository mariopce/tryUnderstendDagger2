package pl.saramak.dagger2.time;

import javax.inject.Singleton;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Created by mario on 23.08.15.
 */
@Singleton
public class WarsawTimer implements Timer {
    @Override
    public String getTime() {
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return  "WAW " +format1.format(Calendar.getInstance(TimeZone.getTimeZone("Europe/Warsaw")).getTime());
    }
}

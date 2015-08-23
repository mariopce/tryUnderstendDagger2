package pl.saramak.dagger2.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Created by mario on 23.08.15.
 */
public class LondonTimer implements Timer {
    @Override
    public String getTime() {
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return "Londyn " + format1.format(Calendar.getInstance(TimeZone.getTimeZone("Europe/London")).getTime());
    }
}

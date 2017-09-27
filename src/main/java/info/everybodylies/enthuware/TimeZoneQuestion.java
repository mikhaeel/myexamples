package info.everybodylies.enthuware;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeZoneQuestion {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("zzzz");
        System.out.println(sdf.format(new Date()));

    }
}

package info.everybodylies.format;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class DateFormatExamples {
    private static final List<Integer> formatTypeList = Arrays.asList(DateFormat.SHORT, DateFormat.MEDIUM, DateFormat.LONG, DateFormat.FULL);
    private static final List<DateFormat> dateFormat = Arrays.asList(
            DateFormat.getDateInstance(),
            DateFormat.getDateInstance(DateFormat.SHORT),
            DateFormat.getDateInstance(DateFormat.MEDIUM),
            DateFormat.getDateInstance(DateFormat.LONG),
            DateFormat.getDateInstance(DateFormat.FULL)
    );
    private static final List<DateFormat> dateTimeFormat = Arrays.asList(
            DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT),
            DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM),
            DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG),
            DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL),
            DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT),
            DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM),
            DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG),
            DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL),
            DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT),
            DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM),
            DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG),
            DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.FULL),
            DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.SHORT),
            DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM),
            DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.LONG),
            DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL)
    );

    public static void main(String[] args) {
        DateFormat simpleDateFormat = DateFormat.getInstance();
        Calendar calendar = Calendar.getInstance();
        System.out.println("DateFormat.getInstance() (equal DateFormat.getDateTimeInstance(SHORT, SHORT))\n" + simpleDateFormat.format(calendar.getTime()) + "\n");
        for(DateFormat dateFormatInstance : dateFormat) {
            System.out.println(dateFormatInstance.format(calendar.getTime()));
        }
        System.out.println("\n");
        for(DateFormat dateTimeFormatInstance : dateTimeFormat) {
            System.out.println(dateTimeFormatInstance.format(calendar.getTime()));
        }
    }

}

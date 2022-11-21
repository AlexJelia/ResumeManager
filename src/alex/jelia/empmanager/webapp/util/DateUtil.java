package alex.jelia.empmanager.webapp.util;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    public static final LocalDate NOW = LocalDate.of(3000, 1, 1);
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("MM/yyyy");

    public static LocalDate of(int year, Month month) {
        return LocalDate.of(year,month,1);
    }

    public static String format(LocalDate date){
        if(date == null) return "";
        return date.equals(NOW) ? "Now" : date.format(DATE_FORMATTER);
    }

    public static LocalDate parse(String date) {
        if (HtmlHelper.isEmpty(date) || "Now".equals(date)) return NOW;
        YearMonth yearMonth = YearMonth.parse(date, DATE_FORMATTER);
        return LocalDate.of(yearMonth.getYear(), yearMonth.getMonth(), 1);
    }
}

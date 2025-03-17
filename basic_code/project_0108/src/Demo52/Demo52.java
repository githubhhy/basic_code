package Demo52;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Demo52 {
    public static void main(String[] args) throws ParseException {
        //JDK7计算天数
        String birthday = "2002年3月29日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date1 = sdf.parse(birthday);
        long time1 = date1.getTime();

        long time2 = System.currentTimeMillis();
        //System.out.println(time1+","+time2);
        System.out.println((time2-time1)/1000/60/60/24);

        //JDK8计算天数
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2002, 3, 29);
        long d = ChronoUnit.DAYS.between(ld2, ld1);
        System.out.println(d);
    }
}

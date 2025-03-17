package Demo53;

import java.time.LocalDate;
import java.util.Calendar;

public class Demo53 {
    public static void main(String[] args) {
        /*
        判断任意一个年份是闰年还是平年
         */

        //思路1：JDK7 2000年1月1日0：0：0   12月31日23：59：59      计算间隔366天
        //思路2：JDK7 200年2月1日0：0：0   3月1日0：0：0           计算29天
        //思路3：设置日期3月1日，日历往前减一天，看是29还是28号
        Calendar c = Calendar.getInstance();
        c.set(2000, 2, 1);//设为3月1日
        c.add(Calendar.DAY_OF_MONTH, -1);
        int day = c.get(Calendar.DAY_OF_MONTH);
        if (day == 29) {
            System.out.println("是闰年");
        } else 
            System.out.println("是平年");
        //思路4：设置日期2001年1月1日，日历往前减一天，统计这一天是第366天还是365
        

        //JDK8
        LocalDate d = LocalDate.of(2000, 3, 1);
        LocalDate d2 = d.minusDays(1);
        if (d2.getDayOfMonth() == 29) {
            System.out.println("是闰年");
        } else
            System.out.println("是平年");

        //使用自带方法
        System.out.println(d.isLeapYear()? "是闰年":"是平年");
    }
}

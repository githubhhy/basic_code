package Demo35;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){}

    public static int getMaxage(ArrayList<Student> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            int tempage = list.get(i).getAge();
            if (tempage>max) {
                max = tempage;
            }
        }
        return max;
    }
}

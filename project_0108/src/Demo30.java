import java.util.ArrayList;

public class Demo30 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i*10+1);
        }
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size()-1)
                System.out.print(list.get(i));    
            else
                System.out.print(list.get(i)+", ");
        }
        System.out.println("]");
    }
}

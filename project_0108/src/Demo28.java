import java.util.StringJoiner;

public class Demo28 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("---");
        String[] arr = {"aaa","bbb","ccc"};
        for (String arr2 : arr) {
            sj.add(arr2);
        }
        System.out.println(sj.toString());
    }
}

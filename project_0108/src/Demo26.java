import java.util.Scanner;

public class Demo26 {
    public static void main(String[] args) {
        // StringBuilder是一个容器,其内容可变,可以提高字符串的操作效率 
        StringBuilder sb = new StringBuilder("hhy");
        sb.append(1);
        sb.append("hello");
        sb.reverse();

        System.out.println(sb);

        sb.reverse();
        String str = sb.toString();
        System.out.println(str);

        StringBuilder str1 = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String str2 = scanner.next();
        str1.append(str2);
        str1.reverse();
        if( str2.equals(    str1.toString() )    )
            System.out.println("对称");
        else
            System.out.println("不对称");
    }   
}

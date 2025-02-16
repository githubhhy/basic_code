import java.util.Random;
//随机生成验证码
public class Demo16 {
    public static void main(String[] args) {
        char[] dic = new char[52];
        for (int i = 0; i < dic.length; i++) {
            if (i < 26)
                dic[i] = (char)(97+i);
            else
                dic[i] = (char)(65+i-26);
        }

        String result = "";
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = random.nextInt(dic.length);//[0,52)
            //System.out.println(randomIndex);
            result = result + dic[randomIndex];
        }
        result = result + random.nextInt(10);//[0,10)
        System.out.println(result);
    }
}

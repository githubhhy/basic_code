

import java.util.Random;

public class Demo19 {
    public static void main(String[] args) {
        int[] array = {2,88,888,1000,9999};
        int[] newarray = new int[array.length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndex = random.nextInt(array.length);//[0,5)
            int prize = array[randomIndex];
            boolean flag = contains(newarray,prize);
            newarray[i] = prize;
            if (flag){
                i--;
            }
                
        }
        for (int i = 0; i < newarray.length; i++) {
            System.out.println(newarray[i]);
        }

    }

    
    public static boolean contains(int[] array, int prize) {
        for (int i = 0; i < array.length; i++) {
            if(prize == array[i])
                return true;
        }
        return false;
    }
}

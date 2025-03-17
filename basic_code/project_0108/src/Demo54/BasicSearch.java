package Demo54;

public class BasicSearch {
    public static void main(String[] args) {
        //基本查找
        //二分查找
        //分块查找
        //插值查找
        //斐波那契查找
        //数表查找
        //哈希查找

        
        int[] arr = {131,127,147,81,103,23,7,79};

        System.out.println(basicSearch(arr, 147));
        
    }
    //基本查找
    public static int basicSearch(int[] arr, int a){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            if (arr[i] == a) {
                System.out.println("查找了: "+count+" 次");
                return i;
            }
        }
        System.out.println("查找了: "+count+" 次");
        return -1;
    }

    
}

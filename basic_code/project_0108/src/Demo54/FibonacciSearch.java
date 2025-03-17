package Demo54;

public class FibonacciSearch {
    public static void main(String[] args) {
        //插值查找就是在二分查找的基础上，对mid的计算方式进行了优化
        //mid = min+黄金分割点左半边长度-1

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 3;
        System.out.println(fibonacciSearch(arr, target));
    }

    public static int fibonacciSearch(int[] arr, int target){
        //生成斐波那契数列，找到最接近且大于等于n的数值
        int[] fibonacci = generateFibonacci(arr.length);
        int k =0;
        while (fibonacci[k]<arr.length) {
            k++;
        }

        //将数组扩展到斐波那契数列的长度
        int[] temp = new int[fibonacci[k]];
        System.arraycopy(arr, 0, temp, 0, arr.length);

        //查找过程
        int left = 0;
        int right = arr.length-1;
        int count=0;
        while (left<=right) {
            int mid = left+fibonacci[k-1]-1;
            count++;
            if (temp[mid]==target) {
                System.out.println("查找了: "+count+" 次");
                return mid;
            }else if (temp[mid]>target) {
                right = mid-1;
                k=k-1;
            } else if (temp[mid]<target) {
                left = mid+1;
                k=k-2;
            }
        }
        System.out.println("查找了: "+count+" 次");
        return -1;
    }

    //生成长度为n的斐波那契数列，0---->n-1
    private static int[] generateFibonacci(int n){
        int[] fibonacci = new int[n];
        fibonacci[0]= 0;
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
        }
        return fibonacci;
    }
}

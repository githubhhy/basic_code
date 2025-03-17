package Demo54;

public class InterpolationSearch {
    public static void main(String[] args) {
        //插值查找就是在二分查找的基础上，对mid的计算方式进行了优化
        //适用于分布比较均匀的数据中，能够更准确地估计目标值的位置
        //缺点就是，当分布不均匀时，性能甚至会变差

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 3;
        System.out.println(interpolationSearch(arr, target));

    }
    public static int interpolationSearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        int mid;
        int count=0;
        while (left<= right) {
            mid = left + (target-arr[left])*(right-left)/(arr[right]-arr[left]);
            count++;
            if (arr[mid]==target) {
                System.out.println("查找了: "+count+" 次");
                return mid;
            }else if (arr[mid]>target) {
                right = mid-1;
            }else if (arr[mid]<target) {
                left = mid+1;
            } 
        }
        System.out.println("查找了: "+count+" 次");
        return -1;
    }
}

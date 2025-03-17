package Demo54;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 3;

        System.out.println(binarySearch(arr, target));

    }
    //二分查找
    public static int binarySearch(int[] arr, int target){
        int left=0;
        int right = arr.length-1;
        int mid = (left+right)/2;
        int count=0;
        while (left<=right) {
            mid = (left+right)/2;
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

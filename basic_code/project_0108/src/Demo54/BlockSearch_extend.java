package Demo54;

public class BlockSearch_extend {
    public static void main(String[] args) {
        //块查找的改进
        //块与块之间，没有重叠的范围

        int[] arr = {   27,22,30,40,36,
                        13,19,16,20,
                        7,10,
                        43,50,48    };
        Block1 bk1 = new Block1(22, 40, 0, 4);
        Block1 bk2 = new Block1(13, 20, 5, 8);
        Block1 bk3 = new Block1(7, 10, 9, 10);
        Block1 bk4 = new Block1(43, 50, 11, 13);

        //定义块索引
        Block1[] blockarr = { bk1, bk2, bk3 ,bk4};
        int target = 16;
        int index = findIndex(blockarr, arr, target);
        System.out.println(index);

    }

    public static int findIndex(Block1[] blockarr,int[] arr,int target){
        int suoyin = findblock(blockarr, target);
        if (suoyin == -1) {
            return -1;
        }
        for (int i = blockarr[suoyin].getStartIndex(); i <= blockarr[suoyin].getEndIndex(); i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int findblock(Block1[] blockarr,int target){
        for (int i = 0; i < blockarr.length; i++) {
            if ( target >= blockarr[i].getMin() && target <= blockarr[i].getMax() ) {
                return i;
            }
        }
        return -1;
    } 
}

class Block1{
    private int min;        //块的最小值
    private int max;        //块的最大值
    private int startIndex; //开始索引
    private int endIndex;   //结束索引

    public Block1() {
    }
    public Block1(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }
    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        this.max = max;
    }
    public int getStartIndex() {
        return startIndex;
    }
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }
    public int getEndIndex() {
        return endIndex;
    }
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}

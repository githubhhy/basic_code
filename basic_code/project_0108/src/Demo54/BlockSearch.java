package Demo54;

public class BlockSearch {
    public static void main(String[] args) {
        // 分块查找
        // 分块原则：前一块中的所有数据小于后一块中的所有数据（块内无序，快间有序）
        // 块数一般等于数字的个数开根号，比如16个数字分为4块
        // 先确定在哪一块，再在块内查找

        int[] arr = {
                16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66
        };
        // 分块
        Block b1 = new Block(21, 0, 6);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        // 定义数组管理三个对象（索引表）
        Block[] blockarr = { b1, b2, b3 };
        int target = 34;
        int index = getIndex(blockarr, arr,target);
        System.out.println(index);

    }

    private static int getIndex(Block[] blockarr, int[]arr,int target){
        int suoyin = findblock(blockarr, target);
        if (suoyin != -1) {
            for (int i = blockarr[suoyin].getStartIndex(); i <= blockarr[suoyin].getEndIndex(); i++) {
                if (arr[i] == target) {
                    return i;
                }else {
                    continue;
                }
            }

        }
        return -1;
    } 

    public static int findblock(Block[] arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getMax() >= target) {
                return i;
            }else if (arr[i].getMax() < target) {
                continue;
            }
        }

        return -1;
    }
}

class Block {
    private int max;
    private int startIndex;
    private int endIndex;

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}
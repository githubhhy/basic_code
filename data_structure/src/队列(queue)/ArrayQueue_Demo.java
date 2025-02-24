import javax.management.RuntimeErrorException;

public class ArrayQueue_Demo {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        arrayQueue.addQueue(10);
        arrayQueue.addQueue(5);
        System.out.println("");
        arrayQueue.showQueue();
        arrayQueue.addQueue(4);
    }
    
}

class ArrayQueue{
    private int maxSize;
    private int[] arr;
    private int front;
    private int rear;


    public int getFront() {
        return front;
    }
    public int getRear() {
        return rear;
    }

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1;//指向队列头部的前一个位置
        rear = -1;//指向队列尾部(就是队列最后一个数据)
    }
    public boolean isFull(){
        return rear == maxSize-1;
    }
    public boolean isEmpty(){
        return rear == front;
    }
    public boolean addQueue(int num){
        if (isFull()) {
            System.out.println("队列满，添加失败");
            return false;
        }
        rear++;
        arr[rear] = num;

        return true;
    }
    public int getQueue(){
        if (isEmpty()) {
            System.out.println("队列为空");
            throw new RuntimeException("队列空，不能取数据");
        }
        front++;
        return arr[front];
    }
    public void showQueue(){
        if (isEmpty()) {
            System.out.println("队列为空，没有数据");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d",i,arr[i]);
        }

    }
    public int peekQueue(){
        if (isEmpty()) {
            System.out.println("队列空，不能查看头数据");
            throw new RuntimeException("队列空，不能查看头数据");
        }
        return arr[front+1];
    }
}
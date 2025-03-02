import java.util.Scanner;

public class ArrayQueue_Demo2 {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(4);//队列长度为3，空用一个元素
        boolean loop = true;
        while (loop) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("a: 添加");
            System.out.println("g: 获取");
            System.out.println("p: 查看队列头");
            System.out.println("s: 展示队列");
            System.out.println("e: 退出");
            char select = scanner.nextLine().charAt(0);
            switch (select) {
                case 'a':
                    try {
                        System.out.println("请输入一个数");
                        int num = scanner.nextInt();
                        scanner.nextLine();
                        arrayQueue.addQueue(num);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'g':
                    try {
                        System.out.println("取出的数为："+arrayQueue.getQueue());;
                    } catch (Exception e) { 
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'p':
                    try {
                        System.out.println("队列头的数为："+arrayQueue.peekQueue());;
                    } catch (Exception e) { 
                        System.out.println(e.getMessage());
                    }
                    break;     
                case 's':
                    arrayQueue.showQueue();
                    break; 
                case 'e':
                    loop = false;
                    System.out.println("退出成功");
                    break;                                   
                default:
                    break;
            }
        }
    }
}


class ArrayQueue{
    private int maxSize;
    private int[] arr;
    private int front;
    private int rear;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = 0;//指向队列头部，第一个元素
        rear = 0;//指向队列尾部的后一个位置，最后一个元素的后一个位置
        //同时约定，空出一个空间。即如果maxSize = 4 ,那么队列长度为3
        //为什么要约定空出一个空间呢？
        /*
         * 循环队列中，由于入队时尾指针向前追赶头指针，出队时头指针向前追赶尾指针
         * 造成队空和队满时头尾指针均相等。
         * 因此，无法通过条件front==rear来判别队列是"空"还是"满"
         */
    }
    public boolean isFull(){
        return ( (rear+1)%maxSize == front );
    }
    public boolean isEmpty(){
        return rear == front;
    }
    public boolean addQueue(int num){
        if (isFull()) {
            throw new RuntimeException("队列满，添加失败");
        }
        arr[rear] = num;
        rear = (rear+1)%maxSize;
        
        return true;
    }
    public int getQueue(){
        if (isEmpty()) {
            throw new RuntimeException("队列空，不能取数据");
        }
        int value = arr[front];
        front = (front+1)%maxSize;
        return value;
    }
    public void showQueue(){
        if (isEmpty()) {
            System.out.println("队列为空，没有数据");
            return;
        }
        for (int i = front; i < front+howMany(); i++) {
            System.out.printf("arr[%d] = %d\n",i%maxSize,arr[i%maxSize]);
        }

    }
    public int peekQueue(){
        if (isEmpty()) {
            throw new RuntimeException("队列空，不能查看头数据");
        }
        return arr[front];
    }
    public int howMany(){
        return (rear-front+maxSize)%maxSize;
    }
}
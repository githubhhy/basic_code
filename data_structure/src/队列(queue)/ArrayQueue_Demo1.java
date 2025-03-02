import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class ArrayQueue_Demo1 {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
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
            throw new RuntimeException("队列满，添加失败");
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
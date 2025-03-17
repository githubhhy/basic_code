package Demo50;

import java.io.IOException;
import java.lang.Runtime;
public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        /*
            public static Runtime getRuntime()      当前系统的运行环境对象
            public void exit(int status)            停止虚拟机
            public int availableProcessors()        获取CPU的线程数
            public long maxMemory()                 JVM能从系统中获取的总内存大小（Byte）
            public long totalMemory()               JVM已经获取的内存大小
            public long freeMemory()                JVM剩余内存大小
            public Process exex(String command)     运行cmd命令
         */

        //1、
        Runtime r1 = Runtime.getRuntime();
        System.out.println(r1);

        //2、
        //Runtime.getRuntime().exit(0);

        //3、
        System.out.println(Runtime.getRuntime().availableProcessors());

        //4、
        System.out.println(Runtime.getRuntime().maxMemory()/1014/1024);

        //5、
        System.out.println(Runtime.getRuntime().totalMemory()/1014/1024);

        //6、
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);

        //7、
        Runtime.getRuntime().exec("notepad");
        
    }
}

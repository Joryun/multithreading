package chapter1.daemonThread;

/**
 * Created by joryun on 2017/5/7.
 *
 * 测试类：守护线程
 *
 * 结果分析：
 * Daemon的作用是为其它线程的运行提供便利服务，当进程中不存在非守护进程，
 * 则守护进程自动销毁。守护线程的典型应用是GC（垃圾回收器）。
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("我离开thread对象也不再打印了，也就是停止了！");

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

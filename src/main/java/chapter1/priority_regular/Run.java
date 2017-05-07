package chapter1.priority_regular;

/**
 * Created by joryun on 2017/5/7.
 *
 * 测试类：线程优先级的规则性
 *
 * 结果分析：
 * 线程的优先级与代码执行顺序无关，结果显示某一线程的优先级很高，说明线程的优先级
 * 具有一定的规则性，CPU会尽量将执行资源让给优先级比较高的线程
 */
public class Run {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
             MyThread1 thread1 = new MyThread1();
             thread1.setPriority(10);
             thread1.start();

             MyThread2 thread2 = new MyThread2();
             thread2.setPriority(1);
             thread2.start();
        }
    }
}

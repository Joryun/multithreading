package chapter1.suspend_resume_LockStop;

/**
 * Created by joryun on 2017/5/7.
 *
 * 测试类：suspend与resume的缺点 —— 独占
 *
 * 输出结果分析：
 * 当程序运行到pringtln()方法内部停止时，同步锁未被释放。
 *
 */
public class Run {

    public static void main(String[] args) {

        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main end!");

        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

package chapter1.suspend_resume_LockStop;

/**
 * Created by joryun on 2017/5/7.
 *
 * 线程类
 */
public class MyThread extends Thread {

    private long i = 0;

    @Override
    public void run() {
        while (true){
            i++;
            System.out.println(i);
        }
    }
}

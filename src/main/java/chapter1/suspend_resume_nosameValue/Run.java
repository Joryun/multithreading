package chapter1.suspend_resume_nosameValue;

/**
 * Created by joryun on 2017/5/7.
 *
 * 测试类：suspend与resume方法的缺点 —— 不同步
 *
 *
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {

        final MyObject myObject = new MyObject();

        Thread thread1 = new Thread(){
            public void run(){
                myObject.setValue("a", "aa");
            }
        };

        thread1.setName("a");
        thread1.start();
        Thread.sleep(500);

        Thread thread2 = new Thread(){
            public void run(){
                myObject.printUsernamePassword();
            }
        };

        thread2.start();
    }
}

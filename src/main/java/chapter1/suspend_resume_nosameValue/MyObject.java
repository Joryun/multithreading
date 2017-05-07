package chapter1.suspend_resume_nosameValue;

/**
 * Created by joryun on 2017/5/7.
 * <p>
 * 线程类
 */
public class MyObject extends Thread {

    private String username = "1";
    private String password = "11";

    public void setValue(String u, String p) {
        this.username = u;
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("停止a线程！");
            Thread.currentThread().suspend();
        }
        this.password = p;
    }

    public void printUsernamePassword(){
        System.out.println(username+ " "+ password);
    }
}

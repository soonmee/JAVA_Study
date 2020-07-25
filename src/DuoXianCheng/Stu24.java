package DuoXianCheng;

/**
 * suspend()方法：暂时挂起线程
 * resume()方法：回复挂起的线程
 * stop()方法：停止线程
 *
 * 不推荐使用，这 3 种方法会产生死锁问题
 *
 * 可以通过设置标志位的方法停止线程
 */

class MyThread6 implements Runnable{
    private boolean flag = true;
    public void run(){
        int i = 0;
        while (this.flag){
            while (true){
                System.out.println(Thread.currentThread().getName() + "运行，i = " + (i++));
            }
        }
    }
    public void stop(){
        this.flag = false;
    }
}
public class Stu24 {
    public static void main(String[] args) {
        MyThread6 myThread6 = new MyThread6();
        Thread m6 = new Thread(myThread6,"线程");
        m6.start();
        myThread6.stop();
    }
}

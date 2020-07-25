package DuoXianCheng;

/**
 * 同步与死锁
 *
 * 同步
 * 解决资源共享的同步操作，有同步代码块和同步方法两种方式
 *
 * 同步代码块
 * 在代码块之前加 synchronized 关键字，则表示为同步代码块
 * synchronized (对象){
 *      同步代码;
 *  }
 *
 * 同步方法
 * 使用 synchronized 将一个方法声明为同步方法
 * synchronized 方法返回值 方法名（参数）{
 *
 * }
 *
 * 死锁
 * 过多的同步可能产生死锁，两个线程都等待对方先完成才能继续
 *
 *
 */
/*同步代码块
class MyThread5_1 implements Runnable {
    private int ticket = 5;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            synchronized (this){//设置同步操作
                if (ticket > 0){//判断是否有余票
                    try {
                        Thread.sleep(300);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("卖票：ticket = " + ticket--);
                }
            }
        }
    }
}
*/
//同步方法
class MyThread5_1 implements Runnable{
    private  int ticket = 5;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            this.sale();
        }
    }

    private synchronized void sale() {
        if (ticket > 0){
            try {
                Thread.sleep(300);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("卖票：ticket = " + ticket--);
        }
    }

}

public class Stu23 {
    public static void main(String[] args) {
        MyThread5_1 myThread5_1 = new MyThread5_1();
        Thread t1 = new Thread(myThread5_1);
        Thread t2 = new Thread(myThread5_1);
        Thread t3 = new Thread(myThread5_1);
        t1.start();
        t2.start();
        t3.start();
    }
}

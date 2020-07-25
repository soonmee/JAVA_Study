package DuoXianCheng;

/**
 * 线程的状态：创建、就绪start()、运行run()、阻塞sleep()、suspend()、wait()、终止stop()、run()方法结束
 *
 * 线程优先级越高越有可能先执行，可以使用setPriority()方法设置优先级
 * MIN_PRIORITY 最低(常量1)  NORM_PRIORITY 中等(常量5)  MAX_PRIORITY 最高(常量10)
 * mythread.setPriority(Thread.MAX_PRIORITY)  设置优先级
 *
 * 可以使用yield()方法暂停一个线程，暂时让其他线程运行
 * Thread.currentThread().yield()
 */

class MyThread3 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 3; i++){
            try {
                Thread.sleep(500);                                //线程休眠，需要异常处理
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "运行：" + i);
        }


    }
}
public class Stu21 {
    public static void main(String[] args) {
        MyThread3 myThread3_1 = new MyThread3();
        Thread thread3_1 = new Thread(myThread3_1,"线程");
        System.out.println(thread3_1.isAlive());                        //判断线程是否启动
        thread3_1.start();
        System.out.println(thread3_1.isAlive());
//      thread3_1.join();                                               强制该线程运行，其他线程等待该线程运行结束才继续运行

    }
}

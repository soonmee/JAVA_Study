package DuoXianCheng;

/**
 * 多线程 -- 可以同时运行不同的代码块
 * 两种方法：一是继承Thread类，二是实现Runnable接口
 *
 * Thread类：一个类只要继承了Thread类，就必须覆写Thread类的run()方法，此方法为线程的主体
 * 要正确的运行多线程，不能直接调用run()方法，要调用从Thread类继承来的start()方法
 * 如果一个类通过继承Thread类实现，只能调用一次start()方法
 *
 * Runnable接口：实现Runnable接口，就必须覆写run()方法
 * Runnable接口只有run()方法，没有start()方法，要启动必须依靠Thread类的run()方法
 *
 * Thread类也实现了Runnable接口
 * 一个类继承Thread类，则无法实现资源共享，实现Runnable接口则可以
 *
 * Runnable接口优势：
 * 1、适合资源共享；2、避免多继承特性的局限性；3、增强了代码的健壮性
 */

class MyThread extends Thread{
    private String name;
    public MyThread(String name){
        this.name = name;
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println(name + "运行，i = " + i);
        }
    }
}

class MyThread2 implements Runnable{
    private String name;
    public MyThread2(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(name + "运行，i = " + i);
        }
    }
}

public class Stu20 {
    public static void main(String[] args) {
//        MyThread myThread1_1 = new MyThread("线程A");
//        MyThread myThread1_2 = new MyThread("线程B");
//        myThread1_1.start();
//        myThread1_2.start();
        MyThread2 myThread2_1 = new MyThread2("线程A");
        MyThread2 myThread2_2 = new MyThread2("线程B");
        Thread thread1 = new Thread(myThread2_1);
        Thread thread2 = new Thread(myThread2_2);
        thread1.start();
        thread2.start();
    }
}
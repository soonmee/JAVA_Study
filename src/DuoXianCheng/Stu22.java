package DuoXianCheng;

/**
 * 生成3个线程ABC，分别设置不同的休眠时间
 */

/*方法一：继承Thread类
class MyThread4 extends Thread{
    private int time;
    public MyThread4(String name, int time){
        super(name);
        this.time = time;
    }

    @Override
    public void run(){
        try {
            Thread.sleep(this.time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "线程，休眠" + this.time);
    }
}
*/
//方法二：实现Runnable接口，因为没有name，所以要定义
class MyThread4 implements Runnable{
    private String name;
    private int time;
    public MyThread4(String name, int time){
        this.name = name;
        this.time = time;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(this.time);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(this.name + "线程，休眠" + this.time);
    }
}
public class Stu22 {
    public static void main(String[] args) {
/*方法一：继承Thread类
        MyThread4 myThread4_1 = new MyThread4("A",10);
        MyThread4 myThread4_2 = new MyThread4("B",20);
        MyThread4 myThread4_3 = new MyThread4("C",30);
        myThread4_1.start();
        myThread4_2.start();
        myThread4_3.start();
*/
//方法二：实现Runnable接口
        MyThread4 myThread4_1 = new MyThread4("A",10);
        MyThread4 myThread4_2 = new MyThread4("B",20);
        MyThread4 myThread4_3 = new MyThread4("C",30);
        new Thread(myThread4_1).start();
        new Thread(myThread4_2).start();
        new Thread(myThread4_3).start();
    }
}

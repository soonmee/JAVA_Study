package JieKou;

/**
 * 接口的初步学习
 * 接口中只有全局变量和抽象方法
 * 接口必须覆写所有的抽象方法
 * 接口可以继承多个接口，不能继承抽象类
 * 抽象类可以对应接口
 */
interface Person3_1{
    String Author = "张三";
    void print();
    String getInfo();
}

interface Person3_2{
    String Author = "张三2";
    public void say();
}

class Student3 implements Person3_1,Person3_2{
    public void print(){
        System.out.println("作者：" + Person3_1.Author);
    }

    public String getInfo(){
        return "Hello";
    }

    public void say(){
        System.out.println("Hello World!");
    }
}

public class Stu3 {
    public static void main(String[] args) {
        Student3 student3 = new Student3();
        String str = student3.getInfo();
        System.out.println(str);
        student3.print();
        student3.say();
    }
}
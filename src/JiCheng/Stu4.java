package JiCheng;

/**
 *  instanceof
 *  用于判断对象是哪个类的实例
 *  对象  instanceof  类   --> 返回 true 或者 false
 */
class A{
    public void fun1(){
        System.out.println("A--> public void fun1()");
    }

    public void fun2(){
        this.fun1();
    }
}

class B extends A{
    public void fun1(){
        System.out.println("B--> public void fun1()");
    }

    public void fun3(){
        System.out.println("B--> public void fun3()");
    }
}


public class Stu4 {
    public static void main(String[] args) {
        A a1 = new B();
        System.out.println("A a1 = new B() ：a1 instanceof A：" + (a1 instanceof A));     //true
        System.out.println("A a1 = new B() ：a1 instanceof B：" + (a1 instanceof B));     //true
        A a2 = new A();
        System.out.println("A a2 = new A() ：a2 instanceof A：" + (a2 instanceof A));     //true
        System.out.println("A a2 = new A() ：a2 instanceof B：" + (a2 instanceof B));     //flase

    }
}

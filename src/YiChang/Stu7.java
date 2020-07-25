package YiChang;

/**
 * 链式异常
 * 同最初异常一起抛出一个新异常（带有附加信息）
 */
public class Stu7 {
    public static void main(String[] args) {
        try {
            method1();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void method1() throws Exception{
        try {
            method2();
        }catch (Exception ex){
            throw new Exception("新的info来自method1" + ex);
        }
    }

    public static void method2() throws Exception{
        throw new Exception("新的info来自method2");
    }
}
/**
 * main方法调用method1，method1调用method2
 * method2抛出一个异常，被method1捕获并包装成一个新的异常抛出
 * 新的异常被main方法捕获，然后输出第10行的结果：
 * 首先显示从method1抛出的新异常，然后显示从method2抛出的异常
 */

/**
 * 自定义异常类
 * 继承Exception类或其子类来自定义一个异常类
 */
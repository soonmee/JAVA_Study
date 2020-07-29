package FanXing;

import java.security.PublicKey;

/**
 * 泛型定义
 * [访问权限] class 类名称 <泛型类型标识1,泛型类型标识2...>{
 *     [访问权限] 泛型类型 属性;
 *     public 泛型类型 getter(){ }
 *     public 泛型类型 setter(泛型类型 变量){ }
 *  }
 * 泛型也可以定义在构造方法中
 *
 */

//声明泛型
class Point<T>{
    private T var;
    public T getVar(){
        return this.var;
    }
    public void setVar(T var){
        this.var = var;
    }
}
//指定多个泛型类型
class Notepad<K,V>{
    private K key;
    private V value;
    public K getKey(){
        return key;
    }
    public void setKey(K key){
        this.key = key;
    }
    public V getValue(){
        return value;
    }
    public void setValue(V value){
        this.value = value;
    }
}
/*
 * 受限泛型，上限与下限
 * 设置上限：
 * 声明对象： 类名称<? extends 类> 对象名称
 * 定义类：  [访问权限] class 类名称<泛型标识 extends 类>{}
 *
 * 设置下限：
 * 声明对象： 类名称<? super 类> 对象名称
 * 定义类：  [访问权限] class 类名称<泛型标识 extends 类>{}
 */
//类定义时设置上限
class Info<T extends Number>{
    //只能接收数字类型
}
//类定义时设置下限
class Info2<T extends String>{
    //只能接收 String类型或 Object类型
}
//泛型接口
interface Info3<T>{
    public T getVar();
}
//子类定义方式1——在子类的定义声明泛型类型
class InfoExample<T> implements Info3<T>{
    private T var;
    public InfoExample(T var){
        this.setVar(var);
    }
    public void setVar(T var){
        this.var = var;
    }
    @Override
    public T getVar(){
        return this.var;
    }
}
//子类定义方式2——直接在接口中指定泛型类型
class InfoExample2 implements Info3<String>{
    private String var;
    public InfoExample2(String var){
        this.setVar(var);
    }

    private void setVar(String var) {
        this.var = var;
    }
    @Override
    public String getVar() {
        return this.var;
    }
}
//泛型方法
class Demo{
    public<T> T fun(T t){      //可以接收任意类型的数据
        return t;
    }
}
//调用泛型方法的main方法
//main{
// Demo d = new Demo();
// String str = d.fun("张三");    //传递字符串
// int i = d.fun(30);            //传递数字，自动装箱
// System.out.println(str);      //输出
// System.out.println(i);
// }

//泛型数组
//使用泛型方法时，可以传递或返回一个泛型数组
// public static <T> T[] fun1(T...arg){     //接收可变参数，返回泛型数组
//      return arg;
// }

//泛型的嵌套设置
//class Info<T,V>   //指定两个泛型类型
//class Demo<S>     //指定一个泛型类型
//main方法中可以
//  Demo<Info<String, Integer>> d = null;     //将Info作为Demo的泛型类型
//  Info<String , Integer> i = null;          //Info要指定两个泛型类型
//  i = new Info<String, Integer>("张三",30);
//  d = new Demo<Info<String, Integer>>(i);     //在Demo类中设置Info类对象
//  System.out.println("内容一：" + d.getInfo().getVar());
//  System.out.println("内容二：" + d.getInfo().getValue());
//  输出：
// 内容一：张三
// 内容二：30

public class Stu25 {
    public static void main(String[] args) {
/*
 * 泛型应用时，最好指定其内部的数据结构类型
 * 例： Point<Integer> point = new Point<Integer>();
 * 否则会弹出安全警告，即使能运行
*/
        Point<Integer> point = new Point<>();
        point.setVar(100);
        System.out.println(Math.sqrt(point.getVar()));
        Point<String> point1 = new Point<>();
        point1.setVar("Hello");
        System.out.println(point1.getVar());
//多个泛型类型的实例
        Notepad<String,Integer> notepad = new Notepad<>();
        notepad.setKey("张三");
        notepad.setValue(22);
        System.out.println("姓名：" + notepad.getKey() + "\t年龄：" + notepad.getValue());

    }
    /*
    通配符 “?” 表示接收此类型的任意泛型对象，不能设置被泛型指定的内容
     */
    //使用通配符“?”
    public static void fun(Point<?> temp){
        System.out.println("内容：" + temp);
    }
    //接收Point对象，范围上线设置为 Number，只能接收数字类型
    public static void fun1(Point<? extends Number> temp){
        System.out.println(temp);
    }
    //接收Info对象，只能接收String或Object类型的泛型
    public static void fun2(Info2<? super String> temp){
        System.out.println(temp);
    }

}

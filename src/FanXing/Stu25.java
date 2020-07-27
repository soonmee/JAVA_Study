package FanXing;


/**
 * 泛型定义
 * [访问权限] class 类名称 <泛型类型标识1,泛型类型标识2...>{
 *     [访问权限] 泛型类型 属性;
 *     public 泛型类型 getter(){ }
 *     public 泛型类型 setter(泛型类型 变量){ }
 *  }
 * 泛型也可以定义在构造方法中
 *
 * 多个泛型类型定义
 *
 * 泛型应用时，最好指定其内部的数据结构类型
 * 例： Point<Integer> point = new Point<Integer>();
 * 否则会弹出安全警告，即使能运行
 *
 * 通配符 “?” 表示接收此类型的任意泛型对象
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
//
public class Stu25 {
    public static void main(String[] args) {
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
}

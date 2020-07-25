import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ArrayList类
 * 可以用来存储不限定个数的对象
*/

public class Stu5 {
    public static void main(String[] args) {
        /*创建城市列表，并尝试列表的一些功能*/
        ArrayList<String> cityList = new ArrayList<>();
        //添加城市
        cityList.add("重庆");
        cityList.add("四川");
        cityList.add("北京");
        cityList.add("上海");
        cityList.add("广州");
        cityList.add("南京");

        System.out.println("有几个城市？" + cityList.size());
        System.out.println("重庆在列表里吗？" + cityList.contains("重庆"));
        System.out.println("上海在列表里的第几个？" + cityList.indexOf("上海"));

        cityList.add(3,"天津");

        System.out.println(cityList.toString());

        for (int i = 0; i <= cityList.size() - 1; i++){
            System.out.print(cityList.get(i) + "\t");
        }
        System.out.println();

        /*输入数字，存入列表，不保存重复数字，然后输出*/
        ArrayList<Integer> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        System.out.println("请输入数字（以0结束）：");
        int value;
        do{
            value = in.nextInt();
            if (!list.contains(value) && value != 0){
                list.add(value);
            }
        }while (value != 0);

        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();

        /*列表的一些其他有用方法*/
        //将数组转换为列表
        //利用Arrays类的asList方法返回一个列表，作为ArrayList的构造方法，用于创建一个ArrayList
        String array[] = {"red", "blue","green"};
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(array));
        //将列表转换为数组
        String array1 []= new String[list1.size()];
        list1.toArray(array1);
        //如果列表元素是可以比较的（整数、浮点数、字符串）
        Integer [] array2 = {1,75,123,5,73,8,67,37};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(array2));
        java.util.Collections.sort(list2);//排序
        System.out.println(list2);
        System.out.println(java.util.Collections.min(list2));
        System.out.println(java.util.Collections.max(list2));
        java.util.Collections.shuffle(list2);//打乱列表元素的顺序
        System.out.println(list2);
    }
}
//自定义栈类
class MyStack{
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int getSize(){
        return list.size();
    }
    //返回栈顶元素，不删除
    public Object peek(){
        return list.get(getSize() - 1);
    }
    //返回栈顶元素，并删除（出栈）
    public Object pop(){
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }
    //进栈
    public void push(Object o){
        list.add(o);
    }
    public String toString(){
        return "stack:" + list.toString();
    }
}

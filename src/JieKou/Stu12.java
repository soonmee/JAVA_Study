package JieKou;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 * 抽象类
 * 用 abstract 定义
 * 不能创建实例，抽象方法只有定义，没有实现，由子类实现
 * 包含抽象方法的类必须声明为抽象类
 *
 * Number类 抽象类
 */
public class Stu12 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();                           //创建Number对象的列表
        list.add(45);
        list.add(355.45);

        list.add(new BigInteger("34465476871635467632463545"));
        list.add(new BigDecimal("2.046549874165479854646784"));

        System.out.println("最大的数：" + getLargeNumber(list));
    }

    public static Number getLargeNumber(ArrayList<Number> list){
        if (list == null || list.size() == 0){
            return null;
        }
        Number number = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (number.doubleValue() < list.get(i).doubleValue()){
                number = list.get(i);
            }
        }
        return number;
    }
}

package JieKou;

import java.util.*;

/**
 * GregorianCalendar是抽象类Calendar类的一个具体子类
 * Calendar类可以提取详细的日历信息，例如年、月、日、小时、分钟和秒
 * 公历类GregorianCalendar
 *
 */
public class Stu13 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        System.out.println("正确时间：" + new Date());
        System.out.println("年：" + calendar.get(Calendar.YEAR));
        System.out.println("月：" + calendar.get(Calendar.MONTH));
        System.out.println("日：" + calendar.get(Calendar.DATE));
        System.out.println("小时：" + calendar.get(Calendar.HOUR));
        System.out.println("二十四进制小时：" + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("分：" + calendar.get(Calendar.MINUTE));
        System.out.println("秒：" + calendar.get(Calendar.SECOND));

        Calendar calendar1 = new GregorianCalendar(2021,6,30);
        String []zhouqi = {"星期天","星期一","星期二","星期三","星期四","星期五","星期六"};
        System.out.println("2021年6月30日是：" + zhouqi[calendar1.get(Calendar.DAY_OF_WEEK) -1 ]);
    }

}

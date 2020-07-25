package WenJian;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * 从Web上读取数据
 *
 * URL类
 */
//提示用户输入一个url，然后显示文件的大小
public class Stu10 {
    public static void main(String[] args) {
        System.out.println("请输入一个网址：");
        String Urlstring = new Scanner(System.in).next();

        try {
            URL url = new URL(Urlstring);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()){
                String line = input.nextLine();
                count += line.length();
            }
            System.out.println("文件大小是：" + count + "char");
        }catch (MalformedURLException ex){
            System.out.println("错误的网址！");
        }catch (IOException ex){
            System.out.println("没有这样的文件！");
        }
    }
}

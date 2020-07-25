package WenJian;

import java.io.File;
import java.util.Scanner;

/**
 * Scanner类
 * 读取文件数据
 */
public class Stu9 {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\a.txt");

        Scanner input = new Scanner(file);
        while (input.hasNext()){
            String firstName = input.next();
            int age1 = input.nextInt();
            String secondName = input.next();
            int age2 = input.nextInt();
            System.out.println(firstName + "\t" + age1);
            System.out.println(secondName + "\t" + age2);
        }
        input.close();
    }
}

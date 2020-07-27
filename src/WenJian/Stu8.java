package WenJian;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;

/**
 * File类
 * 获取文件/目录属性、删除和重命名文件/目录、创建目录
 * 从/向一个文本文件读/写数据
 *
 * File类不包含读写文件内容的方法
 * 使用Scanner类从文件读取文本数据，使用PrintWriter类向文本文件写入数据
 *
 * PrintWriter类     需要先创建PrintWriter对象
 * 创建文件、写入数据
 */
public class Stu8 {
    public static void main(String[] args) throws FileNotFoundException,Exception {
        File a = new File("D:\\a.txt");
        System.out.println(a.exists());                     //文件存在吗
        System.out.println(a.length());                     //文件大小
        System.out.println(a.canRead());                    //文件能读吗
        System.out.println(a.canWrite());                   //文件能写吗
        System.out.println(a.getAbsolutePath());            //文件的绝对路径
        System.out.println(new Date(a.lastModified()));     //文件最后被修改的时间

    /*    //使用PrintWriter类写入数据
        PrintWriter file = new PrintWriter("D:\\a.txt");
        file.print("张三");
        file.println("\t21");
        file.print("张三");
        file.println("\t22");
        file.close();                                       //必须关闭文件，才能正确的保存数据在文件中
*/

        /** 可以使用try-with-resourse自动关闭资源
        try{
            PrintWriter file = new PrintWriter("D:\\a.txt");
        }{
            file.print("张三");
            file.println("\t21");
            file.print("张三");
            file.println("\t22");
        }
         */

    }
}

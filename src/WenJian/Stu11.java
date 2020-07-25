package WenJian;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 简单的Web爬虫
 * 遍历Web
 */
public class Stu11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个url：");
        String url = input.nextLine();
        crawler(url);//从起始url开始遍历
    }

    public static void crawler(String startingURL){
        ArrayList<String> listofPendingURLs = new ArrayList<>();                    //未遍历的url
        ArrayList<String> listofTraversedURLs = new ArrayList<>();                  //已遍历的url

        listofPendingURLs.add(startingURL);
        while (!listofPendingURLs.isEmpty() && listofTraversedURLs.size() <= 100){  //当未遍历的url列表非空且已遍历的列表数量小于100
            String urlString = listofPendingURLs.remove(0);                   //删除未遍历的url列表的第一个url
            if (!listofTraversedURLs.contains(urlString)){                          //当已遍历的url中没有该url
                listofTraversedURLs.add(urlString);                                 //在已遍历的url列表中添加该url
                System.out.println("Crawl：" + urlString);                          //显示该url
                                                                                    //返回指定url的网页中包含的url列表
                for (String s: getSubURLs(urlString)){                              //将页面中每个不存在于已遍历列表的url添加到未遍历列表中
                    if (!listofTraversedURLs.contains(s)){
                        listofPendingURLs.add(s);
                    }
                }
            }
        }
    }
    public static ArrayList<String> getSubURLs(String urlString){                   //从Web页面读取每一行，查找该行中正确的url
        ArrayList<String> list = new ArrayList<>();                                 //将该url添加到list列表中，继续下一行
                                                                                    //返回list列表
        try {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()){
                String line = input.nextLine();
                current = line.indexOf("http:",current);
                while (current > 0){
                    int endIndex = line.indexOf("\"",current);
                    if (endIndex > 0){
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:",endIndex);
                    }else current=-1;
                }
            }
        } catch (Exception ex) {
            System.out.println("Error：" + ex.getMessage());
        }
        return list;
    }
}

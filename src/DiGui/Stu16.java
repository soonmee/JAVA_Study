package DiGui;

import java.util.Scanner;

public class Stu16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        System.out.println(string + "是回文吗？" + Huiwen(string));
        System.out.println(string + "是回文吗？" + Huiwen2(string));

    }

    public static boolean Huiwen(String string){
        if (string.length() <= 1)
            return true;
        else if (string.charAt(0) != string.charAt(string.length()-1)){
            return false;
        }else
            return Huiwen(string.substring(1,string.length()-1));
        //string.substring(1,string.length()-1)返回一个子字符串，例如 “abcdefg“.substring(2,5)返回下标为2到5-1的字符串”cde“
    }
//递归辅助方法
    public static boolean Huiwen2(String string){
        return Huiwen2(string,0,string.length()-1);
    }

    private static boolean Huiwen2(String string, int low, int high) {
        if (high <= low)
            return true;
        else if (string.charAt(low) != string.charAt(high))
            return false;
        else
            return Huiwen2(string,low+1,high-1);
    }
}


public class Stu19 {
    public static void main(String[] args) {
//        int[] numbers = {1,2,7,9,12,54,99};
//        int target = 66;
//        Solution solution = new Solution();
//        int two[] = solution.twoSum(numbers,target);
//        for (int i = 0; i < two.length; i++){
//            System.out.println(two[i]);
//        }
//        Solution3 solution3 = new Solution3();
//        System.out.println(solution3.reverse(1534236469));
          Solution4 solution4 = new Solution4();
        System.out.println(solution4.isSubsequence("ae","abcdefg"));
    }

}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0,high = numbers.length - 1;
        while (low < high){
            int sum = numbers[low] + numbers[high];
            if (sum == target)
                return new int[]{low + 1, high + 1};
            else if (sum < target)
                ++low;
            else
                --high;
        }
        return new int[]{-1,-1};
    }
}
class Solution2 {
    public int minArray(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    }
}
//32位有符号数字反转
class Solution3 {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            if ((ans * 10) / 10 != ans) {
                ans = 0;
                break;
            }
            ans = ans * 10 + x % 10;
            x = x / 10;
        }
        return ans;
    }
}
//判断s是否为t的子序列
//ae也是abcdefg的子序列
//有问题！！！
class Solution4 {
    public boolean isSubsequence(String s, String t) {
        for (int i = 0; i < t.length() - s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == t.charAt(i + j) && j < s.length() - 1) {
                    continue;
                }else if (s.charAt(j) == t.charAt(i + j) && j == s.length() - 1){
                    return true;
                }
            }
        }
        return false;
    }
}
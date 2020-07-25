/**
 *
 */
public class Stu19 {
    public static void main(String[] args) {
        int[] numbers = {1,2,7,9,12,54,99};
        int target = 66;
        Solution solution = new Solution();
        int two[] = solution.twoSum(numbers,target);
        for (int i = 0; i < two.length; i++){
            System.out.println(two[i]);
        }
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


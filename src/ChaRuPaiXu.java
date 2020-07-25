import java.util.Arrays;

public class ChaRuPaiXu {
    public static void main(String[] args) {
        char example[] = {'E','X','A','M','P','L','E'};

        System.out.print("排序前：");
        for (int i = 0; i < example.length; i++)
            System.out.print(example[i] + "\t");

        char num[] = sort(example);

        System.out.print("\n排序后：");
        for (int i = 0; i < num.length; i++)
            System.out.print(num[i] + "\t");

    }

    private static char[] sort(char[] sourceArray) {
        char[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        for(int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i;
            while(j > 0 && tmp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            if(j != i) arr[j] = (char) tmp;
        }
        return arr;
    }
}
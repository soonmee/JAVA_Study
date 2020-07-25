package DiGui;

/**
 * 递归选择排序
 * 找到列表的最小元素，与列表的第一个元素互换，在剩下的列表继续该操作
 */
public class Stu17 {
    public static void main(String[] args) {

    }
    public static void sort(double[] list){
        sort(list,0,list.length - 1);
    }

    private static void sort(double[] list, int low, int high) {
        if (low < high){
            int indexofMin = low;           //必须说low，不能用0，因为后面递归的时候low不等于0
            double Min = list[low];         //必须说low，不能用0，因为后面递归的时候low不等于0

            //找到最小值的下标和值
            for (int i = low + 1; i <= high ; i++){
                if (list[i] < Min){
                    Min = list[i];
                    indexofMin = i;
                }
            }
            //交换最小值和现在列表第一个值
            list[indexofMin] = list[low];
            list[low] = Min;

            //继续递归找后续的下一个最小值
            sort(list, low + 1 , high);
        }
    }
}

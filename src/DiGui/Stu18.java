package DiGui;

/**
 * 递归二分查找,二分查找的前提是数组元素已经排好序
 * 将关键字与数组的中间元素比较
 * 关键字小，在前一半数组元素继续上述操作
 * 相等，匹配成功，操作结束
 * 关键字大，在后一半数组元素继续上述操作
 * 返回关键字下标
 */
public class Stu18 {
    public static int Search(int[] list, int key){
        int low = 0;
        int high = list.length - 1;
        return Search(list,key,low,high);
    }

    private static int Search(int[] list, int key, int low, int high) {
        if (low > high){
            return -1;
        }
        int mid = (low + high)/2;
        if (key < list[mid]){
            return Search(list,key,low,mid - 1);
        }
        else if (key == list[mid]){
            return mid;
        }else {
            return Search(list,key,mid + 1,high);
        }
    }
}

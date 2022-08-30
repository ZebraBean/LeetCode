package Medium.Medium_75;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/2/25
 * Time: 20:44
 * Description: No Description
 */
public class my_ac {
    class Solution {
        public void sortColors(int[] nums) {
            quickSort(nums);
        }

        public void quickSort(int[] a){
            quick(a,0,a.length-1);
        }

        public void quick(int[] a, int left ,int right) {
            int size = right-left+1;
            if (size <= 1){
                return;
            }
            int mid = partition(a,left,right);
            quick(a,left,mid-1);
            quick(a,mid+1,right);
        }

        public int partition(int[] a, int left, int right) {
            int leftpos = left;
            int rightpos = right;
            int key = a[left];
            while (leftpos < rightpos){
                while (leftpos < rightpos && a[rightpos] >= key){
                    rightpos--;
                }
                a[leftpos] = a[rightpos];
                while(leftpos < rightpos && a[leftpos] <= key){
                    leftpos++;
                }
                a[rightpos] = a[leftpos];
            }
            a[leftpos] = key;
            return leftpos;
        }
    }
}

package Hard.Hard_04;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/3/22
 * Time: 18:01
 * Description: No Description
 */
public class my {
}
class Solution1 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0;
        int s = nums1.length+nums2.length;
        int midIndex = s/2+1;
        int i = 0;
        int j = 0;
        int cur = 0;
        int pre = 0;

        while (i < nums1.length && j < nums2.length && midIndex > 0){
            pre = cur;
            if (nums1[i] < nums2[j]){
                cur = nums1[i];
                i++;
            }else {
                cur = nums2[j];
                j++;
            }
            midIndex--;
        }
        while (i < nums1.length && midIndex > 0){
            pre = cur;
            cur = nums1[i];
            i++;
            midIndex--;
        }
        while(j < nums2.length && midIndex > 0){
            pre = cur;
            cur = nums2[j];
            j++;
            midIndex--;
        }
        if (s % 2 == 0){
            ans = (pre+cur)/2.0;
        }else {
            ans = cur;
        }

        return ans;
    }
}
//class Solution {
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        double ans = 0;
//        int s = nums1.length+nums2.length;
//        int midIndex = s/2+1;
//        int i = -1;
//        int j = -1;
//        int cur = 0;
//        int pre = 0;
//
//        while (i < nums1.length-1 && j < nums2.length-1 && midIndex > 0){
//            pre = cur;
//            if (nums1[i+1] < nums2[j+1]){
//                i++;
//                cur = nums1[i];
//            }else {
//                j++;
//                cur = nums2[j];
//            }
//            midIndex--;
//        }
//        while (i < nums1.length-1 && midIndex > 0){
//            pre = cur;
//            i++;
//            cur = nums1[i];
//            midIndex--;
//        }
//        while(j < nums2.length-1 && midIndex > 0){
//            pre = cur;
//            j++;
//            cur = nums2[j];
//            midIndex--;
//        }
//        if (s % 2 == 0){
//            ans = (pre+cur)/2.0;
//        }else {
//            ans = cur;
//        }
//
//        return ans;
//    }
//}
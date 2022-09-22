package 数组.c_长度最小的子数组.ac02_lc904_220821_medium;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/22
 * Time: 14:25
 * Description: No Description
 */
public class better {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;
        for (int i = 0; i < fruits.length; i++) {
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            //装的水果种类超过两个时
            while(map.size()>2){
                //以最初遍历的顺序开始抛弃水果，相当于左指针开始右移
                map.put(fruits[left],map.get(fruits[left])-1);
                //当 某个篮子的水果抛弃完后，则说明当前只剩一种水果，可以添加下一种水果
                if(map.get(fruits[left])==0){
                    //完全抛弃这一种水果
                    map.remove(fruits[left]);
                }
                //真正的左指针右移，滑动窗口的起始位置开始移动
                left++;
            }
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}

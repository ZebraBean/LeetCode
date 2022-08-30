package 每日一题.ac02_lc290_220811_easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/11
 * Time: 21:53
 * Description: No Description
 */
public class better {
    public static boolean wordPattern(String pattern, String s) {
//        将字符串按空格为划分标准，依次将子字符串存入字符串数组
        String[] str = s.split(" ");
//        将pattern存入字符型数组
        char[] ch = pattern.toCharArray();
//        如果两个数组长度不相等，则一定不符合规律
        if(str.length != ch.length){
            return false;
        }
//        只建立一个哈希表无法判断s中全为同一个单词的情况
//        要双向判断
        Map<Character,String> hashMap1 = new HashMap<>();
        Map<String,Character> hashMap2 = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
//            先判断第一个哈希表
            if(hashMap1.containsKey(ch[i])){
                if(!str[i].equals(hashMap1.get(ch[i]))){
                    return false;
                }
            }
//            同样的方法判断第二个
            if(hashMap2.containsKey(str[i])){
                if(!hashMap2.get(str[i]).equals(ch[i])){
                    return false;
                }
            }
//            没有遇到存储过的，就将新的双向连接存入哈希
            hashMap1.put(ch[i],str[i]);
            hashMap2.put(str[i],ch[i]);
        }
        return true;
    }
}

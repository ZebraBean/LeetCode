package Medium.Medium_853;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/2/24
 * Time: 22:17
 * Description: No Description
 */
public class my_ac {
    class Solution {
        public int carFleet(int target, int[] position, int[] speed) {
            int ans = 1;
            Node[] nodes = new Node[position.length];
            for (int i = 0; i < nodes.length; i++) {
                nodes[i] = new Node(position[i],(double) (target-position[i])/speed[i]);
            }
            Arrays.sort(nodes,new Comparator<Node>() {
                @Override
                public int compare(Node o1, Node o2) {
                    return o1.pos - o2.pos;
                }
            });
            int t = nodes.length-1;
            while (t > 0){
                if (nodes[t].time < nodes[t-1].time){
                    ans++;
                    t--;
                }else {
                    nodes[t-1] = nodes[t];
                    t--;
                }
            }
            return ans;
        }

    }
    class Node{
        int pos;
        double time;

        public Node(int pos, double time) {
            this.pos = pos;
            this.time = time;
        }
    }
}

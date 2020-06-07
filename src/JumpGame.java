import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JumpGame {
    public static void main(String[] args) {
        Map<int[], Boolean> tests = new HashMap<>();
        tests.put(new int[]{2, 3, 1, 1, 4}, true);
        tests.put(new int[]{3, 2, 1, 0, 4}, false);
        tests.put(new int[]{0}, true);
        for (int[] test : tests.keySet()) {
            if (canJump(test) != tests.get(test)) {
                System.out.println("WRONG ANSWER");
            }
        }
        System.out.println("ACCEPTED");
    }

    public static boolean canJump(int[] array) {
        // Our destination is the end of the array
        int destination = array.length - 1;
        /*
         * Greedy
         * Traverse from tail to head. If the furthest distance
         * we can reach from the current index covers the
         * destination, then the destination can be replaced with
         * the current index because we know that if we can reach
         * the current index, we definitely can jump to the destination
         */
        for (int i = array.length - 1; i >= 0; i --) {
            if (i + array[i] >= destination) destination = i;
        }
        /*
         * Check if the destination is 0 for that we can reach the
         * end from 0
         */
        return destination == 0;
    }
}

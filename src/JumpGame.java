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
        int destination = array.length - 1;
        for (int i = array.length - 1; i >= 0; i --) {
            if (i + array[i] >= destination) destination = i;
        }
        return destination == 0;
    }
}

/**
 * @project: mse-interview-workshop
 * @description:
 * @author: Xueying Mao (Andrew ID: xueyingm)
 * @create: 11/06/2020 14:25
 **/
public class Jump {

    private static final int GOOD = 1;  // from which can reach the last index

    public boolean jump(int[] nums) {
        int[] memo = new int[nums.length];
        memo[memo.length - 1] = GOOD;

        // mark good indexes from right to left
        for (int i = nums.length - 2; i >= 0; i--) {
            // furthest jump from the current index
            int furthestJump = Math.min(i + nums[i], nums.length - 1);
            for (int j = i + 1; j <= furthestJump; j++) {
                if (memo[j] == GOOD) {
                    memo[i] = GOOD;
                    break;
                }
            }
        }

        return memo[0] == GOOD;
    }
}

package TwoPointersAndSldingWindow;

import java.util.*;

public class SlidingWindowMaximum {

    public static List<Integer> maxSlidingWindow(int[] nums, int k) {
        int i = 0, j = 0, n = nums.length;
        List<Integer> res = new ArrayList<>();
        Deque<Integer> maxQ = new ArrayDeque<>();

        while (j < n) {
            // Remove elements smaller than current from the back
            while (!maxQ.isEmpty() && maxQ.peekLast() < nums[j]) {
                maxQ.pollLast();
            }
            maxQ.addLast(nums[j]);

            // When window size reaches k
            if (j >= k - 1) {
                res.add(maxQ.peekFirst());

                // Remove outgoing element from front if needed
                if (maxQ.peekFirst() == nums[i]) {
                    maxQ.pollFirst();
                }
                i++;
            }
            j++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> result = maxSlidingWindow(arr, k);

        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

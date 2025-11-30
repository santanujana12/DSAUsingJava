package Arrays.LogicBuilding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NextGreaterElement {

    public static List<Integer> nextGreaterElement(List<Integer> nums1, List<Integer> nums2) {
        Map<Integer, Integer> nextGreater = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums2.size() - 1; i++) {
            for (int j = i + 1; j < nums2.size(); j++) {
                if (nums2.get(i) < nums2.get(j)) {
                    nextGreater.put(nums2.get(i), nums2.get(j));
                    break;
                }
            }
        }
        for (int num : nums1) {
            if (!nextGreater.containsKey(num)) {
                result.add(-1);
            } else {
                result.add(nextGreater.get(num));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(4, 1, 2);
        List<Integer> nums2 = Arrays.asList(1, 3, 4, 2);
        List<Integer> result = nextGreaterElement(nums1, nums2);

        // Output the result
        for (int res : result) {
            System.out.println(res);
        }
    }
}

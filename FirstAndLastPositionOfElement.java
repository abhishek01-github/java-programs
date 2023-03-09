import java.util.*;
public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int[] nums = {5, 6, 6, 6, 8, 8, 10};
        int[] ans = searchRange(nums, 6);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = range(nums, target, true);
        ans[1] = range(nums, target, false);
        return ans;
    }

    static int range(int[] nums, int target, boolean startIndex) {
        int start = 0;
        int end = nums.length - 1;
        if (startIndex) {
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] >= target)
                    end = mid;
                else
                    start = mid + 1;
            }
        } else {
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] > target)
                    end = mid - 1;
                else
                    start = mid;
            }
        }
        if (nums[start] == target)
            return end;
        else
            return -1;
    }
}
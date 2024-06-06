import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianOfMediansContiguousSubsequence {

    public static void main(String[] args) {
        int[] sequence = {10, 30, 20};
        int result = medianOfMedians(sequence);
        System.out.println("Median of Medians: " + result);
    }

    // Function to find the median of a contiguous subsequence
    private static int findMedian(int[] sequence, int left, int right) {
        int size = right - left + 1;
        List<Integer> subsequence = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            subsequence.add(sequence[i]);
        }
        Collections.sort(subsequence);
        if (size % 2 == 0) {
            return (subsequence.get(size / 2 - 1) + subsequence.get(size / 2)) / 2;
        } else {
            return subsequence.get(size / 2);
        }
    }

    // Main function to find the median of medians for contiguous subsequences
    private static int medianOfMedians(int[] sequence) {
        List<Integer> medians = new ArrayList<>();
        int left = 0;
        int windowSize = 1;
        int n = sequence.length;
        while (windowSize <= n) {
            int right = left + windowSize - 1;
            while (right < n) {
                int median = findMedian(sequence, left, right);
                medians.add(median);
                left++;
                right++;
            }
            left = 0;
            windowSize++;
        }
        Collections.sort(medians);
        int size = medians.size();
        if (size % 2 == 0) {
            return (medians.get(size / 2 - 1) + medians.get(size / 2)) / 2;
        } else {
            return medians.get(size / 2);
        }
    }
}

package test.leetcode;

public class 寻找两个正序数组的中位数 {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        Solution01 solution = new Solution01();
        double medianSortedArrays = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);

    }
}

class Solution01 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return 0;
    }
}
package test.leetcode;

import java.util.HashSet;

public class 无重复字符的最长子串 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int i = new Solution().lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if (n<=1){
            return n;
        }
        HashSet<Character> set = new HashSet<>();
        int left=0;
        int res=0;
        for (int i=0;i<n;i++){
            while (left<n&&!set.contains(s.charAt(left))){
                set.add(s.charAt(left));
                ++left;
            }
            res = Math.max(res, left - i);
            System.out.println(set);
            set.remove(s.charAt(i));

        }
        return res;
    }
}
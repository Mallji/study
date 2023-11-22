package leetcode.seq;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] table = new int[100];
        int result = 0;
        for (int i = 0; i < s.length()-1;) {
            int count = 0;
            for(int j = i; j < s.length();){
                char current = s.charAt(j);
                if (table[current-'A']==0){
                    table[current-'A']++;
                    j++;
                    count++;
                    continue;
                }
                i = j;
                Arrays.fill(table, 0);
                break;
            }
            result = Math.max(result, count);



        }
        return result;
    }
}
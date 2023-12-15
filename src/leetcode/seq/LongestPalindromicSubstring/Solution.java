package leetcode.seq.LongestPalindromicSubstring;

public class Solution {
    public String longestPalindrome(String s) {
        //循环控制指针
        int ptr_font = 0;
        int ptr_tail = 1;
        String result ="";
        int maxlengt = 0;
        //字符串的长度
        int len = s.length();

        boolean flag = false;

        if(s.length() == 1){
            return s;
        }

        for (ptr_font = 0; ptr_font < len; ptr_font++) {

            for (ptr_tail = ptr_font + 1; ptr_tail < len; ptr_tail++) {
                //如果前后指针相等则证明可能是回文串,并且ptr_font与ptr_tail的差距此时是大于当前找到的最大回文串
                if((s.charAt(ptr_font)==s.charAt(ptr_tail))&&(ptr_tail-ptr_font + 1>maxlengt)){
                    int i = ptr_font;
                    int j = ptr_tail;
                    while (s.charAt(i) == s.charAt(j)){
                        i++;
                        j--;
//                        if(){
//                            //不是回文串
//                            break;
//                        }
                        if(i>=j){
                            result = s.substring(ptr_font,ptr_tail+1);
                            maxlengt = result.length();
                            flag = true;
                            break;
                        }

                    }
                    //是回文串

//                    //保存回文串
//                    if(i == j){
//
//                    }

                }
            }
        }
        if(flag == false){
            result = s.substring(0,1);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.longestPalindrome("ccc");
    }

}

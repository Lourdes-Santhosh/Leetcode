/*

You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.

Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false.

 

Example 1:

Input: s1 = "bank", s2 = "kanb"
Output: true
Explanation: For example, swap the first character with the last character of s2 to make "bank".

*/

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int ptr[] = new int[s1.length()];
        int count = 0;
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                ptr[count++] = i;
            }
        }
        if(count == 0) return true;
        if(count == 2) {
            if(s1.charAt(ptr[0]) == s2.charAt(ptr[1]) && s1.charAt(ptr[1]) == s2.charAt(ptr[0])) 
                return true;
            return false;
        }
        return false;
    }
}

/*

Given an array of integers arr, and three integers a, b and c. You need to find the number of good triplets.

A triplet (arr[i], arr[j], arr[k]) is good if the following conditions are true:

0 <= i < j < k < arr.length
|arr[i] - arr[j]| <= a
|arr[j] - arr[k]| <= b
|arr[i] - arr[k]| <= c
Where |x| denotes the absolute value of x.

Return the number of good triplets.

*/

// Not the best approach, still beats 93.98% of submissions :)
// Could also be solved using Fenwick Tree
class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n-1; j++) {
                if(Math.abs(arr[i] - arr[j]) > a) continue;
                for(int k = j+1; k < n; k++) {
                    if(Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c)   
                                       count++;
                }
            }
        }
        return count;
    }
}

/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 *
 * https://leetcode.com/problems/pascals-triangle-ii/description/
 *
 * algorithms
 * Easy (41.94%)
 * Total Accepted:    184.9K
 * Total Submissions: 440.1K
 * Testcase Example:  '3'
 *
 * Given a non-negative index k where k ≤ 33, return the kth index row of the
 * Pascal's triangle.
 * 
 * Note that the row index starts from 0.
 * 
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly
 * above it.
 * 
 * Example:
 * 
 * 
 * Input: 3
 * Output: [1,3,3,1]
 * 
 * 
 * Follow up:
 * 
 * Could you optimize your algorithm to use only O(k) extra space?
 * 
 */
class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        if(rowIndex < 0) return new LinkedList<Integer>();

        List<Integer> temp = new ArrayList<>(), result = new ArrayList<>();
        temp.add(1);
        int ind = 1;
        while(ind <= rowIndex) {
            result.add(1);
            for(int i = 1; i < ind; i++) {
                int sum = temp.get(i-1) + temp.get(i);
                result.add(sum);
            }
            result.add(1);
            temp = new ArrayList<>(result);
            result.clear();
            ind++;
        }
        return temp;
    }
}


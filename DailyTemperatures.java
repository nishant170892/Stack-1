// Time Complexity : O(2n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes, https://leetcode.com/problems/daily-temperatures/
// Any problem you faced while coding this : No

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        if(temperatures==null||temperatures.length==0) return new int[0];
        int[] result = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                int popped = st.pop();
                result[popped] = i-popped;
            }
            st.push(i);
        }
        return result;
    }
}

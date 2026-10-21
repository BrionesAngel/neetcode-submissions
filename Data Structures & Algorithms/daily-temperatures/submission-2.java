class Solution {
  public int[] dailyTemperatures(int[] temperatures) {
    int[] ans = new int[temperatures.length];
    Deque<int[]> dq = new ArrayDeque<>();
    for (int i = 0; i < temperatures.length; i++) {
      int t= temperatures[i];
      while(!dq.isEmpty() && t>dq.peek()[0]) {
        int[] pair = dq.pop();
        ans[pair[1]]=i-pair[1];
      }
      dq.push(new int[]{t,i});
    }
    return ans;
  }
}
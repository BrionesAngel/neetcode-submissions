class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int start=0;
        Arrays.sort(nums);
        while(start<nums.length && nums[start]<1){
            if(start>0 && nums[start]==nums[start-1]) {start++; continue;}
            int l=start+1;
            int r=nums.length-1;
            while(l<r) {
                int sum=nums[start] + nums[l] + nums[r];
                if(sum>0) r--;
                else if (sum<0)l++;
                else if (sum==0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[start]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    ans.add(list);
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                }
            }
            start++;
        }
        return ans;
    }
}

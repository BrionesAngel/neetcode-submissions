class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        }
        return freq.entrySet().stream()
                              .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
                              .limit(k)
                              .map(entry -> entry.getKey())
                              .mapToInt(Integer::intValue)
                              .toArray();
    }
}

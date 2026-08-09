class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> ans = new HashMap<>();
        int n = nums.length;
        for(int num:nums){
        ans.put(num,ans.getOrDefault(num,0)+1);// yaha pe count mil jayega
            } 
        PriorityQueue<Map.Entry<Integer,Integer>> pq= new PriorityQueue<>((a,b) -> b.getValue()-a.getValue()); 
        pq.addAll(ans.entrySet());

        int[] result  = new int[k];
        for(int i=0;i<k;i++){
            Map.Entry<Integer,Integer> top = pq.poll();
            result[i]= top.getKey();
        } 
        return result;
    }
    
}
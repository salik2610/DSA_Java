class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] result=new int[m+n];
        int k=0;
        for(int i=0;i<m;i++){
            result[k]=nums1[i];
            k++;
        }
         for(int i=0;i<n;i++){
            result[k]=nums2[i];
            k++;
        }
        Arrays.sort(result);

        for(int i=0;i<m+n;i++){
            nums1[i]=result[i];
        }
    }
}   
package lcwu;

public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       if(n!=0) {
           for (int i = m; i < m + n; i++) {
               nums1[m] = nums2[i - m];
           }
       }
        int temp=0;
        for(int j=0;j<m+n-1;j++){
            for(int k=j;k<m+n-1;k++){
                if(nums1[k]>nums1[k+1]){
                    temp = nums1[k];
                    nums1[k]=nums1[k+1];
                    nums1[k+1]=temp;
                }

            }
        }
    }
    public static void main(String args[]){
        int nums[]={1,2,4,5,6,0};
        int ai[]={3};
        Solution88 s88 = new Solution88();
        s88.merge(nums,5,ai,1);
        for(int i =0;i<6;i++){
            System.out.println(nums[i]);
        }

    }
}

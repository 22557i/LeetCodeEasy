package lcwu;

public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

           int sum[]=new int[m+n];
       int i =0;
       for(;i<m;i++){
           sum[i]=nums1[i];
       }
       for(i =0;i<n;i++){
           sum[i+m]=nums2[i];
       }


        int temp=0;
        for(int j=0;j<m+n-1;j++){
            for(int k=0;k<m+n-1;k++){
                if(sum[k]>sum[k+1]){
                    temp = sum[k];
                    sum[k]=sum[k+1];
                    sum[k+1]=temp;
                }

            }
        }
        for(i=0;i<m+n;i++){
            nums1[i]=sum[i];
        }
    }
    public static void main(String args[]){
        int nums[]={4,5,6,0,0,0};
        int ai[]={1,2,3};
        Solution88 s88 = new Solution88();
        s88.merge(nums,3,ai,3);
        for(int i =0;i<6;i++){
            System.out.println(nums[i]);
        }

    }
}

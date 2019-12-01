package lcwu;

public class Solution11 {
//    public int maxArea(int[] height) {
//        int res=0;
//        for (int i = 0; i < height.length; i++) {
//            for (int j = i+1; j < height.length; j++) {
//                res=Math.max(res,Math.min(height[i],height[j])*(j-i));
//            }
//        }
//        System.out.println(res);
//        return res;
//    }
    public int maxArea(int[]height){
        int l = 0;
        int r = height.length-1;

        int max = Integer.MIN_VALUE;
        while(l<r){
           max = Math.max(max,(r-l)*Math.min(height[l],height[r]));
            if(height[l]<height[r])l++;
            else r--;
        }
        return max;
    }

    public static void main(String[] args) {
        Solution11 s11 = new Solution11();
        int test[] = {2,3,10,5,7,8,9};
        s11.maxArea(test);
    }
}

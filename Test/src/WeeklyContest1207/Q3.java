package WeeklyContest1207;

/**
 * Created by Hao Wu on 12/7/19.
 */
public class Q3 {
    public int smallestDivisor(int[] nums, int threshold) {
        int index=Integer.MAX_VALUE;
        int sum=0;
        for(int i=1;;i++){
             sum=0;
            for(int j=0;j<nums.length;j++){
                System.out.print(div(nums[j],i)+" ");
                sum+=div(nums[j],i);
            }
            if(sum<=threshold){
                index = Math.min(i,index);

               break;
            }
            System.out.println("index is "+ index);
        }
        return index;
    }
    public int div(int a,int b){
        return a%b==0?a/b:a/b +1;
    }

    public static void main(String[] args) {
       int nums[]=new int[]{962551,933661,905225,923035,990560};
       int threshold = 10;
       Q3 q = new Q3();
        System.out.println("qweqwe"+q.div(19,5));
        System.out.println(q.smallestDivisor(nums,threshold));
    }
}

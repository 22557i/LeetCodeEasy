package lcwu;

import java.util.*;

public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> numset = new HashSet<Integer>();

        for (int i = 0; i <nums1.length ; i++) {
            if(!numset.contains(nums1[i]))numset.add(nums1[i]);
        }
        for(Integer a:numset){
            System.out.println(a);
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i <nums2.length ; i++) {
            if(numset.contains(nums2[i])&&!arrayList.contains(nums2[i]))arrayList.add(nums2[i]);
        }
        int a[] = new int[arrayList.size()];
        for (int i = 0; i <arrayList.size() ; i++) {
            a[i]=arrayList.get(i);
        }
        return a;

    }
    public static void main(String args[]){
        Solution349 solution349 = new Solution349();
        int nums1[]={1,1,2,2};
        int nums2[]={2,2};
        solution349.intersection(nums1,nums2);
    }
}

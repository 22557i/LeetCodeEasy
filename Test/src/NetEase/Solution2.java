package NetEase;

import java.util.*;
public class Solution2 {


	List<ArrayList<Integer>> reslist = new ArrayList<>();
	public boolean mainsolution(int n){

		int [] nums = new int[n];
		reslist = permute(nums);
		for(ArrayList l:reslist){
			if(isgood(l)) return true;

		}
		return false;
	}
	public List<ArrayList<Integer>> permute(int[] nums) {

		List<Integer> p = new ArrayList<>();
		generatePermutation(nums, 0, p, reslist);
		return reslist;
	}

	public void generatePermutation(int[] nums, int index, List<Integer> p, List<ArrayList<Integer>> res){
		if(index == nums.length){
			res.add(new ArrayList<>(p));
			return;
		}

		for(int i = 0; i<nums.length; i++){
			if(!p.contains(nums[i])){
				p.add(nums[i]);
				generatePermutation(nums, index+1, p, res);
				p.remove(p.size()-1);
			}
		}
	}

	public boolean isgood(ArrayList<Integer> list){
		if(list.get(0)>list.get(1)+list.get(list.size()-1))return false;

		for (int i = 1; i <list.size()-1 ; i++) {
			if (list.get(i)>list.get(i-1)+list.get(i+1))return false;

		}
		return true;
	}
}

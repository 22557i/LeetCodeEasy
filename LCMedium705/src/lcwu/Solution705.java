package lcwu;

public class Solution705 {
	class MyHashSet {
		int[] set = new int[100000];
		/** Initialize your data structure here. */
		public MyHashSet() {

		}

		public void add(int key) {
			if (set[key]==0) set[key]++;
		}

		public void remove(int key) {
			if (set[key]>0) set[key]--;
		}

		/** Returns true if this set contains the specified element */
		public boolean contains(int key) {
			return set[key]>0;
		}
	}
}

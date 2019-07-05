package lcwu;

public class Solution706 {
	class MyHashMap {

		/** Initialize your data structure here. */
		class ListNode {
			int key, value;
			ListNode next;
			public ListNode(int key, int value) {
				this.key = key;
				this.value = value;
				this.next = null;
			}
		}
		ListNode[] nodes;
		public MyHashMap() {
			nodes = new ListNode[1000];
		}
		/** value will always be non-negative. */
		public void put(int key, int value) {
			int index = Integer.hashCode(key) % nodes.length;;
			if(nodes[index]==null)nodes[index]=new ListNode(-1,-1);

			ListNode previous = findPre(nodes[index],key);
			if(previous.next==null)previous.next=new ListNode(key,value);
			else previous.next.value = value;

		}

		/** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
		public int get(int key) {
			int index = Integer.hashCode(key) % nodes.length;;
			if(nodes[index]==null)return -1;
			ListNode previous = findPre(nodes[index],key);
			if(previous.next==null)return -1;
			return previous.next.value;
		}

		/** Removes the mapping of the specified value key if this map contains a mapping for the key */
		public void remove(int key) {
			int idx = Integer.hashCode(key) % nodes.length;;
			if (nodes[idx] == null) return;
			ListNode pre = findPre(nodes[idx], key);
			if (pre.next == null) return;
			pre.next = pre.next.next;
		}
		public ListNode findPre(ListNode root, int key) {
			ListNode pre = null;
			while (root != null && root.key != key) {
				pre = root;
				root = root.next;
			}
			return pre;
		}
	}
}

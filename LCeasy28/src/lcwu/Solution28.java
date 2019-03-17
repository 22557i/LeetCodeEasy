package lcwu;

public class Solution28 {
	public int strStr(String haystack, String needle) {
		if(haystack.isEmpty()&&needle.isEmpty())
			return 0;
		if(haystack.contains(needle)){
			return haystack.indexOf(needle);

		}else
			return -1;
	}
}

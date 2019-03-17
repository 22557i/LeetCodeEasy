package lcwu;

public class Solution28 {
	public int strStr(String haystack, String needle) {
	for(int i =0;i<haystack.length()-needle.length();i++){
		if(haystack.substring(i,i+needle.length())==needle)return i;
		break;


	}
	
	}
}

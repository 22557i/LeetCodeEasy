public class Solution557 {
	public String reverseWords(String s) {
		String[] words = s.split(" ");
		StringBuffer res = new StringBuffer();
		for(String word:words){
			res.append(new StringBuffer(word).reverse().toString()+" ");
		}
		return res.toString().substring(0,res.toString().length()-1);
	}
}

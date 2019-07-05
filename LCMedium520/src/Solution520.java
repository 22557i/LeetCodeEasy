public class Solution520 {
	public boolean detectCapitalUse(String word) {
		if(word.length()==0)return true;
		if (word.substring(1).equals(word.substring(1).toLowerCase())) return true;
		if(word.charAt(0)>='A'&&word.charAt(0)<='Z'){
			return word.equals(word.toUpperCase());
		}

		return false;
	}
}

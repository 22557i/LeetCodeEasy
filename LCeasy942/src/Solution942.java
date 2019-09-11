public class Solution942 {
	public int[] diStringMatch(String s) {
		if (s == null || s.length() == 0)
			return new int[0];
		int[] result = new int[s.length() + 1];
		int i = 0, j = s.length();
		for (int k = 0; k < s.length(); k++) {
			char c = s.charAt(k);
			if (c == 'I')
				result[k] = i++;
			else
				result[k] = j--;
		}
		result[s.length()] = i;
		return result;
	}
}

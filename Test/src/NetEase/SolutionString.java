package NetEase;

public class SolutionString {
	String S;
	String T;
	public boolean isGood(String s){
		return false;
	}

	public String rev(String s){
		if(s.length()<2)return s;
		StringBuffer res = new StringBuffer(s).reverse();
		int i =0;
		for (; i < s.length(); i++) {
			if(s.charAt(i)=='1')break;
		}
		return res.substring(i);

	}
}

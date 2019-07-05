package lcwu;

import java.util.*;
public class Solution504 {
	public String convertToBase7(int num) {
		StringBuffer res = new StringBuffer();
		int temp =num;
		if (num < 0) {
			num = -num;
		}

		if (num == 0) {
			return "0";
		}
		while (num != 0) {
			int mod = num % 7;

			res.append(mod);

			num /= 7;
		}

		if(temp<0)res.append("-");

		return res.reverse().toString();
	}
}

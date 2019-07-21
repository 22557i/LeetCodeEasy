package lcwu;

public class Solution717 {
	public boolean isOneBitCharacter(int[] bits) {
		int i =bits.length -2;
		while(i>=0 &&bits[i]>0 )i--;
		return (bits.length -i)%2==0;
	}
}

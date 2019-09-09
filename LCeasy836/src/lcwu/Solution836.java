package lcwu;

public class Solution836 {
	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		boolean a1 = (rec2[0]>rec1[0]&&rec2[1]>rec1[1])&&(rec2[0]<rec1[2]&&rec2[1]<rec1[3]);
		boolean a2 =  (rec2[2]>rec1[0]&&rec2[3]>rec1[1])&&(rec2[2]<rec1[3]&&rec2[1]<rec1[3]);
		boolean a3 = (rec1[0]>rec2[0]&&rec1[1]>rec2[1])&&(rec1[0]<rec2[2]&&rec1[1]<rec2[3]);
		boolean a4 =  (rec1[2]>rec2[0]&&rec1[3]>rec2[1])&&(rec1[2]<rec2[3]&&rec1[1]<rec2[3]);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		return a1||a2||a3||a4;
	}
}

package lcwu;

public class Solution190 {
    public int reverseBits(int n) {
        StringBuffer Nstring = new StringBuffer();
        for(int i =0;i<32;i++){
            Nstring.append(n%2);

        }
        String s=Nstring.toString();
        int count =0;
        for(int i =0;i<32;i++){
            count += Integer.valueOf(s.charAt(i))*Math.pow(2,31-i);
        }
        return count ;
    }
}

/* public int reverseBits(int n) {
        for(int i=0;i<16;i++){
            int m=(n&(1<<i))>>i;
            int k=(n&(1<<(31-i)))>>>(31-i);
            if(m!=k){
                n^=(1<<i);
                n^=(1<<(31-i));
            }
        }
        return n;
    }*/
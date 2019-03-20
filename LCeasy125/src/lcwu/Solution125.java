package lcwu;

class Solution125 {
    public boolean isPalindrome(String s) {
        if(s=="")return true;
        s=s.toUpperCase();
        StringBuffer s2= new StringBuffer();

        for(int i =0;i<s.length();i++){
            if(s.charAt(i)>64&&s.charAt(i)<91||(s.charAt(i)>=48&&s.charAt(i)<=57)){
                s2.append(s.charAt(i));
            }
        }


        String s1 = new StringBuilder(s2).reverse().toString();
        if(s2.toString().equals(s1))return true;
        else return false;

    }
}

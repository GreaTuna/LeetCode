class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            int num = 0;
            if(s.charAt(i)=='#'){
                i--;
                num=(int)(s.charAt(i)-48+(s.charAt(i-1)-48)*10);
                i=i-2;
            }else{
                num=(int)s.charAt(i)-48;
                i--;
            }
            sb.append((char)(num+97-1));
        }
        return sb.reverse().toString();
    }
}
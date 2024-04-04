class Solution {
    public String solution(String ms, int m, int c) {
        String r = "";
        for(int i=0;i<ms.length()/m;i++) r+=ms.substring(i*m,m+i*m).charAt(c-1);
        return r;
    }
}
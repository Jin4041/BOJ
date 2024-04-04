class Solution {
    public int solution(String st, String pat) {
        String s="";
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='A') s+='B';
            else s+='A';
        }
        for(int i=0;i<=s.length()-pat.length();i++) if(s.substring(i,i+pat.length()).equals(pat)) return 1;
        return 0;
    }
}
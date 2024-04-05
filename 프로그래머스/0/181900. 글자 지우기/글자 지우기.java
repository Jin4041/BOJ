class Solution {
    public String solution(String s, int[] ind) {
        for(int i=0;i<ind.length;i++) s=s.substring(0,ind[i])+" "+s.substring(ind[i]+1);
        return s.replaceAll("\\s+","");
    }
}
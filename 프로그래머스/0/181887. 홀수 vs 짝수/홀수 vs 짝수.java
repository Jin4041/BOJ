class Solution {
    public int solution(int[] nl) {
        int os=0,es=0;
        for(int i=0;i<nl.length;i++){
            if(i%2==0)os+=nl[i];
            else es+=nl[i];
        }
        if(es==os) return es;
        else return es>os? es:os;
    }
}
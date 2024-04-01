class Solution {
    public int[] solution(int[] nl) {
        int last=0;
        if(nl[nl.length-1]>nl[nl.length-2]) last=nl[nl.length-1]-nl[nl.length-2];
        else last=nl[nl.length-1]*2;
        int[] answer=new int[nl.length+1];
        for(int i=0;i<nl.length;i++) answer[i]=nl[i];
        answer[nl.length]=last;
        return answer;
    }
}
class Solution {
    public int[] solution(int[] nl, int n) {
        int[] answer = new int[nl.length];
        int i=0;
        int a=n;
        while(true){
            if(n>=nl.length) return nl;
            else{
                answer[i]=nl[a];
                i++;
                a++;
                if(a==nl.length) a=0;
                if(i==nl.length) break;
                }
        }
        return answer;
    }
}
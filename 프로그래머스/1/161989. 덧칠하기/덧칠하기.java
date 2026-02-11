class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1, now=section[0];
        for(int sec:section){
            if(sec<=now+m-1)
                continue;
            else{
                answer++;
                now=sec;
            }
        }
        return answer;
    }
}
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day={"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] date={31,29,31,30,31,30,31,31,30,31,30,31};
        int days=b;
        for(int i=0;i<a-1;i++)
            days+=date[i];
        answer=day[days%7];
        return answer;
    }
}
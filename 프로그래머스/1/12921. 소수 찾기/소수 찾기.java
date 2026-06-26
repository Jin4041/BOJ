import java.lang.Math;
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=2;i<=n;i++){
            int num=1;
            while(num<=Math.sqrt(i)){
                if(num!=1&&i%num==0){
                    break;
                }
                else if(num+1>Math.sqrt(i)){
                    answer++;
                }
                num++;
            }
        }
        return answer;
    }
}
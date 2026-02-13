class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2], rank={6,6,5,4,3,2,1};
        int count0=0, match=0;
        for(int num:lottos){
            if(num==0)
                count0++;
        }
        for(int win_num:win_nums){
            for(int num:lottos){
                if(num==win_num){
                    match++;
                    break;
                }
            }
        }
        answer[0]=rank[match+count0];
        answer[1]=rank[match];
        return answer;
    }
}
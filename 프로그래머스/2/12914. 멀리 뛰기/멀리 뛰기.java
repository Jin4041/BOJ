import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public long solution(int n) {
        long answer=1;
        Queue<Long> q=new LinkedList<>();
        q.add(1L);q.add(1L);
        if(n>=2){
            for(long i=2;i<=n;i++){
                answer=(q.poll()+q.peek())%1234567;
                q.add(answer);
            }
        }
        return answer;
    }
}
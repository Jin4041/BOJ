import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q=new LinkedList<>();
        int num,head,size,cnt;
        for(int i=0;i<progresses.length;i++) {
            num = (100 - progresses[i]);
            q.add(num%speeds[i]==0?num/speeds[i]:num/speeds[i]+1);
        }
        Queue<Integer> a=new LinkedList<>();
        while(!q.isEmpty()){
            size=q.size();
            head=q.peek();
            cnt=0;
            System.out.println("head: "+head);
            for(int i=0;i<size;i++){
                num=q.peek();
                if(num<=head) {
                    cnt++;
                    q.remove();
                }
                else
                    break;
            }
            if(cnt!=0)
                a.add(cnt);
        }
        int[] answer=new int[a.size()];
        for(int i=0;i<answer.length;i++)
            answer[i]=a.remove();
        return answer;
    }
}
import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        Deque<Integer> deque=new ArrayDeque<>();
        for(int p:people)
            deque.addFirst(p);
        while(!deque.isEmpty()){
            if(deque.getFirst()+deque.getLast()<=limit)
                deque.removeLast();
            if(!deque.isEmpty())
                deque.removeFirst();
            answer++;
        }
        return answer;
    }
}
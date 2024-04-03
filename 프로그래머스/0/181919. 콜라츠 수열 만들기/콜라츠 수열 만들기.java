import java.util.*;
class Solution {
    public int[] solution(int x) {
        List<Integer> l=new ArrayList<>();
        l.add(x);
        while(x!=1){
            if(x%2==0) x/=2;
            else x=3*x+1;
            l.add(x);
        }
        int[] answer = new int[l.size()];
        for(int i=0;i<l.size();i++) answer[i]=l.get(i);
        return answer;
    }
}
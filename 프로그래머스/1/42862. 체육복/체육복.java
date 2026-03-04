import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        ArrayList<Integer>list=new ArrayList<>();
        
        outer:
        for(int i:reserve){
            for(int j=0;j<lost.length;j++){
                if(lost[j]==i){
                    i=-1;lost[j]=-1;answer++;continue outer;
                }
            }
            list.add(i);
        }
    
        for(int l : lost){
            if(l<0)
                continue;
            
            for(int i=0;i<list.size();i++){
                if(list.get(i)>=l-1&&list.get(i)<=l+1){
                    answer++;
                    list.remove(i);break;
                }else if(list.get(i)<l-1){
                    list.remove(i);i--;
                }
                else if(list.get(i)>l+1)
                    break;
            }
        }
        return answer;
    }
}
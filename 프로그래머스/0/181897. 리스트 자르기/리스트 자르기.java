import java.util.*;
class Solution {
    public int[] solution(int n, int[] s, int[] num_list) {
        List<Integer>l=new ArrayList<>();
        switch(n){
            case 1:for(int i=0;i<=s[1];i++) l.add(num_list[i]);break;
            case 2:for(int i=s[0];i<num_list.length;i++)l.add(num_list[i]);break;
            case 3:for(int i=s[0];i<=s[1];i++) l.add(num_list[i]);break;
            case 4:for(int i=s[0];i<=s[1];i+=s[2]) l.add(num_list[i]);break;
        }
        int[]answer=new int[l.size()];
        for(int i=0;i<answer.length;i++) answer[i]=l.get(i);
        return answer;
    }
}
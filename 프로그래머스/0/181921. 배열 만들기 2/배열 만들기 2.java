import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> al = new ArrayList<>();
        String s="5";
        int[] wrong={-1};
        int size=0;
        if(5>r) return wrong;
        if(5<=r&&5>=l) al.add(Integer.parseInt(s));
        while(Integer.parseInt(s)<r){
            String sb=s;
            for(int i=s.length()-1;i>=0;i--){
                if(s.charAt(i)=='0'){
                    if(i==s.length()-1)s=s.substring(0,i)+'5';
                    else {
                        size=s.substring(i+1).length();
                        s=s.substring(0,i)+'5';
                        for(int j=0;j<size;j++) s+='0';
                    }
                    if(Integer.parseInt(s)>=l&&Integer.parseInt(s)<=r)al.add(Integer.parseInt(s));
                    break;
                }
            }
            if(sb.equals(s)){
                size=s.length();
                s="5";
                for(int i=0;i<size;i++)s+=0;
                if(Integer.parseInt(s)>=l&&Integer.parseInt(s)<=r) al.add(Integer.parseInt(s));
            } 
        }
        if(al.size()==0) return wrong;
        int[] answer=new int[al.size()];
        for(int i=0;i<al.size();i++) answer[i]=al.get(i);
        return answer;
    }
}
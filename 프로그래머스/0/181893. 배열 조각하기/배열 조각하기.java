import java.util.*;
class Solution {
    public int[] solution(int[] r, int[] q) {
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<r.length;i++)l.add(r[i]);
        for(int i=0;i<q.length;i++){
            if(i%2==0||i==0) {
                int n=l.size();
                for(int j=q[i]+1;j<n;j++)l.remove(q[i]+1);
            }
            else for(int j=0;j<q[i];j++) l.remove(0);
        }
        int[] n = new int[l.size()];
        for(int i=0;i<n.length;i++) n[i]=l.get(i);
        return n;
    }
}
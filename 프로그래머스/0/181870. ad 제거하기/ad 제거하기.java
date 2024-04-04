import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        List<String>l=new ArrayList<>();
        int k=0;
        for(int i=0;i<strArr.length;i++){
            for(int j=0;j<strArr[i].length()-1;j++) if(strArr[i].substring(j,j+2).equals("ad")) k=1;
            if(k==0)l.add(strArr[i]);
            k=0;
        }
        String[] r = new String[l.size()];
        for(int i=0;i<r.length;i++) r[i]=l.get(i);
        return r;
    }
}
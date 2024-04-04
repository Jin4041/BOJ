import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String>l=new ArrayList<>();
        for(int i=0;i<finished.length;i++) if(!finished[i])l.add(todo_list[i]);
        String[] r = new String[l.size()];
        for(int i=0;i<r.length;i++) r[i]=l.get(i);
        return r;
    }
}
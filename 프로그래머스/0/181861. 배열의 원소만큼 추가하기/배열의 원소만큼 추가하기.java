import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i];j++) l.add(arr[i]);
        }
        int[] r = new int[l.size()];
        for(int i=0;i<r.length;i++) r[i]=l.get(i);
        return r;
    }
}
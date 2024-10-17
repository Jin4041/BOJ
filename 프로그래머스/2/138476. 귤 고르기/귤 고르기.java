import java.util.*;
class Solution {
    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> h=new HashMap<>();
        for(int val:tangerine) h.put(val,h.getOrDefault(val,0)+1);
        Integer[] vals=h.values().toArray(new Integer[0]);
        Arrays.sort(vals);
        int i=vals.length-1;
        while(k>0){
            k-=vals[i];
            answer++;
            i--;
        }
        return answer;
    }
}
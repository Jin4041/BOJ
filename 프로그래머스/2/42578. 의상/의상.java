import java.util.HashMap;
import java.util.Set;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> hash=new HashMap<>();
        for(String[] arr : clothes) {
            if(hash.containsKey(arr[1]))
                hash.replace(arr[1],hash.get(arr[1])+1);
            else
                hash.put(arr[1],1);
        }
        Set<String> keys=hash.keySet();
        for(String str : keys) {
            answer *= hash.get(str)+1;
        }
        return answer-1;
    }
}
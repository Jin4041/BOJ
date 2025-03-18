import java.util.HashMap;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
         int answer=0, len=0;
        for(int i : number)
            len+=i;
        HashMap<String,Integer> hash = new HashMap<>();
        for(int i=0;i<want.length;i++)
                hash.put(want[i],number[i]);
        for(int i=0;i<discount.length-len+1;i++){
            for(int j=i;j<i+len;j++){
                if(!hash.containsKey(discount[j]))
                    break;
                else if (hash.get(discount[j])-1==0)
                    hash.remove(discount[j]);
                else
                    hash.replace(discount[j],hash.get(discount[j])-1);
            }
            if(hash.isEmpty()) {
                answer++;
                System.out.println("day"+(i+1));
            }
            hash.clear();
            for(int j=0;j<want.length;j++)
                hash.put(want[j],number[j]);
        }
        return answer;
    }
}
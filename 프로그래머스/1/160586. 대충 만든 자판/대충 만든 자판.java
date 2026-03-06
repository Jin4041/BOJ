import java.util.HashMap;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character,Integer> map=new HashMap<>();
        for(String s:keymap){
            for(int i=0;i<s.length();i++){
                map.merge(s.charAt(i),i+1,(oldValue,newValue)->(oldValue==null)? newValue:Math.min(oldValue,newValue));
            }
        }
        for(int j=0;j<targets.length;j++){
            for(int i=0;i<targets[j].length();i++){
                if(map.get(targets[j].charAt(i))==null){
                    answer[j]=-1;
                    break;
                }
                answer[j]+=map.get(targets[j].charAt(i));
            }
        }
        return answer;
    }
}
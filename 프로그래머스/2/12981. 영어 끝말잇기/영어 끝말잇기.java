class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        for(int i=1;i<words.length;i++){
            for(int j=0;j<i;j++){
                if(words[j].equals(words[i])||words[i].charAt(0)!=words[i-1].charAt(words[i-1].length()-1)){
                   answer[0] =(i+1) % n==0?n:(i+1)%n;
                        answer[1] = (i / n) % n > i ? i / n  : i / n+1;
                    return answer; 
                }
            }
        }
        return answer;
    }
}
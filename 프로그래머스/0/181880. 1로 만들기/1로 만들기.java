class Solution {
    public int solution(int[] n) {
        int answer = 0;
        for(int i=0;i<n.length;i++){
            while(n[i]!=1){
                if(n[i]%2==0) n[i]/=2;
                else n[i]=(n[i]-1)/2;
                answer++;
            }
        }
        return answer;
    }
}
class Solution {
    public int solution(int[][] b, int k) {
        int answer = 0;
        for(int i=0;i<b.length;i++) for(int j=0;j<b[i].length;j++) if(i+j<=k) answer+=b[i][j];
        
        return answer;
    }
}
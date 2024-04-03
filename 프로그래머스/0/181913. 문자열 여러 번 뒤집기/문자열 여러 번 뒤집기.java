class Solution {
    public String solution(String ms, int[][] queries) {
        String sub = "";
        for(int i=0;i<queries.length;i++){
            for(int j=queries[i][1];j>=queries[i][0];j--)sub+=ms.charAt(j);
            ms=ms.substring(0,queries[i][0])+sub+ms.substring(queries[i][1]+1);
            sub="";
        }
        return ms;
    }
}
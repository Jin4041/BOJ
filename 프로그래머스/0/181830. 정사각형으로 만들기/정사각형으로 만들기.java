class Solution {
    public int[][] solution(int[][] arr) {
        int side=0;
        if(arr.length>arr[0].length) side=arr.length; 
        else side=arr[0].length;
        int[][] answer = new int[side][side];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) answer[i][j]=arr[i][j];
        }
        return answer;
    }
}
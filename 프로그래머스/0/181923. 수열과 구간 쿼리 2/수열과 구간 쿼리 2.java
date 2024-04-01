class Solution {
    public int[] solution(int[] arr, int[][] q) {
        int[] answer = new int[q.length];
        int min=-1;
        for(int i=0;i<q.length;i++){
            for(int j=q[i][0];j<=q[i][1];j++){
                if (arr[j]>q[i][2]){
                    if(min==-1||min>arr[j])min=arr[j];
                }
                if(j==q[i][1]){
                    answer[i]=min;
                    min=-1;
                }
            }
        }
        return answer;
    }
}
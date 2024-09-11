class Solution {
    public int solution(int[] arr) {
        int answer = arr[0],num1,num2;
        for(int i=1;i<arr.length;i++){
            num1=answer;num2=arr[i];
            while(answer!=arr[i]){
                if(answer<arr[i])
                    answer+=num1;
                else
                    arr[i]+=num2;
            }
        }
        return answer;
    }
}
class Solution {
    public int[] solution(int[] arr) {
        int s=-1,e=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2) {s=i;break;}
        }
        if(s==-1){int[]a= {-1};return a;}
        else {
            for(int i=arr.length-1;i>=0;i--){
                if(arr[i]==2) {e=i;break;}
            }
        }
        int[] answer = new int[e-s+1];
        if(s==e) answer[0]=arr[s];
        else for(int i=s;i<=e;i++)answer[i-s]=arr[i];
        return answer;
    }
}
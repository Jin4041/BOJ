import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0,num;
        for(int i=0;i<citations.length-1;i++){
            for(int j=0;j<citations.length-1;j++){
                if(citations[j]<citations[j+1]){
                    num=citations[j];
                    citations[j]=citations[j+1];
                    citations[j+1]=num;
                }
            }
        }
        for(int i=0;i<citations.length;i++){
            if(citations[i]>=i+1)
                answer=i+1;
        }
        return answer;
    }
}
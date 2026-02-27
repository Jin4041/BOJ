import java.lang.Math;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] arrX=new int[10], arrY=new int[10];
        StringBuilder sb;
        for(char c : X.toCharArray()){
            arrX[c-'0']++;    
        }
        for(char c: Y.toCharArray()){
            arrY[c-'0']++;    
        }
        for(int i=9;i>=0;i--){
            if(arrX[i]!=0&&arrY[i]!=0){
                if(i==0&&answer.length()==0)
                    return "0";
                sb=new StringBuilder();
                sb.append(answer);
                for(int j=0;j<Math.min(arrX[i],arrY[i]);j++)
                    sb.append((char)(i+'0'));
                answer=sb.toString();
            }
        }
        return answer==""?"-1":answer;
    }
}
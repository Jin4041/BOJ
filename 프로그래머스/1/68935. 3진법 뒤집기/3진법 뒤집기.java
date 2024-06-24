import static java.lang.Math.*;
class Solution {
    public long solution(int n) {
        int num=1,i=0,fnum=0;
        long answer=0;
        String form="";
        while(num*3<=n) {
            num *= 3;
            i++;
        }
        for(;i>=0;i--){
            fnum=(int)pow(3,i);
            if(fnum*2<=n){
                n-=fnum*2;
                form+=2;
            }
            else if(fnum<=n){
                n-=fnum;
                form+=1;
            }
            else
                form+=0;
        }
        for(int j=0;j<form.length();j++) {
            answer += pow(3, j) * ((int) form.charAt(j)-48);
        }
        return answer;
}
}
//10자리부터 따로 설정 필요
class Solution {
    public int[] solution(long n) {
        String s=Long.toString(n);
        int len=s.length();
        int[] answer = new int[len];
        int i=0;
        int num=0;
        if(s.length()==11){
            String s1=s.substring(0,2);
            int n1=Integer.parseInt(s1);
            answer[len-2]=n1%10;
            answer[len-1]=n1/10;
            num=Integer.parseInt(s.substring(2));
            len-=2;
            }
        else if(s.length()==10){
            String s1=s.substring(0,1);
            answer[len-1]=Integer.parseInt(s1);
            num=Integer.parseInt(s.substring(1));
            len-=1;
        }
        else num=(int)n;
        while(len>i){
            answer[i]=(int)num%10;
            num/=10;
            i++;
        }
        return answer;
    }
}
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        char c;
        int count=0;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c=='(') count++;
            else if(c==')') count--;
            if (count<0){
                answer=false;
                break;
            }
                }
        if(count!=0) answer=false;
        return answer;
    }
}
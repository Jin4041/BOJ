class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1=Integer.toString(a);
        String b1=Integer.toString(b);
        String n1=a1+b1;
        String n2=b1+a1;
        if(Integer.parseInt(n1)>Integer.parseInt(n2)) answer=Integer.parseInt(n1);
        else answer=Integer.parseInt(n2);
        return answer;
    }
}
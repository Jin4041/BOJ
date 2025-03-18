class Solution {
    public long[] solution(int n, long left, long right) {
        long[] answer=new long[(int)(right-left+1)];
        int a=0;
        long n1,n2=0;
        for(long i=left;i<=right;i++){
            n1=i%n+1;n2=i/n+1;
            answer[a++]= Math.max(n1, n2);
        }
        return answer;
    }
}
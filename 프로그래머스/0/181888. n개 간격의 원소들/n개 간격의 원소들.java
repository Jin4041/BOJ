class Solution {
    public int[] solution(int[] num_list, int n) {
        int len=0;
        if(num_list.length%n==0) len=num_list.length/n;
        else len=(num_list.length/n) +1;
        int[] answer=new int[len];
        int i=0;
        int a=0;
        while(i<num_list.length){
            answer[a]=num_list[i];
            i+=n;
            a++;
        }
        return answer;
    }
}
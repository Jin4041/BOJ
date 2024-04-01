class Solution {
    public int solution(int[] num_list) {
        int sumS=0;
        int mul=1;
        for(int i=0;i<num_list.length;i++){
            sumS+=num_list[i];
            mul*=num_list[i];
        }
        sumS*=sumS;
        return sumS>mul? 1:0;
    }
}
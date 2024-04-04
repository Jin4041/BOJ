class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] r = new int[num_list.length-n+1];
        for(int i=0;i<r.length;i++)r[i]=num_list[n-1+i];
        return r;
    }
}
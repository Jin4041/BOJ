class Solution {
    int answer=0;
    public int solution(int[] wallet, int[] bill) {
        swap(wallet);swap(bill);
        if(bill[0]<=wallet[0]&&bill[1]<=wallet[1])
            return answer;
        else{
            answer+=1;
            return solution(wallet, new int[]{bill[1], bill[0]/2});
        }
    }
    public void swap(int[] array){
        if(array[0]<array[1]){
            int temp=array[1];
            array[1]=array[0];
            array[0]=temp;
        }
    }
}
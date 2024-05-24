import java.util.Arrays;
class Solution {
    public static int[] solution(int[] array, int[][] commands){
        int[] answer= new int[commands.length];
        for(int i=0;i<commands.length;i++){
            int[] temp=Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            quick(temp,0,temp.length-1);
            answer[i]=temp[commands[i][2]-1];
        }
        return answer;
    }

    public static void quick(int[] array, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(array, start, end);
            quick(array, start, pivotIndex - 1);
            quick(array, pivotIndex + 1, end);
        }
    }

    public static int partition(int[] array,int start, int end) {
        int left=start+1;
        int right=end;
        int pivot = array[start];

        while(left<=right){
            while(left<=end&&array[left]<=pivot)
                left++;
            while(right>=start&&array[right]>pivot)
                right--;
            if(left>right)
                break;
            swap(array,left, right);
        }
        swap(array,right,start);
        return right;
    }
    
    public static void swap(int[] array,int a, int b){
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
}

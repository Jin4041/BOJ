import java.util.Arrays;
class Solution {
    public static int[] solution(int[] array, int[][] commands){
        int[] answer= new int[commands.length];
        for(int i=0;i<commands.length;i++){
            int[] temp=Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            bubble(temp);
            answer[i]=temp[commands[i][2]-1];
        }
        return answer;
    }

     public static void bubble(int[] array){
        for(int j=0;j<array.length-1;j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array,i, i + 1);
                }

            }
        }
    }
    
    public static void swap(int[] array,int a, int b){
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
}
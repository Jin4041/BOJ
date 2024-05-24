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
        int pivot = array[start]; // 피벗을 배열의 첫 번째 요소로 선택
        int left = start + 1;
        int right = end;

        while (left <= right) {
            // 피벗보다 큰 값을 찾음
            while (left <= end && array[left] <= pivot)
                left++;
            // 피벗보다 작은 값을 찾음
            while (right >= start && array[right] > pivot)
                right--;
            // left와 right가 엇갈린 경우 종료
            if (left > right)
                break;
            // left와 right가 아직 엇갈리지 않았다면, 값을 교환
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        // 피벗과 right가 가리키는 값을 교환
        int temp = array[start];
        array[start] = array[right];
        array[right] = temp;
        // right의 인덱스 반환
        return right;
    }
}

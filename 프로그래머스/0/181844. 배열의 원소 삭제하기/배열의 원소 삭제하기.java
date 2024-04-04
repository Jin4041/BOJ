class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int count=arr.length;
        for(int i=0;i<delete_list.length;i++){
            for(int j=0;j<arr.length;j++) {
                if(delete_list[i]==arr[j]){
                    arr[j]=0;
                    count--;
                }
            }
        }
        int[] r = new int[count];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                r[j]=arr[i];
                j++;
            }
        }
        return r;
    }
}
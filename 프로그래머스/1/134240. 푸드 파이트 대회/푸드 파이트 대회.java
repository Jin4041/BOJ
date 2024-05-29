class Solution {
    public String solution(int[] food) {
        String answer = "";
        int[] foods=new int[food.length-1];
        for(int i=1;i<food.length;i++){
            foods[i-1]=food[i]/2;
        }
        for(int i=0;i<foods.length;i++){
            for(int j=0;j<foods[i];j++)
                answer+=i+1;
        }
        answer+=0;
        for(int i=foods.length-1;i>=0;i--){
            for(int j=0;j<foods[i];j++)
                answer+=i+1;
        }
        return answer;
    }
}
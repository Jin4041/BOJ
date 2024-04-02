class Solution {
    public int[] solution(String myString) {
        int[] answer = new int[myString.length()-myString.replace("x","").length()+1];
        int count=0;
        int a=0;
        for(int i=0;i<myString.length();i++){
            if(myString.charAt(i)=='x') {
                answer[a]=count;
                count=0;
                a++;
            }
            else if(i==myString.length()-1) answer[a]=count+1;
            else count++;
        }
        return answer;
    }
}
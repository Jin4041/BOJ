import java.lang.Math;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;
        int[] array=new int[number];
        for(int i=2;i<=number;i++){
            for(int j=1;j<=Math.sqrt(i);j++){
                if(j*j==i)
                    array[i-1]++;
                else if(i%j==0)
                    array[i-1]+=2;
            }
        }
        for(int i:array){
            if(i<=limit)
                answer+=i;
            else
                answer+=power;
        }
        return answer;
    }
}
import java.util.HashSet;
class Solution {
    public int solution(int[] elements) {
        int sum=0,num;
        HashSet<Integer>set=new HashSet<>();
        for(int i=1;i<=elements.length;i++){
            for(int j=0;j<elements.length;j++){
                num=j;
                for(int k=0;k<i;k++){
                    if(num>=elements.length)
                        num-=elements.length;
                    sum+=elements[num];
                    num++;
                }
                set.add(sum);
                sum=0;
            }
        }
        return set.size();
    }
}
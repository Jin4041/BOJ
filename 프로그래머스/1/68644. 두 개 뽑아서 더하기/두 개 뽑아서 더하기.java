import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
    
class Solution {
    public int[] solution(int[] numbers) {
        List <Integer> list=new ArrayList<>();
        boolean exist=false;
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]!=-1){
                for(int j=i+1;j<numbers.length;j++){
                    if(numbers[j]!=-1){
                        if(list.size()==0)
                            list.add(numbers[i]+numbers[j]);
                        else{
                            for(int k=0;k<list.size();k++)
                                if(numbers[i]+numbers[j]==list.get(k)){
                                    exist=true;
                                }
                            if(exist){
                                exist=false;
                                continue;
                            }
                            else
                                list.add(numbers[i]+numbers[j]);
                        }
                    }
                }
            }
        }
        list.sort(Comparator.naturalOrder());
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++)
            answer[i]=list.get(i);
        return answer;
    }
}
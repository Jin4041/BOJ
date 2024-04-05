import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String s=myStr.replaceAll("a"," ").replaceAll("b"," ").replaceAll("c"," ").replaceAll("\\s+",",");
        if(s.replaceAll(",","").equals("")) {
            String[] an={"EMPTY"};
            return an;
        }
        else {
            if(s.charAt(0)==',')s=s.replaceFirst(",","");
            String[] answer = s.split(",");
            return answer;
        }
       
    }
}
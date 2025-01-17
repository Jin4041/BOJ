import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer=0;
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            stack.clear();
            for(int j=0;j<s.length();j++) {
                char ch=s.charAt(j);
                if(ch=='('||ch=='{'||ch=='[')
                    stack.push(ch);
                else{
                    if(stack.isEmpty())
                        break;
                    char top=stack.pop();
                    if((ch==')'&&top!='(')||(ch=='}'&&top!='{')||(ch==']'&&top!='['))
                        break;
                    else if(j==s.length()-1&&stack.isEmpty())
                        answer++;
                }
            }
            s=s.substring(1) + s.charAt(0);
        }
       return answer;    
    }
}
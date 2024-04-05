class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int a=0;
        if(myString.equals(pat)) answer+=myString;
        else{
            for(int i=0;i<=myString.length()-pat.length();i++)
                if(myString.substring(i,i+pat.length()).equals(pat)) 
                    a=i;
        }
        answer+=myString.substring(0,a+pat.length());
        return answer;
    }
}
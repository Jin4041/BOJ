class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        for(int i=0;i<sb.length();i++){
            if(i==0&&sb.charAt(i)!=' ')
                answer+=Character.toUpperCase(sb.charAt(i));
            else
                answer+=Character.toLowerCase(sb.charAt(i));
            if(sb.charAt(i)==' '&&i+1<sb.length()&&sb.charAt(i+1)!=' '){
                answer+=Character.toUpperCase(sb.charAt(i+1));
                i++;
            }
        }
        
        return answer;
    }
}
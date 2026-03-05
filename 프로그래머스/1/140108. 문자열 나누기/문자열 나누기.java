class Solution {
    public int solution(String s) {
        int answer = 0,i=1, countX=1,countY=0;
        StringBuilder sb= new StringBuilder();
        char c;
        sb.append(s);
        c=sb.charAt(0);
        while(sb.length()>i){
            if(countX==countY){
                sb.delete(0,i);c=sb.charAt(0);answer++;
                i=1; countX=1;countY=0;continue;
            }
            else if(sb.charAt(i)==c){
                i++;countX++;continue;
            }else if(i+1==sb.length())
                return ++answer;
            else{
                countY++;i++;
            }
        }
        if(sb.length()!=0)
            answer++;
        return answer;
    }
}
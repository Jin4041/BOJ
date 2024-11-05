class Solution {
    public int solution(String s) {
        int answer = s.indexOf(0)=='-'?-Integer.parseInt(s.substring(1)):Integer.parseInt(s);
           return answer;
    }
}
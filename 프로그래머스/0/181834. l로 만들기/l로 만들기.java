class Solution {
    public String solution(String myString) {
        String r = "";
        for(int i=0;i<myString.length();i++){
            if((int)myString.charAt(i)<(int)('l')) r+='l';
            else r+=myString.charAt(i);
        }
        return r;
    }
}
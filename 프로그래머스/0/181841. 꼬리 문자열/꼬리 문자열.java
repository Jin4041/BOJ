class Solution {
    public String solution(String[] str_list, String ex) {
        String r = "";
        for(int i=0;i<str_list.length;i++){
            if(str_list[i].length()==str_list[i].replace(ex,"").length())r+=str_list[i];
        }
        return r;
    }
}
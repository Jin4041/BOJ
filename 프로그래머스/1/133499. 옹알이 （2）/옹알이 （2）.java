class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String before="";
        for(String str : babbling){
            while(str.length()>=1){
                    if(str.length()>=3 && (before.equals(str.substring(0,3)))||
                       (str.length()>=2 && before.equals(str.substring(0,2))))
                        break;
                    else if(str.length()>=3&&(str.substring(0,3).equals("aya")||str.substring(0,3).equals("woo"))){
                    if(str.length()==3){System.out.println("done");
                        answer++;break;
                    }else{
                        before=str.substring(0,3);
                        str=str.substring(3);
                    }
                }else if(str.length()>=2&&(str.substring(0,2).equals("ye")||str.substring(0,2).equals("ma"))){
                    if(str.length()==2){System.out.println("done");
                        answer++;break;
                    }else{
                        before=str.substring(0,2);
                        str=str.substring(2);
                    }
                }
                    else{
                        break;
                    }
                }
            before="";
            }
        return answer;
    }
}
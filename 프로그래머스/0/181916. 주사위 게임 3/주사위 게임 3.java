class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0, min=a,p=a,q=0,r=0,s=0;
        int[] ar={a,b,c,d};
        int[] counter={0,0,0};
        for(int i=0;i<4;i++){
            if(ar[i]==p) counter[0]++;
            else if(counter[1]==0||ar[i]==q){
                q=ar[i];
                counter[1]++;
            }
            else if(counter[2]==0||ar[i]==r){
                r=ar[i];
                counter[2]++;
            }
            if(min>ar[i]) min=ar[i];
        }
        if(counter[0]==4)answer=1111*p;
        else if(counter[0]==3)answer=(10*p+q)*(10*p+q);
        else if (counter[1]==3)answer=(10*q+p)*(10*q+p);
        else if(counter[0]==2&&counter[1]==2)answer=p>q?(p+q)*(p-q):(q+p)*(q-p);
        else if(counter[0]==counter[1]&&counter[1]==counter[2]) answer=min;
        else {
            if(counter[0]==2) answer=q*r;
            else if(counter[1]==2)answer=p*r;
            else answer=p*q;
        }
        return answer;
    }
}
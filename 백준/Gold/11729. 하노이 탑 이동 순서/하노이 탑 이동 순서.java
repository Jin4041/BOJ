import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;


//1) 하노이의 탑을 이동 횟수는 원판의 개수가 n개일 때 2^n-1번
//2) 수행 과정은 N개를 이동 시킬 때 n-1개 이동 후, 가장 밑판을 이동 후, 다시 n-1개를 옮김

public class Main {
    static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());//원판 개수 입력
        bw.write((int)(Math.pow(2,n)-1)+"\n");
        hanoi(n,1,2,3);
        
        br.close();
        bw.flush();
        bw.close();
    }
    public static void hanoi(int num, int start, int notGoal, int goal) throws IOException{//원판 개수, 시작 위치, 목표 위치
        if(num==1){
            bw.write(start+" "+goal+"\n");
            return;//원판이 하나라면 이동 시키고 종료
        }
        hanoi(num-1,start,goal,notGoal);//n-1를 처음 지점=>목표 지점이 아닌 곳 이동, 이동 완료(num이 1일 때)까지 재귀 호출
        bw.write(start+" "+goal+"\n");//가장 큰 원판을 목표 지점으로 이동
        hanoi(num-1,notGoal,start,goal);//n-1개를 이동 지점=>목표 지점 이동
    }
}

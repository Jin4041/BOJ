import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1) 입력 받은 n은 3^k이므로 재귀 함수로 3^1까지 쪼개서 해결
//2) 5번째(가운데)출력 시에는 공백을 출력함
//3) 좌표를 이용하며, 2차원 배열로 구현

public class Main {
    static char [][]b;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(br.readLine());//n 입력
        b=new char[n][n];

        box(n,0,0,false);//한 변의 길이 n, 좌표의 시작점(0,0), 가운데만 비었으므로 false

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sb.append(b[j][i]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
    public static void box(int n,int x, int y, boolean blank){//재귀 호출할 함수, n은 한 변의 길이, x와 y는 원점으로 이용될 좌표, blank는 공백의 공간인지 판별용
        if(blank) {
            for (int i = y; i < y + n; i++) {
                for (int j = x; j < x + n; j++) {
                    b[j][i] = ' ';
                }
            }
            return;//빈칸인 경우 아래 연산이 필요 없으므로 리턴
        }
        if(n==1){
            b[x][y]='*';
            return;
        }

        int size=n/3;//n이 총 길이 이므로, 현재 한 칸의 길이는 n/3
        int count=0;//5번째를 새어보기 위함
        for(int i=y;i<y+n;i+=size){//현재 좌표점을 기준으로 한 칸씩 판별하므로 size만큼 증가
            for(int j=x;j<x+n;j+=size){
                count++;
                box(size, j, i, count == 5);//현재 좌표에서 한 칸의 길이가 총 길이인 작은 박스로 쪼갠 후, 5번째 칸이라면 공백 처리
            }
        }
    }
}


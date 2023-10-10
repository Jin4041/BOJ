import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

//1) 창고의 가로, 세로를 입력 받아 2차원 배열 생성, 토마토는 하나 이상 반드시 존재
//2) 값 입력시 1인 경우 큐에 좌표를 저장
//3) 박스범위 내에서 비교하도록 제한
//4) 큐에서 처음 값 삭제 후 그 값의 상하좌우 비교

public class Main{
    static int m,n;//입력받을 가로, 세로
    static int days=0;// 소요일수
    static int[] dx={-1,1,0,0};//좌표가(x,y)일 때 좌(-1,0), 우(1,0), 전(0,-1), 후(0,1)계산용
    static int[] dy={0,0,-1,1};
    static int[][] tomato;//토마토 정보 저장용 2차원배열
    static Queue<int[]>q=new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt(); n= sc.nextInt(); 
        tomato=new int[m][n];//창고 생성
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                tomato[j][i]=sc.nextInt();
                if(tomato[j][i]==1) q.add(new int[ ]{j,i});
            }
        }
        System.out.println(bfs());
    }
    private static int bfs(){//너비 우선 탐색
        while(!q.isEmpty()){//큐가 비어있으면 익은 토마토가 없는 경우
            int[]t=q.poll();//t[0]=가로, t[1]=세로 좌표 저장
            int x=t[0], y=t[1];
            for(int i=0;i<4;i++){
                int nx=x+dx[i], ny=y+dy[i];
                if(nx<0||nx>m-1||ny<0||ny>n-1) continue;//범위를 벗어날 경우 패스
                if(tomato[nx][ny]==0){
                    tomato[nx][ny]=tomato[x][y]+1;//토마토가 익은 경우 기준좌표에 저장된 값에 +1하는 식으로 최종 값 계산
                    q.add(new int[]{nx,ny});//익은 토마토의 좌표를 큐에 저장
                }
            }
        }
        if(check()) return -1;
        else{
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(tomato[j][i]>days) days=tomato[j][i];
                }
            }
        }
        return days-1;//시작이 1(익음)이었으므로 -1계산
    }

    private static boolean check(){//모든 연산 후 익지 못한 토마토 확인
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(tomato[j][i]==0) return true;//연산이 끝난 후에 익지 못했으면 익을 수 없는 경우
            }
        }
        return false;//모두 익음
    }
}

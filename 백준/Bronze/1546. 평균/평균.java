import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        float max=0,sum=0;
        float[] score=new float[n];
        for(int i=0;i<score.length;i++) {
            score[i] = Integer.parseInt(sc.next());
            if(score[i]>max)
                max=score[i];
        }
        for(int i=0;i<score.length;i++){
            score[i]=score[i]/max*100;
            sum+=score[i];
        }
        System.out.println(sum/n);
    }
}

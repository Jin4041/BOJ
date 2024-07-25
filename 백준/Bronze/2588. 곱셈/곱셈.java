import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        b=sc.nextLine();
        int numA=Integer.parseInt(a), ans=0,c=1;
        int[] numB={Integer.parseInt(b.substring(2)),Integer.parseInt(b.substring(1,2)),Integer.parseInt(b.substring(0,1))};
        for(int i=0;i<numB.length;i++) {
            ans+=numB[i]*numA*c;
            c*=10;
            System.out.println(numB[i]*numA);
        }
        System.out.println(ans);
    }
}

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<3;j++){
                sum+=arr[i][j];
            }
            System.out.println(sum);
        }
    }
}

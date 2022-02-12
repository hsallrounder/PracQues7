import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    // We can solve the problem by modifying the BubbleSort Algo
    public void even_odd_arr(int[] a){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]%2!=0 && a[j+1]%2==0){
                    a[j]=a[j]^a[j+1];
                    a[j+1]=a[j]^a[j+1];
                    a[j]=a[j]^a[j+1];
                }
            }
        }
    }
    /* Another Method solve the question*/
//    public int[] even_odd_arr(int[] a){
//        int n=a.length;
//        int arr[]=new int[n];
//        int i=0,k=0;
//        while(i<n){
//            if(a[i]%2==0) {
//                arr[k]=a[i];
//                k++;
//            }
//            i++;
//        }
//        i=0;
//        while (i<n){
//            if(a[i]%2!=0){
//                arr[k]=a[i];
//                k++;
//            }
//            i++;
//        }
//        return arr;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        new Q4().even_odd_arr(arr);
        /*using another method
        arr=new Q4().even_odd_arr(arr);
         */
        System.out.println(Arrays.toString(arr));
    }
}

import java.util.Scanner;

public class Q3 {
    //Function to find the sum of array elements in recursive manner
    int sumOfArray(int[] a,int n){
        if(n==0) return 0;          //Base case to terminate the function.
        return sumOfArray(a,n-1)+a[n-1]; //Recursively calling the same function. {a[0]+.....+a[n-2]+a[n-1]}
    }
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
        System.out.println("Sum of the given array is: "+new Q3().sumOfArray(arr,n));
    }
}

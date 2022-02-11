import Pre_Requisites.*;

import java.util.Scanner;

public class Q2 {
    public SinglyLinkedList arrToLL(int[] a){
        SinglyLinkedList res=new SinglyLinkedList();
        if(a.length!=0){
            for(int i=0;i<a.length;i++){
                res.add(a[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        if(n!=0){
            System.out.print("Enter the values of array: ");
        }
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        SinglyLinkedList list=new Q2().arrToLL(arr);
        if(n!=0){
            System.out.print("Resultant Linked List: ");
        }
        list.display();
    }
}

import Pre_Requisites.SinglyLinkedList;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        SinglyLinkedList<Character> list=new SinglyLinkedList();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        list.display();
    }
}

package dsa;

import java.util.Scanner;

//node
//creating node for linked list
//it should contain val that need to store the value
// next reference node reference address
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {

    Node head;
    public void append(int data){
        if(head == null){
            head = new Node(data);
            head.next = null;
            System.out.println(data+ " : this data is inserted into the LinkedList at : 0");

            return;
        }
        Node newNode = new Node(data);
        Node temp=head;
        int pos=1;
        while(temp.next != null){
            pos++;
            temp=temp.next;
        }
        temp.next=newNode;
        System.out.println(data+ " : this data is inserted into the LinkedList at : "+pos);

    }


    //traverse the linked list
    public void traverse(){

        Node temp=head;
        do{
            System.out.println("printing data one by one : "+temp.data);
            temp=temp.next;

        }while(temp!= null);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the LinkedList");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the LinkedList");
        LinkedList list = new LinkedList();

        for (int i = 0; i < n; i++) {

            int data = sc.nextInt();
            list.append(data);

        }

        System.out.println("Printing values of the LinkedList");
        list.traverse();



    }


}



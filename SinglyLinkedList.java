import java.util.*;
class Main{
    class Node{
        int value;
        Node next;
            public Node(int a){
                value=a;
                next=null;
            }
    }
public Node head=null;
public Node tail=null;

    public void insert(int a){
        Node ll = new Node(a);
        if(head==null){
            head=ll;
            tail=ll;
        }
        else{
            //head=ll;
            //head.next=temp;
            tail.next=ll;
            tail=ll;
        }
    }
    public void display(){
        Node temp=head;
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        else{
            System.out.println("The elements are:");
            while(temp!=null){
                System.out.println(temp.value+" ");
                temp=temp.next;
            }
        }
    }
    public void delete(int data){
        Node curr = head.next;
        Node prev = head;
        if(head.value==data)
            head = head.next;
        else{
            while(curr!=null){
                if(curr.value==data){
                    if(tail.value==data){
                        tail=prev;
                        tail.next = null;
                        break;
                    }
                    prev.next = curr.next;
                    break;
                }
                prev = curr;
                curr=curr.next;
            }
        }
    }
    public static void main(String args[]){
        Main list = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of values:");
        int num = sc.nextInt();
        System.out.println("Enter the values:");
        for(int i=0;i<num;i++)
            list.insert(sc.nextInt());
        list.display();
        System.out.println("Enter the number to be deleted: ");
        int del = sc.nextInt();
        list.delete(del);
        list.display();
        sc.close();
    }
}


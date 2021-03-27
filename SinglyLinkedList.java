import java.util.*;
public class SinglyLinkedList{
    int value;
    SinglyLinkedList next;
    public SinglyLinkedList(int a){
        value=a;
        next=null;
    }
}
class Main{
    public SinglyLinkedList head=null;
    public SinglyLinkedList tail=null;
    public void insert(int a){
        SinglyLinkedList ll = new SinglyLinkedList(a);
        if(head==null){
            head=ll;
            tail=ll;
        }
        else{
            tail.next=ll;
            tail=ll;
        }
    }
    public void search(int a){
        SinglyLinkedList temp=head;
        if(head==null){
            System.out.println("List is Empty");
        }
        else{
            int f=0;
            while(temp!=null){
                if(temp.value==a){
                    f=1;
                    break;
                }
                temp=temp.next;
            }
            if(f==1)
                System.out.println("Element is found");
            else
                System.out.println("Element is NOT found");
        }
    }
    public void display(){
        SinglyLinkedList temp=head;
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
    public void insertsorted(int a){
        SinglyLinkedList temp=head;
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        else{
            while(temp!=null){
                if(temp.value>a){
                    temp.next.value=a;
                }
                temp=temp.next;
            }
        }
    }
    public void delete(int data){
        SinglyLinkedList curr = head.next;
        SinglyLinkedList prev = head;
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
        int ch=0;
        while(ch!=6){
            System.out.println("1.Create 2.Insert 3.Delete 4.Display 5.Search 6.Exit");
            System.out.println("Enter a choice:");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter the no of values:");
                int num = sc.nextInt();
                System.out.println("Enter the values:");
                for(int i=0;i<num;i++)
                    list.insert(sc.nextInt());
                break;
                case 2:
                    System.out.println("Insert a value:");
                    list.insert(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Enter the number to be deleted: ");
                    int del = sc.nextInt();
                    list.delete(del);
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    System.out.println("Enter the element to be searched:");
                    list.search(sc.nextInt());
                    break;
                case 6:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
        sc.close();
    }
}


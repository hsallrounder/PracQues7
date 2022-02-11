package Pre_Requisites;

public class SinglyLinkedList<T> implements LL<T>{
    private int size;
    NodeS<T> head;

    public NodeS getHead() {
        return head;
    }

    public SinglyLinkedList() {
        this.size=0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void add(T val){
        NodeS newnode = new NodeS(val);
        if(isEmpty()){
            head = newnode;
        }
        else {
            NodeS temp = head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next=newnode;
        }
        size++;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("List is Empty.");
        }
        else {
            NodeS temp=head;
            while(temp.next!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }
}

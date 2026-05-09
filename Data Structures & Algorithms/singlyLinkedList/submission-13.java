class LinkedList {
    class Node{
        int val;
        Node next;

        Node(){}

        Node(int val){
            this.val=val;
            this.next=null;    
        }
    }

    

    Node head;
    Node tail;
    int length;

    public LinkedList() {
        head=null;
        tail=head;
        length=0;
    }

    public int get(int index) {
        if(index>=length) return -1;
        Node temp=head;
        while(index>0){
            index--;
            temp=temp.next;
        }

        return temp.val;
    }

    public void insertHead(int val) {
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=head;
        }
        else {
            newNode.next=head;
            head=newNode;
        }
        length++;
    }

    public void insertTail(int val) {
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=head;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
        length++;
    }

    public boolean remove(int index) {
        if(index>=length) return false;

        if(index==0){
            head=head.next;
            if (head == null) tail = null;
            length--;
            return true;
        }
        Node temp=head;
        while(index>1){
            index--;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if(temp.next==null)tail=temp;
        length--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        Node temp=head;
        ArrayList<Integer> al=new ArrayList<>();
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        return al;
    }
}

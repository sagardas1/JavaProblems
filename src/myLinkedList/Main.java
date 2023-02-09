package myLinkedList;

class Node{
    int data;
    Node next;

}
public class Main{
    public static void main(String[] args) throws Exception {
        int a[]=new int[10];

        MyLinkedList myLinkedList=new MyLinkedList();
        Node root=null;
       root= myLinkedList.insert(root,10);
        root= myLinkedList.insert(root,20);
        root= myLinkedList.insert(root,30);
        root= myLinkedList.insert(root,40);
        System.out.println(root);

       myLinkedList.insertInMiddle(root,2,10);
        System.out.println(root);

        myLinkedList.insertinLast(root,90);

        System.out.println(root);

      root=  myLinkedList.insertAtFirst(root,1);
        System.out.println(root);

    }
}
 class MyLinkedList {
static int count;

     public Node insert(Node root, int i) {
         if(root==null){
           return  createNewNode(i);
         }else{
            root.next=insert(root.next,i);
         }
         return root;
     }

     private Node createNewNode(int i) {
         Node node=new Node();
         node.data=i;
         count+=1;
         return node;
     }

     public void insertInMiddle(Node root, int index, int value) throws Exception {
         if(index<=count){
             for(int i=0;i<index-1;i++){
                 root=root.next;
             }
             Node temp=root.next;//30,40
             Node node=new Node();
             node.data=value;
             node.next=temp;//value,30,40
             root.next=node;//10,20,value ,30,40
             count+=1;
         }else{throw new Exception();}


     }

     public void insertinLast(Node root, int value) {
         for(int i=0;i<count-1;i++){
             System.out.println(root.data);
             root=root.next;

         }

      Node   node=new Node();
         node.data=value;
         node.next=null;
       root.next=node;


         count+=1;
     }

     public Node insertAtFirst(Node root, int i) {
         Node node=new Node();
         node.data=i;
         node.next=root;
         return node;
     }
 }

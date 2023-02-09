package Example;

import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class MyStack {


    Queue q1=new PriorityQueue();
    Queue q2=new PriorityQueue();


    public void push(int i){
      q2.add(i);
      if(q1.isEmpty()){
          q1.add(q2.poll());
      }else{
          for(int k=0;k<q1.size();k++){
              q2.add(q1.poll());

          }
          for(int k=0;k<q2.size();k++){
              q1.add(q2.poll());

          }
      }

    }

    public int pop(){
        return (int) q1.poll();
    }
    public int top(){
        return (int) q1.peek();
    }

    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);myStack.push(5);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());System.out.println(myStack.pop());
        System.out.println(myStack.pop());System.out.println(myStack.pop());



    }
}

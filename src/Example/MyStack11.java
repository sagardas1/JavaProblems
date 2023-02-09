package Example;

import java.util.Stack;

class MyStackOr{

    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
int size=0;
    public void push(int value){
        if(stack1.size()==0){
            stack1.add(value);
            size+=1;
        }else {
            int k=stack1.size();
            for(int i=0;i<k;i++){
                stack2.add(stack1.pop());

            }
            stack1.add(value);
            int j=stack2.size();
            for(int i=0;i<j;i++){
                stack1.add(stack2.pop());

            }
            size+=1;
        }

    }


    public void pop(){
        System.out.println(stack1.pop());
        size-=1;
    }



}
public class MyStack11 {

    public static void main(String[] args) {
        MyStackOr myStackOr=new MyStackOr();
        myStackOr.push(10);
        myStackOr.push(1);
        myStackOr.push(33);
        myStackOr.push(22);
        myStackOr.push(99);
int sizzz=myStackOr.size;
        for(int i=0;i<sizzz;i++){
           myStackOr.pop();
        }


    }
}

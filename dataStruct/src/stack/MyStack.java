package stack;

public class MyStack {
    private int maxSize;

    //定义栈存储的数据格式
    private int[] stackArray;

    private int top=-1;

    public MyStack(int s){
        this.maxSize = s;
        stackArray = new int[this.maxSize];

    }

    public void push(int e ){
        top++;
        stackArray[top]=e;
    }

    public long pop(){
        return stackArray[top--];
    }

    public boolean isEmpty(){
        return  (top==-1);
    }


    public void showStack(){
        if(isEmpty()){
            System.out.println("栈空，没有数据。");
        }
        for (int i = top; i >=0 ; i--) {
            System.out.printf("stack[%d]=%d\n",i,stackArray[i]);
        }
    }
    public static void main(String[] args) {
        MyStack myStack = new MyStack(5);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.showStack();
    }
}

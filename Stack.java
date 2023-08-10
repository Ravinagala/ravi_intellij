package ravi_intellij;

interface Stack {
    void push(String value);
    String pop();
    int length();
}

class MyStack implements Stack{
    private String data[] = new String[10];
    private int top = 0;

    public void push(String value){
        data[top] = value;
        top++;
    }

    public String pop(){
        top--;
        return data[top];
    }

    public int length(){
        return top;
    }

    public void print(){
        for(int i = 0; i < top; i++){
            System.out.println(data[i]);
        }
    }
}

class UseMyStack{
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push("First");
        ms.push("Second");
        ms.print();
        System.out.println(ms.length());
        System.out.println(ms.pop());


    }
}




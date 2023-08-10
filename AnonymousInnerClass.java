package ravi_intellij;

interface Task {
    void process();
}

public class AnonymousInnerClass{
    public static void main(String[] args){
        Task t = new Task() {
            public void process(){
                System.out.println("Do the process");

            }
        };
        t.process();
        System.out.println(t.getClass());
    }

}

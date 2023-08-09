package ravi_intellij;

public class Person {
    protected String name, email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.email);

    }

    public void setEmail(String email) {
        this.email = email;
    }
}
    class Teacher extends Person{
        protected String subjects;
        public Teacher(String name, String email, String subjects){
            super(name, email);
            this.subjects = subjects;
        }

        @Override
        public void print(){
            super.print();
            System.out.println(this.subjects);
        }

        public void setSubjects(String subjects) {
            this.subjects = subjects;
        }

        public String getSubjects(){
            return this.subjects;
        }

        public static void main(String[] args){
            Person p = new Teacher("ravi","ravi@gmail.com","Java"); //upcasting
            if(p instanceof Teacher t){ // instanceof
                t.setSubjects("SQL,Java");
                System.out.println(p instanceof Teacher);
            }
            p.setEmail("nagalaravi@gmail.com");
            p.print();

            Teacher t = (Teacher)p; // Down casting explicitly

            Person p1 = new Person("srikanth","srikanth@gmail.com");
            p1.print();

        }
    }


class Student{
    int rollNo;
    String name;

    static String course;

    static void printStaticMethod(){
        System.out.println("Inside a static method");
    }

    void print(){
        System.out.println(rollNo + " " + name);
    }
}

public class staticKeyword {
    public static void main(String[] args) {
        
        Student st = new Student();
        st.rollNo = 101;
        st.name = "Himansh";

        st.print();
        Student.printStaticMethod();
    }
}

import java.sql.Date;

public class constructor {

    int id;
    String fName;
    String lName;
    double sal;
    Date date;

    void returnSomething(){
        System.out.println(id + " " + fName + " " + lName + "  " + sal + " " + date);
    }

    public static void main(String[] args) {
        constructor cn = new constructor();

        cn.returnSomething();
    }
}

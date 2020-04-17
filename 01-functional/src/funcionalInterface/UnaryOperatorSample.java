package funcionalInterface;

import java.util.function.UnaryOperator;

/**
 * Created by asus on 2019/12/14.
 */
public class UnaryOperatorSample {
    public static void main(String[] args) {

        UnaryOperator<Student> operator=(s)->{
            s.name="kobra";
            return s;
        };

        Student student=new Student();
        student.name="bita";

        operator.apply(student);

        System.out.println(student.name);



    }
}

package funcionalInterface;

import java.util.function.BinaryOperator;

/**
 * Created by asus on 2019/12/14.
 */
public class BinaryOperatorSample {
    public static void main(String[] args) {

        BinaryOperator<Student> binaryOperator=(s,u)->{
            s.name=s.name.concat(" "+u.name);

            return s;
        };

        Student student1=new Student();
        student1.name="bata";
        Student student2=new Student();
        student2.name="somaye";

        binaryOperator.apply(student1,student2);
        System.out.println(student1.name);




    }
}

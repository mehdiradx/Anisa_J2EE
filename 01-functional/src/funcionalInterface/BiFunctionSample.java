package funcionalInterface;

import java.util.function.BiFunction;

/**
 * Created by asus on 2019/12/14.
 */
public class BiFunctionSample {
    public static void main(String[] args) {


        BiFunction<Student,Student,Teacher> biFunction=(s,g)->{
            String name=s.name+" "+g.name;

            Teacher teacher=new Teacher();
            teacher.name=name;

            return teacher;

        };

        Student student1=new Student();
        student1.name="akbar";

        Student student2=new Student();
        student2.name="sara";

        Teacher teacher=biFunction.apply(student1,student2);

        System.out.println(teacher.name);




    }
}

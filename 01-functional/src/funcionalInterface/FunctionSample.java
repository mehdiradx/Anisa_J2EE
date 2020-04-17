package funcionalInterface;

import java.util.function.Function;

/**
 * Created by asus on 2019/12/14.
 */
public class FunctionSample {
    public static void main(String[] args) {

        Function<Student, Teacher> function = (s) -> {
//            String name = s.name;
            Teacher teacher=new Teacher();
            teacher.name=s.name;

            return teacher;
        };

        Student student=new Student();
        student.name="ramin";

        Teacher teacher=function.apply(student);
        System.out.println(teacher.name);





    }
}

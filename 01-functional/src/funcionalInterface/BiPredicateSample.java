package funcionalInterface;

import java.util.function.BiPredicate;

/**
 * Created by asus on 2019/12/14.
 */
public class BiPredicateSample {
    public static void main(String[] args) {

        BiPredicate<Student,Teacher> biPredicate=(x,y)->{
            if (x.name.equals(y.name))
                return true;

            return false;
        };

        Student student=new Student();
        student.name="hamid";
        Teacher teacher=new Teacher();
        teacher.name="hamid";

        System.out.println(biPredicate.test(student,teacher));



    }
}

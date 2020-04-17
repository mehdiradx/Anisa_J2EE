package funcionalInterface;

import java.util.function.Predicate;

/**
 * Created by asus on 2019/12/14.
 */
public class PredicateSample {
    public static void main(String[] args) {

        Predicate<Student> predicate=(s)->{
          if (s.name.equals("hamid"))
              return true;


            return false;
        };

        Student student=new Student();
        student.name="hamid";
        System.out.println(predicate.test(student));



    }
}

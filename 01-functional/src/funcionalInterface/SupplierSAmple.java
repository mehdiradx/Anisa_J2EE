package funcionalInterface;

import java.util.function.Supplier;

/**
 * Created by asus on 2019/12/14.
 */
public class SupplierSAmple {
    public static void main(String[] args) {


        Supplier<Student> studentSupplier=()->{
          return new Student();
        };


        Student  student=studentSupplier.get();
        student.exam();




    }

}

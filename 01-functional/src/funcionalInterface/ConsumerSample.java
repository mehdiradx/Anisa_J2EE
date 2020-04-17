package funcionalInterface;

import funcionalInterface.Student;

import java.util.function.Consumer;

/**
 * Created by asus on 2019/12/14.
 */
public class ConsumerSample {
    public static void main(String[] args) {

//        Student  student=new Student();


        Consumer<Student> studentConsumer=(student)->
        {
            student.exam();
        };

        Student  student=new Student();

        studentConsumer.accept(student);







    }
}

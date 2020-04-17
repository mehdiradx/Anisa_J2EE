package funcionalInterface;

import java.util.function.BiConsumer;

/**
 * Created by asus on 2019/12/14.
 */
public class BiConsumerSAmple {
    public static void main(String[] args) {

        BiConsumer<Student,Teacher> consumer=(x,y)->{
            System.out.println("student name is:"+x.name +
            " teacher name is:"+y.name);
        };

        Student student=new Student();
        Teacher teacher=new Teacher();


        consumer.accept(student,teacher);






    }
}

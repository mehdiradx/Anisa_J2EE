package Retention;
/**
 * Created by asus on 2019/08/02.
 */
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
//@Retention(RetentionPolicy.CLASS)
@Retention(RetentionPolicy.RUNTIME)
//@Retention(RetentionPolicy.SOURCE)
public @interface MyCustomAnnotation
{
    //some code
}

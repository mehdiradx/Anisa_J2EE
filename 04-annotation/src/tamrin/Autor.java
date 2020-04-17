package tamrin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by asus on 2019/08/02.
 */

//@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Autor {
    String firstName() default "amin";
    String lastName();
}

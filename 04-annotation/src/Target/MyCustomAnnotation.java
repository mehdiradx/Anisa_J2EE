package Target;

/**
 * Created by asus on 2019/08/02.
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = {ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR,
        ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.LOCAL_VARIABLE,
        ElementType.PACKAGE, ElementType.PARAMETER})
public @interface MyCustomAnnotation {
    //Some other code
}
import java.io.File;
/**
 * Created by asus on 2019/09/28.
 */
public class Sample3 {
    public static void main(String[] args) {
        File  file=new File("test.txt");
        long fileTool=file.length();
        System.out.println(fileTool);
        System.out.println(file.toString());
//        System.out.println(file.);
    }
}

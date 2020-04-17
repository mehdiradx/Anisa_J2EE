import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by asus on 2019/09/28.
 */
public class Sample1 {
    public static void main(String[] args) {

        try {
            FileReader reader=new FileReader("test.txt");
            int inp;
            while ((inp=reader.read()) != -1)
            {
                System.out.println((char)inp);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
